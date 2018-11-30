package com.example.wale.whalessupport.Utilities.Api.Interfaces;

import com.example.wale.whalessupport.Utilities.Api.Models.Login;
import com.example.wale.whalessupport.Utilities.Api.Models.Schools;

import java.util.List;

public interface LoginInterface {
    void success(Login.DataBean res);
    void failure(String res);
}