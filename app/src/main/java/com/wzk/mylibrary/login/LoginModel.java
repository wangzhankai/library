package com.wzk.mylibrary.login;

import com.wzk.mylibrary.api.Api;
import com.wzk.mylibrary.baserx.RxSchedulers;
import com.wzk.mylibrary.testBean.BaseBeanResult;

import java.util.LinkedHashMap;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by wangzhankai on 2018/3/5.
 */

public class LoginModel implements LoginContract.Model {
    /*@Override
    public Observable<LoginBean> login_other(String username, String password) {
        return Api.getInstance().service.login_other(username, password)
                .map(new Func1<LoginBean, LoginBean>() {
                    @Override
                    public LoginBean call(LoginBean loginBean) {
                        return null;
                    }
                });
    }*/

    /*@Override
    public Observable<List<BaseData>> login_others(String username, String password) {
        return Api.getInstance().service.login_others(username, password)
                .map(new Func1<List<BaseData>, List<BaseData>>() {
                    @Override
                    public List<BaseData> call(List<BaseData> baseData) {
                        return null;
                    }
                });
    }*/

    @Override
    public Observable<BaseBeanResult> getRemote(String url, LinkedHashMap<String, String> map) {
        return Api.getInstance().service.getRemote(url, map)
                .map(new Func1<BaseBeanResult, BaseBeanResult>() {
                    @Override
                    public BaseBeanResult call(BaseBeanResult baseBeanResult) {
                        return baseBeanResult;
                    }
                }).compose(RxSchedulers.<BaseBeanResult>io_main());
    }
//    @Override
//    public Observable<List<LoginBean>> login(String username, String password) {
//        return Api.getInstance().service.login(username,password)
////                .map(new Func1<LoginData, List<LoginBean>>() {
////                    @Override
////                    public List<LoginBean> call(LoginData loginData) {
////                        return loginData.getResults();
////                    }
////                }).compose(RxSchedulers.<List<LoginBean>>io_main());
//        .map(new Func1<LoginData, List<LoginBean>>() {
//            @Override
//            public List<LoginBean> call(LoginData loginData) {
//                return null;
//            }
//        })
//    }
}
