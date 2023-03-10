package DWTour.Tour.repository;

import DWTour.Tour.entity.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, Long> {

    Profile findById(long id);

}
