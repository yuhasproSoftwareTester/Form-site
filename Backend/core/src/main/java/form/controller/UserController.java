package form.controller;
import form.entity.User;
import form.repository.UserRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {

        return userRepository.save(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {

    Optional<User> existingUser =
            userRepository.findByEmail(user.getEmail());

    if (existingUser.isPresent()) {

        User foundUser = existingUser.get();

        if (foundUser.getPassword().equals(user.getPassword())) {
            return foundUser;
        }
    }

    throw new RuntimeException("Invalid email or password");
}
}
