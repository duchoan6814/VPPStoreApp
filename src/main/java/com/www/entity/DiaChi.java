package com.www.entity;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dia_chi")
public class DiaChi implements Serializable {
    private static final long serialVersionUID = -5694643530826830252L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "phuong_xa", nullable = false)
    @Nationalized
    private String phuongXa;

    @Column(name = "quan_huyen", nullable = false)
    @Nationalized
    private String quanHuyen;

    @Column(name = "tinh_thanh_pho", nullable = false)
    @Nationalized
    private String tinhThanhPho;

    @Column(name = "chi_tiet", nullable = false)
    @Nationalized
    private String chiTiet;

    @Column(name = "ten_nguoi_nhan", nullable = false)
    @Nationalized
    private String tenNguoiNhan;

    @Enumerated(EnumType.STRING)
    @Column(name = "label")
    @Nationalized
    private LableAddress lableAddress;

    @ManyToOne
    @JoinColumn(name = "nguoi_dung_id")
    private NguoiDung nguoiDung;

    public DiaChi() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhuongXa() {
        return phuongXa;
    }

    public void setPhuongXa(String phuongXa) {
        this.phuongXa = phuongXa;
    }

    public String getQuanHuyen() {
        return quanHuyen;
    }

    public void setQuanHuyen(String quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    public String getTinhThanhPho() {
        return tinhThanhPho;
    }

    public void setTinhThanhPho(String tinhThanhPho) {
        this.tinhThanhPho = tinhThanhPho;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }

    public String getTenNguoiNhan() {
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }

    public LableAddress getLableAddress() {
        return lableAddress;
    }

    public void setLableAddress(LableAddress lableAddress) {
        this.lableAddress = lableAddress;
    }

    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }
}
