package com.example.demofim.dao;

import com.example.demofim.domain.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional //z duvodu pro zapisovani pomoci metody POST - melo by to byt v aplikacni logice, kvuli zapisu vice dat
public class JpaUserDao implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void create(User user) {
        em.persist(user);
    }

    @Override
    public User findById(long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return em.createQuery("SELECT u FROM User u", User.class).getResultList();
    }
}
