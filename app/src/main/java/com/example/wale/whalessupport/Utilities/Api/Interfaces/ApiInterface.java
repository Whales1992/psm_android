package com.example.wale.whalessupport.Utilities.Api.Interfaces;

import com.example.wale.whalessupport.Utilities.Api.Models.Login;
import com.example.wale.whalessupport.Utilities.Api.Models.Schools;
import com.example.wale.whalessupport.Utilities.Api.Models.SignUp;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {
    @FormUrlEncoded
    @GET("school/schools")
    Call<Schools> auth();

    @FormUrlEncoded
    @POST("student/login")
    Call<Login> login(@Field("matric") String matric, @Field("email") String email, @Field("password") String password);

    @FormUrlEncoded
    @POST("student/signup")
    Call<SignUp> singUp(@Field("email") String email, @Field("matric_number") String matric_number, @Field("phone") String phone,
                        @Field("school_id") String school_id, @Field("password") String password);

//    @FormUrlEncoded
//    @POST("v1/{operation}")
//    Call<Mute_chat> mute_chat(@Field("recipient_id") String recipient_id, @Field("chat_type") String chat_type, @Header("token") String token, @Path("operation") String operation);
//
//    @POST("messages/add")
//    Call<Send_message_model> send_message(@Body JsonObject data, @Header("token") String token);
//
//    @Multipart
//    @POST("messages/image")
//    Call<Default_model> upload_attachment(@Part MultipartBody.Part attachment, @Part("user_uid") RequestBody user_uid, @Header("token") String token);
//
//    @POST("transaction/send")
//    Call<Send_money_model> send_money(@Body JsonObject data, @Header("token") String token);
//
//    @POST("paycode/user/all")
//    Call<UserPaycodes> userPaycodes(@Body JsonObject data, @Header("token") String token);
//
//    @POST("contacts/user/getContacts")
//    Call<Contacts> contacts(@Body JsonObject data);
}