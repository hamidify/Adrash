package com.hackathon.mahmai.adrash.services;

import com.hackathon.mahmai.adrash.models.DriverModel;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface API {
    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @POST("drivers/login")
    Call<DriverModel> userLogIn(@Body Map<String, String> requestBody);

}
