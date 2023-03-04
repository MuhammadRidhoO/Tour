package DWTour.Tour.entity;

import java.time.LocalDate;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

@Entity
public class Trip {
    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "accomodation", nullable = false)
    private String accomodation;

    @Column(name = "transportation", nullable = false)
    private String transportation;

    @Column(name = "eat", nullable = false)
    private String eat;

    @Column(name = "day", nullable = false)
    private Integer day;

    @Column(name = "night", nullable = false)
    private Integer night;

    @Column(name = "date_trip", nullable = false)
    private LocalDate date_trip;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "quota", nullable = false)
    private Integer quota;

    @Column(name = "descraption", nullable = false)
    private String descraption;

    @Column(name = "image_trip", nullable = false)
    private String image_trip;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "transaction_id", referencedColumnName = "id")
    private Transaction transaction;

    public Trip() {
    }

    public Trip(String title, String country, String accomodation, String transportation, String eat, Integer day,
            Integer night, LocalDate date_trip, Integer price, Integer quota, String descraption, String image_trip) {
        this.title = title;
        this.country = country;
        this.accomodation = accomodation;
        this.transportation = transportation;
        this.eat = eat;
        this.day = day;
        this.night = night;
        this.date_trip = date_trip;
        this.price = price;
        this.quota = quota;
        this.descraption = descraption;
        this.image_trip = image_trip;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
