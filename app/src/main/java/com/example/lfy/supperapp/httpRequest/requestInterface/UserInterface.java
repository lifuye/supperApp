package com.example.lfy.supperapp.httpRequest.requestInterface;

import com.example.lfy.supperapp.httpRequest.returnModel.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by lfy on 2018/6/20.
 */

public interface UserInterface {

    @GET("user")
    Call<User> getUser(@Header("X_Action")String X_Action, @Query("UserName")String userName);

}
