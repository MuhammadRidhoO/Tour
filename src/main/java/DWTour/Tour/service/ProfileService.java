package DWTour.Tour.service;

import DWTour.Tour.entity.Profile;
import DWTour.Tour.repository.ProfileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    public ProfileService(ProfileRepository profileRepository){
        this.profileRepository = profileRepository;
    }

    public Profile save(Profile profile){
        return profileRepository.save(profile);
    }

    public Iterable<Profile> findAll() {
        return profileRepository.findAll();
    }

    public Profile findOne(long id){
        return profileRepository.findById(id);
    }

    public void removeOne(long id){
        profileRepository.deleteById(id);
    }
}
