package com.wzk.mylibrary.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.wzk.mylibrary.R;
import com.wzk.mylibrary.base.BaseFragment;
import com.wzk.mylibrary.base.baseadapter.BaseQuickAdapter;
import com.wzk.mylibrary.bean.FirstBean;
import com.wzk.mylibrary.contract.FirstContract;
import com.wzk.mylibrary.login.LoginActivity;
import com.wzk.mylibrary.model.FirstModel;
import com.wzk.mylibrary.presenter.FirstPresenter;
import com.wzk.mylibrary.view.refresh.RefreshLayout;

import java.util.List;

/**
 * Created by wangzhankai on 2018/2/22.
 */

public class FirstTabFragment extends BaseFragment<FirstPresenter, FirstModel> implements
        FirstContract.View, BaseQuickAdapter.RequestLoadMoreListener, RefreshLayout.RefreshLayoutDelegate {

    private int SIZE = 20;
    private static final int STARTPAGE = 1;

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
    public void showListData(List<FirstBean> listData) {

    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_first;
    }

    @Override
    public void initPresenter() {
        mPresenter.setVM(this, mModel);
    }

    @Override
    protected void initView(View rootView) {
        Button button = (Button) rootView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), LoginActivity.class));
            }
        });
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
}
