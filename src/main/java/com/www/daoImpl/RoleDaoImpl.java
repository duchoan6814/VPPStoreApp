package com.www.daoImpl;

import com.www.dao.RoleDao;
import com.www.entity.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class RoleDaoImpl implements RoleDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Role> findByUserID(int user_id) {
        String sql = "select * from role where user_id = ?";
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createNativeQuery(sql, Role.class);
        query.setParameter(1, user_id);
        List<Role> roles = query.getResultList();

        return roles;
    }

    @Override
    public Role findByName(String name) {
        String sql = "select * from role where name = :name";
        Session session = sessionFactory.getCurrentSession();

        NativeQuery<Role> query = session.createNativeQuery(sql, Role.class);
        query.setParameter("name", name);
        List<Role> roles = query.list();

        if (roles.size() > 0)
            return roles.get(0);

        return null;
    }

    @Override
    public boolean saveRole(Role role) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.save(role);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
