package com.example.wale.whalessupport.Utilities.Api.Classes;

import com.example.wale.whalessupport.Utilities.Api.Interfaces.ApiInterface;
import com.example.wale.whalessupport.Utilities.Api.Interfaces.LoginInterface;
import com.example.wale.whalessupport.Utilities.Api.Interfaces.SchoolsInterface;
import com.example.wale.whalessupport.Utilities.Api.Interfaces.SignUpInterface;
import com.example.wale.whalessupport.Utilities.Api.Models.Login;
import com.example.wale.whalessupport.Utilities.Api.Models.Schools;
import com.example.wale.whalessupport.Utilities.Api.Models.SignUp;

import io.reactivex.annotations.NonNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApiCalls implements ProgressRequestBody.UploadCallbacks {
    ApiInterface apiInterface;

public ApiCalls() {
        apiInterface = ApiClient.getClient().create(ApiInterface.class);
    }

public void singUp(String matric, String email, String password, String phone, String school_id, final SignUpInterface signUpInterface){
        try {
            Call<SignUp> call;
            call = apiInterface.singUp(email, matric, phone, school_id, password);
            call.enqueue(new Callback<SignUp>() {
                @Override
                public void onResponse(@NonNull Call<SignUp> call, @NonNull Response<SignUp> response) {
                    if (response.code() == 200 && response.body().getStatus() == 1) {
                        signUpInterface.success(response.body().getData());
                    }
                }

                @Override
                public void onFailure(@NonNull Call<SignUp> call, @NonNull Throwable t) {
                    signUpInterface.failure(t.getMessage());
                    call.cancel();
                }
            });
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

public void login(String matric, String email, String password, final LoginInterface logininterface){
        try {
            Call<Login> call;
            call = apiInterface.login(matric, email, password);
            call.enqueue(new Callback<Login>() {
                @Override
                public void onResponse(@NonNull Call<Login> call, @NonNull Response<Login> response) {
                    if (response.code() == 200 && response.body().getStatus() == 1) {
                        logininterface.success(response.body().getData());
                    }
                }

                @Override
                public void onFailure(@NonNull Call<Login> call, @NonNull Throwable t) {
                    logininterface.failure(t.getMessage());
                    call.cancel();
                }
            });
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

public void getSchools(final SchoolsInterface schoolsInterface){
        try {
            Call<Schools> call;
            call = apiInterface.auth();
            call.enqueue(new Callback<Schools>() {
                @Override
                public void onResponse(@NonNull Call<Schools> call, @NonNull Response<Schools> response) {
                    if (response.code() == 200 && response.body().getStatus() == 1) {
                        schoolsInterface.success(response.body().getData());
                    }
                }

                @Override
                public void onFailure(@NonNull Call<Schools> call, @NonNull Throwable t) {
                    schoolsInterface.failure(t.getMessage());
                    call.cancel();
                }
            });
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void onProgressUpdate(int percentage) {

    }

    @Override
    public void onError() {

    }

    @Override
    public void onFinish() {

    }
}