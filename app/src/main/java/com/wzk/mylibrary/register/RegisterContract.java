package com.wzk.mylibrary.register;

import com.wzk.mylibrary.base.BaseModel;
import com.wzk.mylibrary.base.BasePresenter;
import com.wzk.mylibrary.base.BaseView;

/**
 * Created by wangzhankai on 2018/3/5.
 */

public interface RegisterContract {

    interface Model extends BaseModel {

    }

    interface View extends BaseView {

    }

    abstract static class Presenter extends BasePresenter<RegisterContract.View, RegisterContract.Model> {

    }
}
