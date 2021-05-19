package com.www.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "HOA_DON")
public class HoaDon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "thoi_gian_lap", nullable = false)
    private Calendar thoiGianLap;

    @Column(name = "trang_thai", nullable = false)
    @Enumerated(EnumType.STRING)
    private TrangThai trangThai;

    @Column(name = "thoi_gian_giao")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "nguoi_dung_id", nullable = false)
    private NguoiDung nguoiDung;

    @Override
    public String toString() {
        return "HoaDon{" +
                "id='" + id + '\'' +
                ", thoiGianLap=" + thoiGianLap +
                ", trangThai=" + trangThai +
                ", date=" + date +
                ", nguoiDung=" + nguoiDung +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Calendar getThoiGianLap() {
        return thoiGianLap;
    }

    public void setThoiGianLap(Calendar thoiGianLap) {
        this.thoiGianLap = thoiGianLap;
    }

    public TrangThai getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(TrangThai trangThai) {
        this.trangThai = trangThai;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

    public HoaDon() {
    }

    public HoaDon(String id, Calendar thoiGianLap, TrangThai trangThai, Date date, NguoiDung nguoiDung) {
        this.id = id;
        this.thoiGianLap = thoiGianLap;
        this.trangThai = trangThai;
        this.date = date;
        this.nguoiDung = nguoiDung;
    }
}
