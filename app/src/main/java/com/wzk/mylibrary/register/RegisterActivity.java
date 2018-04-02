package com.wzk.mylibrary.register;

import com.wzk.mylibrary.base.BaseActivity;
import com.wzk.mylibrary.base.baseadapter.BaseQuickAdapter;
import com.wzk.mylibrary.view.refresh.RefreshLayout;

/**
 * Created by wangzhankai on 2018/3/5.
 */

public class RegisterActivity extends BaseActivity<RegisterPresenter, RegisterModel> implements
        RegisterContract.View,BaseQuickAdapter.RequestLoadMoreListener,RefreshLayout.RefreshLayoutDelegate{

        @Override
        public void showLoading(String title){

        }

        @Override
        public void stopLoading(){

        }

        @Override
        public void showErrorTip(String msg){

        }

        @Override
        public int getLayoutId(){
        return 0;
        }

        @Override
        public void initPresenter(){

        }

        @Override
        public void initView(){

        }

        @Override
        public void onLoadMoreRequested(){

        }

        @Override
        public void onRefreshLayoutBeginRefreshing(RefreshLayout refreshLayout){

        }

        @Override
        public boolean onRefreshLayoutBeginLoadingMore(RefreshLayout refreshLayout){
                return false;
        }

}
