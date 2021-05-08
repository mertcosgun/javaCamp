package dayFiveWorkOne.business.concretes;

import dayFiveWorkOne.business.abstracts.UserService;
import dayFiveWorkOne.core.LoginService;
import dayFiveWorkOne.core.Utils;
import dayFiveWorkOne.dataAccess.abstracts.UserDao;
import dayFiveWorkOne.entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {
    private UserDao dao;

    public UserManager(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void add(User user) {
        if (Utils.firstNameChecker(user.getFirsName()) && Utils.lastNameChecker(user.getLastName()) && Utils.emailChecker(user.getEmail()) && Utils.passwordChecker(user.getPassword())) {
            dao.add(user);
            sendVerificationEmail(user);
        } else {
            System.out.println("Kayıt gerçekleştirilemedi.");
            System.out.println("Bilgilerinizi kontrol ediniz.");
        }
    }

    @Override
    public void sendVerificationEmail(User user) {
        System.out.println("Doğrulama epostası gönderildi : " + user.getFirsName());
    }

    @Override
    public void confirmVerifivationEmail(User user) {
        System.out.println("Kullanıcı doğrulandı : " + user.getFirsName());
    }

    @Override
    public void logIn(String email, String password) {
        if (Utils.emailChecker(email) && Utils.passwordChecker(password)) {
            System.out.println("Giriş başarılı.");
        } else {
            System.out.println("Eposta ve şifrenizi kontrol ediniz.");
        }

    }
    public void logInWithGoogle(LoginService service) {
        service.lodIn();
    }

    @Override
    public void logOut() {
        System.out.println("Kullanıcı başarıyla çıkış yaptı.");
    }

    @Override
    public List<User> get() {
        return null;
    }
}
