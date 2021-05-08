package dayFiveWorkOne.core;

import dayFiveWorkOne.googleLogin.GoogleLogin;

public class GoogleLoginManager implements  LoginService{
    @Override
    public void lodIn() {
        GoogleLogin login = new GoogleLogin();
        login.logIn();
    }

    @Override
    public void register() {
        GoogleLogin registe = new GoogleLogin();
        registe.registe();

    }
}
