package com.example.junhyeong.myapplication.Main;

import android.graphics.drawable.Drawable;

/**
 * Created by jin on 2017-08-15.
 */

public class ListViewItem {
    private Drawable iconDrawable ;
    private String titleStr ;
    private Drawable Bow;


    public void setIcon(Drawable icon) {
        iconDrawable = icon ;
    }
    public void setTitle(String title) {
        titleStr = title ;
    }
    public void setIv(Drawable bow) {
        Bow = bow ;
    }


    public Drawable getIcon() {
        return this.iconDrawable ;
    }
    public String getTitle() {
        return this.titleStr ;
    }
    public Drawable getBow() {
        return this.Bow ;
    }


}
