package user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.model.User;
import user.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public User find(String id) {
        return userRepository.findById(id).get();
    }

    public User add(User user) {
        return userRepository.save(user);

    }

    public void updateUser(String id, User user) {
        User userToUpdate = find(id);
        userRepository.updateUser(userToUpdate, user);
    }

    public void delete(String id) {
       userRepository.deleteById(id);
    }

    public List<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
