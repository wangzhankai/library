package com.wzk.mylibrary.testBean;

import java.util.List;

/**
 * Created by wangzhankai on 2018/3/19.
 */

public class BaseResult<T> {

    private boolean isError;
    private List<T> results;

    public boolean isError() {
        return isError;
    }

    public void setError(boolean error) {
        isError = error;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    public List<T> getResults() {
        return results;
    }
}
