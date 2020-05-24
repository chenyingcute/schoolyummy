package com.schoolyummy.android.db;

import org.litepal.crud.DataSupport;
import org.litepal.crud.LitePalSupport;

import java.util.Date;

/**
 * Created by DSHH on 2020/5/22.
 */

public class Comment extends LitePalSupport{
    private int id;
    private User userName;
    private Place placeName;
    private Date comTime;
    private int score;
    private int price;
    private String comment;
    private byte[] commImage;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUserName() {
        return userName;
    }

    public void setUserName(User userName) {
        this.userName = userName;
    }
    public Place getPlaceName() {
        return placeName;
    }

    public void setPlaceName(Place placeName) {
        this.placeName = placeName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }




    public Date getComTime() {
        return comTime;
    }

    public void setComTime(Date comTime) {
        this.comTime = comTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public byte[] getCommImage() {
        return commImage;
    }

    public void setCommImage(byte[] commImage) {
        this.commImage = commImage;
    }


}
