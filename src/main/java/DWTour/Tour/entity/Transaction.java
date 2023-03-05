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

    public Transaction(){
    }

    public Transaction(Integer quantity, Integer total, String status_payment){
        this.quantity = quantity;
        this.total =  total;
        this.status_payment = status_payment;
    }

    
}
