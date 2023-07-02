package web.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> allFilms() {
        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void edit(User user) {

    }

    @Override
    public User getById(Long id) {
        return null;
    }
}
