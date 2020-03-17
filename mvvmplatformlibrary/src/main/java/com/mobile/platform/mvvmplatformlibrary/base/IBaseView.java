package com.mobile.platform.mvvmplatformlibrary.base;

/**
 * Created by jiaochenguang on 2019/6/15.
 */

public interface IBaseView {
    /**
     * 初始化界面传递参数
     */
    void initParam();
    /**
     * 初始化数据
     */
    void initData();

    /**
     * 初始化界面观察者的监听
     */
    void initViewObservable();
}
