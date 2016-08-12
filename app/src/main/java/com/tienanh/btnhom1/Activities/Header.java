package com.tienanh.btnhom1.Activities;

import android.widget.TextView;

/**
 * Created by Veteran Commander on 8/10/2016.
 */
public class Header  {
    public String userName;
    public String mota;


    public Header(String userName, String mota) {
        this.userName = userName;
        this.mota = mota;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getUserName() {
        return userName;
    }

    public String getMota() {
        return mota;
    }
}
