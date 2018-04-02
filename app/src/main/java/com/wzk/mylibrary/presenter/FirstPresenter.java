package com.wzk.mylibrary.presenter;

import com.wzk.mylibrary.R;
import com.wzk.mylibrary.baserx.RxSubscriber;
import com.wzk.mylibrary.bean.FirstBean;
import com.wzk.mylibrary.contract.FirstContract;

import java.util.List;

/**
 * Created by wangzhankai on 2018/2/22.
 */

public class FirstPresenter extends FirstContract.Presenter{

    @Override
    public void getFirstListDataRequest(int size, int page) {

        mRxManage.add(mModel.getListData(size,page).subscribe(new RxSubscriber<List<FirstBean>>(mContext,false) {
            @Override
            public void onStart() {
                super.onStart();
                mView.showLoading(mContext.getString(R.string.loading));
            }
            @Override
            protected void _onNext(List<FirstBean> firstBeen) {
                mView.showListData(firstBeen);
                mView.stopLoading();
            }
            @Override
            protected void _onError(String message) {
                mView.showErrorTip(message);
            }
        }));
    }
}

