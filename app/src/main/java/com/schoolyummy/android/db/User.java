package com.schoolyummy.android.db;

import org.litepal.crud.DataSupport;
import org.litepal.crud.LitePalSupport;

/**
 * Created by DSHH on 2020/5/22.
 */

public class User extends LitePalSupport{
    private int id;

    private String userName;

    private String userPasswd;

    private String userTel;

    public int getId (){
        return  id;
    }
    public void setId(int id) { this.id=id; }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPasswd() {
        return userPasswd;
    }
    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }

    public String getUserTel() {
        return userTel;
    }
    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

}
