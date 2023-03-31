package DWTour.Tour.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import DWTour.Tour.entity.Trip;
import DWTour.Tour.repository.TripRepository;
import DWTour.Tour.service.TripService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class TripConstroller {

    @Autowired
    private TripService tripService;

    @Autowired
    private TripRepository tripRepository;

    @RequestMapping(value = "/trips", method = RequestMethod.GET)
    public Iterable<Trip> findAll(){
        return tripService.findAll();
    }

    @RequestMapping(value = "/trip/{id}", method = RequestMethod.GET)
    public Trip findOne(@PathVariable("id") long id){
        return tripService.findOne(id);
    }

    @RequestMapping(value = "/trip", method = RequestMethod.POST)
    public Trip save(@RequestBody Trip trip){
        return tripService.save(trip);
    }

    @RequestMapping(value = "/trip/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<Trip> findById(@PathVariable("id")long id, @RequestBody Trip trip){
        Trip getTrip = tripRepository.findById(id);

        getTrip.setTitle(trip.getTitle());
        getTrip.setCountry(trip.getCountry());
        getTrip.setAccomodation(trip.getAccomodation());
        getTrip.setTransaction(trip.getTransaction());
        getTrip.setEat(trip.getEat());
        getTrip.setDay(trip.getDay());
        getTrip.setNight(trip.getNight());
        getTrip.setTripDate(trip.getTripDate());
        getTrip.setPrice(trip.getPrice());
        getTrip.setQuota(trip.getQuota());
        getTrip.setDescraption(trip.getDescraption());
        getTrip.setImage_Trip(trip.getImage_Trip());

        Trip updateTrip = tripRepository.save(getTrip);
        return ResponseEntity.ok().body(updateTrip);
    }

    @RequestMapping(value = "/trip/{id}", method = RequestMethod.DELETE)
    public void removeOne(@PathVariable("id") long id){
        tripService.removeOne(id);
    }
}
