package dayFiveWorkOne.business.abstracts;

import dayFiveWorkOne.entities.concretes.User;

import java.util.List;

public interface UserService {

    void add(User user);
    void sendVerificationEmail(User user);
    void confirmVerifivationEmail(User user);
    void logIn(String email, String password);
    void logOut();
    List<User> get();


}
