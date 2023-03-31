package DWTour.Tour.entity;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

@Entity
public class Transaction {

    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "total", nullable = false)
    private Integer total;

    @Column(name = "status_payment", nullable = false)
    private String status_payment;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "trip", referencedColumnName = "id")
    private Trip trip;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Transaction() {

    }

    public Transaction(Integer quantity, Integer total, String status_payment, Trip trip, User user) {
        this.quantity = quantity;
        this.total = total;
        this.status_payment = status_payment;
        this.trip = trip;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String status_payment() {
        return status_payment;
    }

    public void setStatus_Payment(String status_payment) {
        this.status_payment = status_payment;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
