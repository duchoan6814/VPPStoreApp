package com.www.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mau_sac")
public class MauSac implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private SanPham sanPham;

    @Column(name = "ten", nullable = false)
    private String ten;
    @Column(name = "ma_mau", nullable = false)
    private String maMau;

    @Override
    public String toString() {
        return "MauSac{" +
                "sanPham=" + sanPham +
                ", ten='" + ten + '\'' +
                ", maMau='" + maMau + '\'' +
                '}';
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
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

    public MauSac() {
    }

    public MauSac(SanPham sanPham, String ten, String maMau) {
        this.sanPham = sanPham;
        this.ten = ten;
        this.maMau = maMau;
    }
}
