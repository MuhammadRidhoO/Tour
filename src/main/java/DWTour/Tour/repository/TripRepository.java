package DWTour.Tour.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import DWTour.Tour.entity.Trip;

@Repository
public interface TripRepository extends CrudRepository<Trip, Long> {

              Trip findById(long id);

}
