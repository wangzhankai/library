package com.wzk.mylibrary.model;

import com.wzk.mylibrary.api.Api;
import com.wzk.mylibrary.baserx.RxSchedulers;
import com.wzk.mylibrary.bean.FirstBean;
import com.wzk.mylibrary.bean.GirlData;
import com.wzk.mylibrary.contract.FirstContract;

import java.util.List;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by wangzhankai on 2018/2/22.
 */

public class FirstModel implements FirstContract.Model {
    @Override
    public Observable<List<FirstBean>> getListData(int size, int page) {

        return Api.getInstance().service.getListData(size,page)
                .map(new Func1<GirlData, List<FirstBean>>() {
                    @Override
                    public List<FirstBean> call(GirlData girlData) {
                        return girlData.getResults();
                    }
                }).compose(RxSchedulers.<List<FirstBean>>io_main());
    }
}