package com.example.lazyload;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RestApi {

    @FormUrlEncoded
    @POST("tec.php")
    Call<List<Tec>> fetchTecList(@Field("action") String action,
                                 @Field("page") int pageNumber,
                                 @Field("order_by") String orderBy,
                                 @Field("order_type") String orderType);
}
