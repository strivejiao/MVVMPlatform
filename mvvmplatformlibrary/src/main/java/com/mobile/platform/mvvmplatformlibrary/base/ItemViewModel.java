package com.mobile.platform.mvvmplatformlibrary.base;


import androidx.annotation.NonNull;

/**
 * ItemViewModel
 * Created by jiaochenguang on 2019/10/3.
 */

public class ItemViewModel<VM extends BaseViewModel> {
    protected VM viewModel;

    public ItemViewModel(@NonNull VM viewModel) {
        this.viewModel = viewModel;
    }
}
