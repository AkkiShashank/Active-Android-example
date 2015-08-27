package com.test.mandap.activeandroidtest.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Shashank Gupta on 27-Aug-15.
 */

@Table(name="shashank")
public class LatLng extends Model {

    @Column(name = "lat")
    public Double latititude;

    @Column(name="lng")
    public Double longitude;

    public LatLng(){
        super();
    }
    public LatLng(double latititude, double longitude){
        super();
        this.latititude=latititude;
        this.longitude=longitude;
    }
}
