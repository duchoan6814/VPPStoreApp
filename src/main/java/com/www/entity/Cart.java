package com.www.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "gio_hang")
public class Cart implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name = "nguoi_dung_id", nullable = false)
    private NguoiDung nguoiDung;

    @OneToMany(mappedBy = "cart")
    private Set<ChiTietHoaDon> chiTietHoaDons;

    public Cart(Set<ChiTietHoaDon> chiTietHoaDons) {
        this.chiTietHoaDons = chiTietHoaDons;
    }

    public Cart() {
    }

    public Set<ChiTietHoaDon> getChiTietHoaDons() {
        return chiTietHoaDons;
    }

    public void setChiTietHoaDons(Set<ChiTietHoaDon> chiTietHoaDons) {
        this.chiTietHoaDons = chiTietHoaDons;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "chiTietHoaDons=" + chiTietHoaDons +
                '}';
    }
}
