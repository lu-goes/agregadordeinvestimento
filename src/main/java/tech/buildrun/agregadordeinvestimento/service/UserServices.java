package tech.buildrun.agregadordeinvestimento.service;

import org.springframework.stereotype.Service;
import tech.buildrun.agregadordeinvestimento.controller.CreateUserDto;
import tech.buildrun.agregadordeinvestimento.repository.UserRepository;

@Service
public class UserServices {

    private UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(CreateUserDto createUserDto){

    }
}
