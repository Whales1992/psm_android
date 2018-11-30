package com.example.wale.whalessupport.Utilities.Api.Classes;

import com.example.wale.whalessupport.Utilities.Requests;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    static Retrofit getClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().readTimeout(240, TimeUnit.SECONDS).connectTimeout(240, TimeUnit.SECONDS).addInterceptor(interceptor).build();

        return new Retrofit.Builder()
                .baseUrl(Requests.api)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }
}