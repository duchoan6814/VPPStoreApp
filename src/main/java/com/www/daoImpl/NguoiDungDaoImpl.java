package com.www.daoImpl;

import com.www.dao.NguoiDungDao;
import com.www.entity.NguoiDung;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class NguoiDungDaoImpl implements NguoiDungDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public boolean saveNguoiDung(NguoiDung nguoiDung) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.save(nguoiDung);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
