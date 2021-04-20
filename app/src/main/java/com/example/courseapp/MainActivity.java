package com.example.courseapp;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Callback;
import retrofit2.Response;
import android.os.Bundle;
import android.widget.Toast;

import com.example.courseapp.model.Category;
import com.example.courseapp.retrofit.ApiInterface;
import com.example.courseapp.retrofit.RetrofitClient;

import java.util.List;

import retrofit2.Call;

public class MainActivity extends AppCompatActivity {

    ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        apiInterface = RetrofitClient.getRetrofitClient().create(ApiInterface.class);

        Call<List<Category>> call = apiInterface.getAllCategory();

        call.enqueue(new Callback<List<Category>>() {
            @Override
            public void onResponse(Call<List<Category>> call, Response<List<Category>> response) {

                List<Category> categoryList = response.body();
                List<Category> categoryList1 = response.body();

            }

            @Override
            public void onFailure(Call<List<Category>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "No response from server", Toast.LENGTH_SHORT).show();
            }
        });
    }
}