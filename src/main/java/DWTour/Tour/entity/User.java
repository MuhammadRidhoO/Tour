package DWTour.Tour.entity;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String full_name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "image", nullable = false)
    private String image;

    public User() {

    }

    public User(String full_name, String email, String password, String phone, String address, String gender,
            String image) {
        this.full_name = full_name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
