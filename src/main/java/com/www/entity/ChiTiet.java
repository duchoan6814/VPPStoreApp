package com.www.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "chi_tiet")
public class ChiTiet implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private SanPham sanPham;

    @Column(name = "thuoc_tinh", nullable = false)
    private String key;

    @Column(name = "gia_tri", nullable = false)
    private String value;

    @Override
    public String toString() {
        return "ChiTiet{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ChiTiet() {
    }

    public ChiTiet(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
