package project.project.dto;

import org.springframework.stereotype.Repository;
import project.project.login.Login;

@Repository
public class LoginRepositoryImpl implements LoginRepository {
    @Override
    public String find(Login login) {
        System.out.println("LoginRepository = " + login);
        return null;
    }
}
