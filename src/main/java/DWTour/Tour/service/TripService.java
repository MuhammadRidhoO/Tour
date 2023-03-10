package DWTour.Tour.service;

import DWTour.Tour.entity.Trip;
import DWTour.Tour.repository.TripRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripService {

    @Autowired
    private TripRepository tripRepository;

    @Autowired
    public TripService(TripRepository tripRepository){
        this.tripRepository = tripRepository;
    }

    public Trip save(Trip trip){
        return tripRepository.save(trip);
    }

    public Iterable<Trip> findAll(){
        return tripRepository.findAll();
    }

    public Trip findOne(long id){
        return tripRepository.findById(id);
    }

    public void removeOne(long id){
        tripRepository.deleteById(id);
    }
}
