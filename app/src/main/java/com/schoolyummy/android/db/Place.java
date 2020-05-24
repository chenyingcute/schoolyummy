package com.schoolyummy.android.db;

import org.litepal.crud.DataSupport;
import org.litepal.crud.LitePalSupport;

import java.util.Date;

/**
 * Created by DSHH on 2020/5/22.
 */

public class Place extends LitePalSupport{
    private int id;

    private String placeName;

    private String placeAddr;

    private int placeCongestion;

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaceAddr() {
        return placeAddr;
    }

    public void setPlaceAddr(String placeAddr) {
        this.placeAddr = placeAddr;
    }


    public int getPlaceCongestion() {
        return placeCongestion;
    }

    public void setPlaceCongestion(int placeCongestion) {
        this.placeCongestion = placeCongestion;
    }



}
