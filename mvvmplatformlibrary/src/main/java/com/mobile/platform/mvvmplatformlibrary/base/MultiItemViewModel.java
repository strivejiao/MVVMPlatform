package com.mobile.platform.mvvmplatformlibrary.base;


import androidx.annotation.NonNull;

/**
 * Create Author：jiaochenguang
 * Create Date：2020/01/25
 * Description：RecycleView多布局ItemViewModel是封装
 */

public class MultiItemViewModel<VM extends BaseViewModel> extends ItemViewModel<VM> {
    protected Object multiType;

    public Object getItemType() {
        return multiType;
    }

    public void multiItemType(@NonNull Object multiType) {
        this.multiType = multiType;
    }

    public MultiItemViewModel(@NonNull VM viewModel) {
        super(viewModel);
    }
}
