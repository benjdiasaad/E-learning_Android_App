package com.example.courseapp.retrofit;

import com.example.courseapp.model.Category;
import com.example.courseapp.model.Course;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("category.json")
    Call<List<Category>> getAllCategory();

    @GET("course.json")
    Call<List<Course>> getCourseContent();

    // we need to make model class for our data
    // first have a look on json structure.

}