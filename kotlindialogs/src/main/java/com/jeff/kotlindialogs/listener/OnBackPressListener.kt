package com.jeff.kotlindialogs.listener

import android.support.v7.app.AlertDialog

/**
 * author : Jeff  5899859876@qq.com
 * Github: https://github.com/Jay-YaoJie
 * Created :  2018-11-17.
 * description ：
 */
interface OnBackPressListener {
    abstract fun OnBackPress(alertDialog: AlertDialog)
}