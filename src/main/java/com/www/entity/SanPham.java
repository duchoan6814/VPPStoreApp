package com.www.entity;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Set;

@Entity
@Table(name = "san_pham")
public class SanPham implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "ten", nullable = false)
    @Nationalized
    private String ten;

    @Column(name = "thuong_hieu", nullable = true)
    @Nationalized
    private String thuongHieu;

    @Column(name = "gia", nullable = false)
    private double gia;

    @Column(name = "mo_ta")
    @Nationalized
    private String moTa;

    @Lob
    @Column(name = "anhDaiDien")
    private byte[] anhDaiDien;

    @Lob
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "hinh_anh", joinColumns = @JoinColumn(name = "id"))
    private Set<byte[]> listHinh;


    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "chi_tiet", joinColumns = @JoinColumn(name = "san_pham_id"))
    private Set<ChiTiet> chiTiets;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "mau_sac", joinColumns = @JoinColumn(name = "san_pham_id"))
    private Set<MauSac> mauSacs;

    @ManyToOne
    @JoinColumn(name = "the_loai_id", nullable = false)
    private TheLoai theLoai;

    @Column(name = "so_luong_ton", nullable = false)
    private int soLuongTon;

    @OneToMany(mappedBy = "sanPham")
    private Set<ChiTietHoaDon> chiTietHoaDons;

    public SanPham() {
    }

    public SanPham(long id, String ten, String thuongHieu, double gia, String moTa, byte[] anhDaiDien, Set<byte[]> listHinh, Set<ChiTiet> chiTiets, Set<MauSac> mauSacs, TheLoai theLoai, int soLuongTon, Set<ChiTietHoaDon> chiTietHoaDons) {
        this.id = id;
        this.ten = ten;
        this.thuongHieu = thuongHieu;
        this.gia = gia;
        this.moTa = moTa;
        this.anhDaiDien = anhDaiDien;
        this.listHinh = listHinh;
        this.chiTiets = chiTiets;
        this.mauSacs = mauSacs;
        this.theLoai = theLoai;
        this.soLuongTon = soLuongTon;
        this.chiTietHoaDons = chiTietHoaDons;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public byte[] getAnhDaiDien() {
        return anhDaiDien;
    }

    public void setAnhDaiDien(byte[] anhDaiDien) {
        this.anhDaiDien = anhDaiDien;
    }

    public Set<byte[]> getListHinh() {
        return listHinh;
    }

    public void setListHinh(Set<byte[]> listHinh) {
        this.listHinh = listHinh;
    }

    public Set<ChiTiet> getChiTiets() {
        return chiTiets;
    }

    public void setChiTiets(Set<ChiTiet> chiTiets) {
        this.chiTiets = chiTiets;
    }

    public Set<MauSac> getMauSacs() {
        return mauSacs;
    }

    public void setMauSacs(Set<MauSac> mauSacs) {
        this.mauSacs = mauSacs;
    }

    public TheLoai getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(TheLoai theLoai) {
        this.theLoai = theLoai;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public Set<ChiTietHoaDon> getChiTietHoaDons() {
        return chiTietHoaDons;
    }

    public void setChiTietHoaDons(Set<ChiTietHoaDon> chiTietHoaDons) {
        this.chiTietHoaDons = chiTietHoaDons;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", thuongHieu='" + thuongHieu + '\'' +
                ", gia=" + gia +
                ", moTa='" + moTa + '\'' +
                ", anhDaiDien=" + Arrays.toString(anhDaiDien) +
                ", listHinh=" + listHinh +
                ", chiTiets=" + chiTiets +
                ", mauSacs=" + mauSacs +
                ", theLoai=" + theLoai +
                ", soLuongTon=" + soLuongTon +
                ", chiTietHoaDons=" + chiTietHoaDons +
                '}';
    }
}
