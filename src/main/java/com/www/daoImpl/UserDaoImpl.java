package com.www.daoImpl;

import com.www.dao.UserDao;
import com.www.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class UserDaoImpl implements UserDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public User findByEmail(String email) {
        String sql = "select * from user_table where email = ?";
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createNativeQuery(sql, User.class);
        query.setParameter(1, email);
        List<User> users = query.getResultList();
        if (users.size() > 0) {
            return users.get(0);
        }
        return null;
    }

    @Override
    public boolean saveUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.save(user);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
