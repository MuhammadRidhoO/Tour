package DWTour.Tour.entity;

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

    @Column(name = "tripDate", nullable = false)
    private String tripDate;

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

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "quota", nullable = false)
    private Integer quota;

    @Column(name = "descraption", nullable = false)
    private String descraption;

    @Column(name = "image_trip", nullable = true)
    private String image_trip;

    @OneToOne(mappedBy = "trip")
    private Transaction transaction;

    public Trip() {
    }

    public Trip(String title, String country, String accomodation, String transportation, String eat, Integer day,
            Integer night, Integer price, Integer quota, String descraption, String image_trip, String tripDate) {
        this.title = title;
        this.country = country;
        this.accomodation = accomodation;
        this.transportation = transportation;
        this.eat = eat;
        this.day = day;
        this.night = night;
        this.price = price;
        this.quota = quota;
        this.descraption = descraption;
        this.image_trip = image_trip;
        this.tripDate = tripDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAccomodation() {
        return accomodation;
    }

    public void setAccomodation(String accomodation) {
        this.accomodation = accomodation;
    }

    public String getTripDate(){
        return tripDate;
    }

    public void setTripDate (String tripDate){
        this.tripDate = tripDate;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getNight() {
        return night;
    }

    public void setNight(Integer night) {
        this.night = night;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public String getDescraption() {
        return descraption;
    }

    public void setDescraption(String descraption) {
        this.descraption = descraption;
    }

    public String getImage_Trip() {
        return image_trip;
    }

    public void setImage_Trip(String image_trip) {
        this.image_trip = image_trip;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

}
