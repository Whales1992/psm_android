package com.example.wale.whalessupport.Utilities.Api.Interfaces;

import com.example.wale.whalessupport.Utilities.Api.Models.Schools;

import java.util.List;

public interface SchoolsInterface {
    void success(List<Schools.DataBean> res);
    void failure(String res);
}