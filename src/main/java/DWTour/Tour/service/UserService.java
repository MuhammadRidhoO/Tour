package DWTour.Tour.service;

import DWTour.Tour.entity.User;
import DWTour.Tour.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // untuk Create Id baru
    public User save(User user){
        return userRepository.save(user);
    }

    // untuk Get semua Id user
    public Iterable<User> findAll(){
        return userRepository.findAll();
    }

    // untuk Get 1 Id user
    public User findOne(long id){
        return userRepository.findById(id);
    }

    // untuk Delete Id user
    public void removeOne(long id){
        userRepository.deleteById(id);
    }
}
