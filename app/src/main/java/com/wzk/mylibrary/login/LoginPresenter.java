package com.wzk.mylibrary.login;

import com.wzk.mylibrary.R;
import com.wzk.mylibrary.baserx.RxSubscriber;
import com.wzk.mylibrary.testBean.BaseBeanResult;

import java.util.LinkedHashMap;

/**
 * Created by wangzhankai on 2018/3/5.
 */

public class LoginPresenter extends LoginContract.Presenter {
    /*@Override
    public void getLoginListDataRequest(String username, String password) {
        mRxManage.add(mModel.login(username,password).subscribe(new RxSubscriber<List<LoginBean>>(mContext,false) {
            @Override
            public void onStart() {
                super.onStart();
                mView.showLoading(mContext.getString(R.string.loading));
            }
            @Override
            protected void _onNext(List<LoginBean> loginBeen) {
                mView.showListData(loginBeen);
                mView.stopLoading();
            }
            @Override
            protected void _onError(String message) {
                mView.showErrorTip(message);
            }
        }));
    }*/

    @Override
    public void getRemote(String url, LinkedHashMap<String, String> map) {
        mRxManage.add(mModel.getRemote(url, map).subscribe(new RxSubscriber<BaseBeanResult>(mContext, false) {

            @Override
            public void onStart() {
                super.onStart();
                mView.showLoading(mContext.getString(R.string.loading));
            }

            @Override
            protected void _onNext(BaseBeanResult baseBeanResult) {
                mView.showListData(baseBeanResult);
                mView.stopLoading();
            }

            @Override
            protected void _onError(String message) {
                mView.showErrorTip(message);
            }
        }));
    }
}
