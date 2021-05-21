package com.www.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "chi_tiet_hoa_don")
public class ChiTietHoaDon implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "so_luong", nullable = false)
    private int soLuong;

    @ManyToOne
    @JoinColumn(name = "san_pham_id")
    private SanPham sanPham;

    @ManyToOne
    @JoinColumn(name = "hoa_don_id", nullable = true)
    private HoaDon hoaDon;

    @Column(name = "gia_ban", nullable = false)
    public double tinhGiaBan() {
        return 0;
    }

    public ChiTietHoaDon(int soLuong, SanPham sanPham) {
        this.soLuong = soLuong;
        this.sanPham = sanPham;
    }

    public ChiTietHoaDon() {
    }



    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }
}
