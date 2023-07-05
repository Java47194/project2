package project.project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.project.dto.LoginRepositoryImpl;
import project.project.login.Login;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    private final LoginRepositoryImpl loginRepository;

    @Override
    public String find(Login login) {
        System.out.println("LoginRepositoryImpl = " + login);
        loginRepository.find(login);
        return null;
    }
}

