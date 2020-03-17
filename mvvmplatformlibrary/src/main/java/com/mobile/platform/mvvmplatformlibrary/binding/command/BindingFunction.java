package com.mobile.platform.mvvmplatformlibrary.binding.command;

/**
 * Represents a function with zero arguments.
 *
 * @param <T> the result type
 */
public interface BindingFunction<T> {
    T call();
}
