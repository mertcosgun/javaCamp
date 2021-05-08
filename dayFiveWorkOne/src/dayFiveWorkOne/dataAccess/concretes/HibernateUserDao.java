package dayFiveWorkOne.dataAccess.concretes;

import dayFiveWorkOne.dataAccess.abstracts.UserDao;
import dayFiveWorkOne.entities.concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao {



    @Override
    public void add(User user) {
        System.out.println(user.getFirsName() + " " + user.getLastName() + " veritabanına eklendi.");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getId() + " bilgileri güncellendi.");
    }

    @Override
    public void delete(int id) {
        System.out.println(id + " bilgileri silindi.");
    }

    @Override
    public void get(int id) {

    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
