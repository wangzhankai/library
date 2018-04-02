package com.wzk.mylibrary.login;

import java.util.List;

/**
 * Created by wangzhankai on 2018/3/5.
 */

public class LoginData {

    private boolean isError;
    private List<LoginBean> results;

    public boolean isError() {
        return isError;
    }

    public void setError(boolean error) {
        isError = error;
    }

    public void setResults(List<LoginBean> results) {
        this.results = results;
    }

    public List<LoginBean> getResults() {
        return results;
    }
}
