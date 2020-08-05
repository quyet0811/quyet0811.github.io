package com.createuser.controller;

import com.createuser.dto.UploadDTO;
import com.createuser.dto.UserDTO;
import com.createuser.entity.UserEntity;
import com.createuser.service.IUserService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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

@Controller
public class UploadController {
    private final Logger logger = LoggerFactory.getLogger(UploadController.class);

    private static String UPLOAD_FOLDER = "/images/";

    @RequestMapping(value = "/web/upload/multi", method = RequestMethod.POST)
    public ResponseEntity <?> uploadFileMulti(@RequestParam("extraField") String extraField,
                                              @RequestParam("files") MultipartFile[] uploadfiles){
        String uploadFileName = Arrays.stream(uploadfiles).map(x -> x.getOriginalFilename())
                .filter(x->!StringUtils.isEmpty(x)).collect(Collectors.joining(","));
        if (StringUtils.isEmpty(uploadFileName)) {
            return new ResponseEntity("please select a file!", HttpStatus.OK);
        }

        try {

            saveUploadedFiles(Arrays.asList(uploadfiles));

        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity("Successfully uploaded - "
                + uploadFileName, HttpStatus.OK);

    }
    @RequestMapping( value = "/web/upload/multi/model", method = RequestMethod.POST)
    public ResponseEntity<?> multiUploadFileModel(@ModelAttribute UploadDTO model) {

        logger.debug("Multiple file upload! With UploadModel");

        try {

            saveUploadedFiles(Arrays.asList(model.getFiles()));

        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity("Successfully uploaded!", HttpStatus.OK);

    }

    private void saveUploadedFiles(List<MultipartFile> asList) throws IOException {
        for(MultipartFile file: asList){
            if(asList.isEmpty()){
                continue;
            }

            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOAD_FOLDER+file.getOriginalFilename());
            Files.write(path,bytes);
        }
    }
}
