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
    private  EntityManager entityManager;


    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public User showUser(int id) {
        return null;
    }

    @Override
    public void editUser(User user) {

    }

    @Override
    public void deleteUser(int id) {

    }


}
