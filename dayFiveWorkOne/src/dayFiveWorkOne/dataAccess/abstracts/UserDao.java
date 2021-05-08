package dayFiveWorkOne.dataAccess.abstracts;

import dayFiveWorkOne.entities.concretes.User;

import java.util.List;

public interface UserDao {

    void add(User user);
    void update(User user);
    void delete(int id);
    void get(int id);
    List<User> getAll();
}
