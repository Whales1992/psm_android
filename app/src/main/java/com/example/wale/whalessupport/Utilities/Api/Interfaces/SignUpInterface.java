package com.example.wale.whalessupport.Utilities.Api.Interfaces;

import com.example.wale.whalessupport.Utilities.Api.Models.SignUp;

public interface SignUpInterface {
    void success(SignUp.DataBean res);
    void failure(String res);
}