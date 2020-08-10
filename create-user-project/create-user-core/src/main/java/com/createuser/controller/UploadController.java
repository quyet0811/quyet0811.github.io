package com.createuser.controller;

import com.createuser.dto.UploadDTO;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UploadController {
    private final Logger logger = LoggerFactory.getLogger(UploadController.class);
    private static String UPLOAD_FOLDER = "D:\\SAVE\\create-user-project\\create-user-web\\src\\main\\webapp\\template\\images\\";
    /*MultipleActiveResultSets*//**//*=true*/
    @PostMapping("/upload/multi"/*, method = RequestMethod.POST*/)
    public ResponseEntity<?> uploadFileMulti(@RequestParam("files") MultipartFile[] uploadfiles){
        String uploadFileName = Arrays.stream(uploadfiles).map(x -> x.getOriginalFilename())
                .filter(x->!StringUtils.isEmpty(x)).collect(Collectors.joining(","));
        if (StringUtils.isEmpty(uploadFileName)) {
            return new ResponseEntity<>("please select a file!", HttpStatus.OK);
        }

        try {

            saveUploadedFiles(Arrays.asList(uploadfiles));

        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>("Successfully uploaded - "
                + uploadFileName, HttpStatus.OK);

    }
    @PostMapping("/upload/multi/model"/*, method = RequestMethod.POST*/)
    public ResponseEntity<?> multiUploadFileModel(@ModelAttribute UploadDTO model) {

        logger.debug("Multiple file upload! With UploadModel");

        try {

            saveUploadedFiles(Arrays.asList(model.getFiles()));

        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>("Successfully uploaded!", HttpStatus.OK);

    }

    private void saveUploadedFiles(List<MultipartFile> files) throws IOException {
        for(MultipartFile file: files){
            if(file.isEmpty()){
                System.out.println("Empty");
                continue;
            }else{
                System.out.println("NotEmpty");
            }

            byte[] bytes = file.getBytes();

            Path path = Paths.get(UPLOAD_FOLDER +file.getOriginalFilename());
            Files.write(path,bytes);
        }
    }
}
