package com.hackathon.mahmai.adrash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.hackathon.mahmai.adrash.services.API;
import com.hackathon.mahmai.adrash.services.DriverModel;
import com.hackathon.mahmai.adrash.services.ServiceBuilder;

import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void openRegistration(View view) {
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
        finish();
    }

    public void onLogin(View view) {
        Map<String,String> credentials = new HashMap();
        credentials.put("username","0912412051");
        credentials.put("password","passmee");
        API loginService = ServiceBuilder.buildService(API.class);
        Call<DriverModel> login = loginService.userLogIn(credentials);
        login.enqueue(new Callback<DriverModel>() {
            @Override
            public void onResponse(Call<DriverModel> call, Response<DriverModel> response) {
                try{
                    if(response.isSuccessful()){
                        Toast.makeText(LoginActivity.this, "Successfully Loged in.", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }else {
                        Toast.makeText(LoginActivity.this, "Something went wrong.", Toast.LENGTH_SHORT).show();
                    }

                }catch (Exception ex){
                    //
                }
            }

            @Override
            public void onFailure(Call<DriverModel> call, Throwable t) {
                Toast.makeText(LoginActivity.this, "Something went wrong.", Toast.LENGTH_SHORT).show();
            }
        });
        Toast.makeText(this, "Successfuly Loged In.", Toast.LENGTH_SHORT).show();


    }
}
