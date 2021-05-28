package com.www.entity;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class MauSac implements Serializable {

    private static final long serialVersionUID = 5333255286088237532L;
    @Column(name = "ten", nullable = false)
    @Nationalized
    private String ten;
    @Column(name = "ma_mau", nullable = false)
    private String maMau;

    public MauSac() {
    }

    public MauSac(String ten, String maMau) {
        this.ten = ten;
        this.maMau = maMau;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaMau() {
        return maMau;
    }

    public void setMaMau(String maMau) {
        this.maMau = maMau;
    }

    @Override
    public String toString() {
        return "MauSac{" +
                "ten='" + ten + '\'' +
                ", maMau='" + maMau + '\'' +
                '}';
    }
}
