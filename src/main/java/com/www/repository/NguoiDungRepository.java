package com.www.repository;

import com.www.entity.NguoiDung;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NguoiDungRepository extends CrudRepository<NguoiDung, String> {
}
