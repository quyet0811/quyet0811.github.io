package com.createuser.dto;


import java.io.Serializable;
import java.util.List;

public class AbtractDTO<T> implements Serializable {
    private static final long serialVersionUID = -5561333461268864332L;

    public List<T> getListResult() {
        return listResult;
    }

    public void setListResult(List<T> listResult) {
        this.listResult = listResult;
    }

    private List<T> listResult;

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    private int totalItems = 0;

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public String getSearchValue() {
        return searchValue;
    }

    private String searchValue;

}
