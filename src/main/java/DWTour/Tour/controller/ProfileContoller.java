package DWTour.Tour.controller;

import DWTour.Tour.entity.Profile;
import DWTour.Tour.repository.ProfileRepository;
import DWTour.Tour.service.ProfileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class ProfileContoller {

    @Autowired
    private ProfileService profileService;

    @Autowired
    private ProfileRepository profileRepository;

    @RequestMapping(value = "/profiles", method = RequestMethod.GET)
    public Iterable<Profile> findAll() {
        return profileService.findAll();
    }

    @RequestMapping(value = "/profile/{id}", method = RequestMethod.GET)
    public Profile findOne(@PathVariable("id") long id) {
        return profileService.findOne(id);
    }

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public Profile save(@RequestBody Profile profile) {
        return profileService.save(profile);
    }

    @RequestMapping(value = "/profile/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<Profile> findById(@PathVariable("id") long id, @RequestBody Profile profile) {
        Profile getProfile = profileRepository.findById(id);

        getProfile.setAddress(profile.getAddress());
        getProfile.setState(profile.getState());
        getProfile.setPhone(profile.getPhone());

        Profile updateProfile = profileRepository.save(getProfile);

        return ResponseEntity.ok().body(updateProfile);

    }

    @RequestMapping(value = "/profile/{id}", method = RequestMethod.DELETE)
    public void removeOne(@PathVariable("id")long id){
        profileService.removeOne(id);
    }
}
