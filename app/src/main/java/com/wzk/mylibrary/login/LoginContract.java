package com.wzk.mylibrary.login;

import com.wzk.mylibrary.base.BaseModel;
import com.wzk.mylibrary.base.BasePresenter;
import com.wzk.mylibrary.base.BaseView;
import com.wzk.mylibrary.testBean.BaseBeanResult;

import java.util.LinkedHashMap;

import rx.Observable;

/**
 * Created by wangzhankai on 2018/3/5.
 */

public interface LoginContract {

    interface Model extends BaseModel {
        //请求获取数据
//        Observable<List<LoginBean>> login(String username, String password);
//        Observable<LoginBean> login_other(String username, String password);
//        Observable<List<BaseData>> login_others(String username, String password);
        Observable<BaseBeanResult> getRemote(String url, LinkedHashMap<String, String> map);
    }
    interface View extends BaseView {
        //返回获取的数据
        void showListData(BaseBeanResult listData);
    }

    abstract static class Presenter extends BasePresenter<View,Model> {
        public abstract  void getRemote(String url, LinkedHashMap<String, String> map);
    }
}
