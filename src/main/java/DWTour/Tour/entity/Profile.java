package DWTour.Tour.entity;

import jakarta.persistence.*;

@Entity
public class Profile {

    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "phone", nullable = false)
    private String phone;

    public Profile() {

    }

    public Profile(String address, String state, String phone) {
        this.address = address;
        this.state = state;
        this.phone = phone;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
}
