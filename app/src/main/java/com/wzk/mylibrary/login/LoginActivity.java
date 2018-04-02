package com.wzk.mylibrary.login;

import android.util.Log;

import com.wzk.mylibrary.R;
import com.wzk.mylibrary.base.BaseActivity;
import com.wzk.mylibrary.base.baseadapter.BaseQuickAdapter;
import com.wzk.mylibrary.testBean.BaseBeanResult;
import com.wzk.mylibrary.view.refresh.RefreshLayout;

import java.util.LinkedHashMap;

/**
 * Created by wangzhankai on 2018/3/5.
 */

public class LoginActivity extends BaseActivity<LoginPresenter, LoginModel> implements
        LoginContract.View, BaseQuickAdapter.RequestLoadMoreListener, RefreshLayout.RefreshLayoutDelegate  {

    private LinkedHashMap<String, String> map;

    @Override
    public void showLoading(String title) {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void showErrorTip(String msg) {

    }


    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initPresenter() {
        mPresenter.setVM(this, mModel);
    }

    @Override
    public void initView() {
        map = new LinkedHashMap<>();
        map.put("s", "api/AppTmp/getAppStatus");
        map.put("os", "android");
        map.put("number", "7");
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
                mPresenter.getRemote("index.php",map);
//            }
//        }).start();
    }

    @Override
    public void onLoadMoreRequested() {

    }

    @Override
    public void onRefreshLayoutBeginRefreshing(RefreshLayout refreshLayout) {

    }

    @Override
    public boolean onRefreshLayoutBeginLoadingMore(RefreshLayout refreshLayout) {
        return false;
    }

    @Override
    public void showListData(BaseBeanResult listData) {
        Log.i("base",listData.toString());
    }
}
