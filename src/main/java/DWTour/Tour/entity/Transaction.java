package DWTour.Tour.entity;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "transactions")
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

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Transaction() {
    }

    public Transaction(Integer quantity, Integer total, String status_payment) {
        this.quantity = quantity;
        this.total = total;
        this.status_payment = status_payment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
