package DWTour.Tour.controller;

import DWTour.Tour.entity.User;
import DWTour.Tour.repository.UserRepository;
import DWTour.Tour.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class UserController {

    // untuk memanggil data dari user service
    @Autowired
    private UserService userService;

    // untuk memanggil data dari user repository
    @Autowired
    private UserRepository userRepository;

    // membuat route untuk mengakses dengan menggunakan method yang di butuhkan
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public Iterable<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User findOne(@PathVariable("id") long id) {
        return userService.findOne(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<User> findById(@PathVariable("id") long id, @RequestBody User user) {
        User getUser = userRepository.findById(id);

        getUser.setfull_name(user.getFull_Name());
        getUser.setEmail(user.getEmail());
        getUser.setPassword(user.getPassword());
        getUser.setAddress(user.getAddress());
        getUser.setGender(user.getGender());
        // getUser.setImage(user.getImage());

        User updateUser = userRepository.save(getUser);
        return ResponseEntity.ok().body(updateUser);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public void removeOne(@PathVariable("id") long id) {
        userService.removeOne(id);
    }
}
