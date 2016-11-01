package vn.udn.dut.c.model.bean;

/**
 * Created by vuongluis on 01/11/2016.
 */

import java.sql.Time;
import java.util.Date;

public class User {

    private String name;
    private String logo;
    private String phone;
    private String address;
    private String sex;
    private String date;

    public User() {
    }

    public User(String name,String logo, String phone, String address, String sex, String date) {
        this.name = name;
        this.logo = logo;
        this.phone = phone;
        this.address = address;
        this.sex = sex;
        this.date = date;
    }

    public String getLogo() {
        return logo;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getSex() {
        return sex;
    }

    public String getDate() {
        return date;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
