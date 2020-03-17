package com.mobile.platform.mvvmplatformlibrary.binding.viewadapter.viewgroup;

import androidx.databinding.ViewDataBinding;

/**
 * Created by jiaochenguang on 2019/6/16.
 */


public interface IBindingItemViewModel<V extends ViewDataBinding> {
    void injecDataBinding(V binding);
}
