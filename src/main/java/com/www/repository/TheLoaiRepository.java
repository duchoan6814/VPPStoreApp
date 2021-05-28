package com.www.repository;

import com.www.entity.TheLoai;
import org.springframework.data.repository.CrudRepository;

public interface TheLoaiRepository extends CrudRepository<TheLoai, Long> {
    TheLoai findByTen(String name);
}
