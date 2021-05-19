package com.www.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "san_pham")
public class SanPham implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "ten", nullable = false)
    private String ten;

    @Column(name = "thuong_hieu", nullable = true)
    private String thuongHieu;

    @Column(name = "gia", nullable = false)
    private double gia;

    @Column(name = "mo_ta")
    private String moTa;

    @ElementCollection
    @CollectionTable(name = "hinh_anh", joinColumns = @JoinColumn(name = "id"))
    private Set<String> listHinh;

    @OneToMany(mappedBy = "sanPham")
    private Set<ChiTiet> chiTiets;

    @OneToMany(mappedBy = "sanPham")
    private Set<MauSac> mauSacs;

    @ManyToOne
    @JoinColumn(name = "the_loai_id", nullable = false)
    private TheLoai theLoai;

    @Column(name = "so_luong_ton", nullable = false)
    private int soLuongTon;

    @OneToMany(mappedBy = "sanPham")
    private Set<ChiTietHoaDon> chiTietHoaDons;

    public SanPham(String id, String ten, String thuongHieu, double gia, String moTa, Set<String> listHinh, Set<ChiTiet> chiTiets, Set<MauSac> mauSacs, TheLoai theLoai, int soLuongTon) {
        this.id = id;
        this.ten = ten;
        this.thuongHieu = thuongHieu;
        this.gia = gia;
        this.moTa = moTa;
        this.listHinh = listHinh;
        this.chiTiets = chiTiets;
        this.mauSacs = mauSacs;
        this.theLoai = theLoai;
        this.soLuongTon = soLuongTon;
    }

    public SanPham() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Set<String> getListHinh() {
        return listHinh;
    }

    public void setListHinh(Set<String> listHinh) {
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

    @Override
    public String toString() {
        return "SanPham{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", thuongHieu='" + thuongHieu + '\'' +
                ", gia=" + gia +
                ", moTa='" + moTa + '\'' +
                ", listHinh=" + listHinh +
                ", chiTiets=" + chiTiets +
                ", mauSacs=" + mauSacs +
                ", theLoai=" + theLoai +
                ", soLuongTon=" + soLuongTon +
                '}';
    }
}
