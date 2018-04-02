package com.wzk.mylibrary.contract;

import com.wzk.mylibrary.base.BaseModel;
import com.wzk.mylibrary.base.BasePresenter;
import com.wzk.mylibrary.base.BaseView;
import com.wzk.mylibrary.bean.FirstBean;

import java.util.List;

import rx.Observable;

/**
 * Created by wangzhankai on 2018/2/22.
 */

public interface FirstContract {

    interface Model extends BaseModel {
        //请求获取数据
        Observable<List<FirstBean>> getListData(int size, int page);

    }
    interface View extends BaseView {
        //返回获取的数据
        void showListData(List<FirstBean> listData);
    }

    abstract static class Presenter extends BasePresenter<View,Model> {
        public abstract  void getFirstListDataRequest(int size,int page);
    }
}
