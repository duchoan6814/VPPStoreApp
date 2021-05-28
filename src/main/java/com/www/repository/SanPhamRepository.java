package com.www.repository;

import com.www.entity.SanPham;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SanPhamRepository extends CrudRepository<SanPham, Long> {
    List<SanPham> findAll();
}
