package com.vansuzy.model;

import java.io.Serializable;

/**
 * Created by keeps on 4/20/2017.
 */

public class DanhBa implements Serializable {   // implements Serializable cho phép mã hóa đối tượng này, cho phép đối tượng chuyển dữ liệu qua lại giữa các màn hình trong Intent
    private int ma;
    private String ten;
    private String phone;

    public DanhBa() {
    }

    public DanhBa(int ma, String ten, String phone) {

        this.ma = ma;
        this.ten = ten;
        this.phone = phone;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
