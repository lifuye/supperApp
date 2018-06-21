package com.example.lfy.supperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lfy.supperapp.common.BaseCompatActivity;
import com.example.lfy.supperapp.common.PropertiesUtil;
import com.example.lfy.supperapp.httpRequest.requestInterface.UserInterface;
import com.example.lfy.supperapp.httpRequest.returnModel.User;

import java.util.Properties;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BehaviorActivity extends BaseCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behavior);
        getUser();
    }

    private void getUser(){
        Retrofit retrofit = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl((String) properties.get("serverUrl"))
             .build();
        UserInterface userInterface = retrofit.create(UserInterface.class);
        Call<User> user = userInterface.getUser("", "");
        user.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                response.body().toString();
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });


    }
}
