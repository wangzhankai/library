package com.wzk.mylibrary.api;

import com.wzk.mylibrary.bean.GirlData;
import com.wzk.mylibrary.login.LoginBean;
import com.wzk.mylibrary.login.LoginData;
import com.wzk.mylibrary.testBean.BaseBeanResult;
import com.wzk.mylibrary.testBean.BaseData;

import java.util.LinkedHashMap;
import java.util.List;

import retrofit2.http.*;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by wangzhankai on 2018/2/7.
 */

public interface ApiService {

    @GET("data/福利/{size}/{page}")
    Observable<GirlData> getListData(
//            @Header("Cache-Control") String cacheControl,
            @Path("size") int size,
            @Path("page") int page);

    @GET("data/login")
    Observable<LoginData> login(
            @Path("username") String username,
            @Path("password") String password);

    @GET("data/login")
    Observable<LoginBean> login_other(
            @Path("username") String username,
            @Path("password") String password);

    @GET("data/login")
    Observable<List<BaseData>> login_others(
            @Path("username") String username,
            @Path("password") String password);

    @GET
    Observable<BaseBeanResult> getRemote(@Url String url, @QueryMap LinkedHashMap<String, String> map);

}
