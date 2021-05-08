package dayFiveWorkOne;

import dayFiveWorkOne.business.concretes.UserManager;
import dayFiveWorkOne.core.GoogleLoginManager;
import dayFiveWorkOne.core.LoginService;
import dayFiveWorkOne.dataAccess.concretes.HibernateUserDao;
import dayFiveWorkOne.entities.concretes.User;

public class Main {

    public static void main(String[] args) {


        LoginService service;
        User user1 = new User(1, "Mert", "Coşgun", "cosgunmert35@gmail.com", "123456");

        UserManager manager = new UserManager(new HibernateUserDao());

        manager.add(user1);
        manager.confirmVerifivationEmail(user1);
        System.out.println("----------------------------------------------------------------------------");
        manager.logIn(user1.getEmail(), user1.getPassword());

        manager.logOut();

        System.out.println("----------------------------------------------------------------------------");
        manager.logIn("asd@asd", "123456789");
        manager.logInWithGoogle(new GoogleLoginManager());

    }
}
