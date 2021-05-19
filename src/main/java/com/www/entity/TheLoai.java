package com.www.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "the_loai")
public class TheLoai implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "ten", nullable = false)
    private String ten;

    @OneToMany(mappedBy = "theLoai")
    private List<SanPham> sanPhams;

    public TheLoai() {
    }

    public TheLoai(String id, String ten) {
        this.id = id;
        this.ten = ten;
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

    @Override
    public String toString() {
        return "TheLoai{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                '}';
    }
}
