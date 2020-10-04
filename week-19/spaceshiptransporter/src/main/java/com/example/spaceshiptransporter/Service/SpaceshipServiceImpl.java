package com.example.spaceshiptransporter.Service;

import com.example.spaceshiptransporter.Model.Planet;
import com.example.spaceshiptransporter.Model.Spaceship;
import com.example.spaceshiptransporter.Repository.PlanetRepository;
import com.example.spaceshiptransporter.Repository.SpaceshipRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpaceshipServiceImpl implements SpaceshipService {

    public final SpaceshipRepository spaceshipRepository;
    public final PlanetRepository planetRepository;

    public SpaceshipServiceImpl(SpaceshipRepository spaceshipRepository, PlanetRepository planetRepository) {
        this.spaceshipRepository = spaceshipRepository;
        this.planetRepository = planetRepository;
    }

    @Override
    public boolean isSpaceshipHere(long id) {

        long planNum = spaceshipRepository.findById(0l).get().getPlanet().getId();
        //long spaceNum = planetRepository.findById(id).get().getId();

         if (planNum == id){
             return true;
         } else return false;
    }



    @Override
    public void toPlanet(long id) {
        Spaceship spaceship = spaceshipRepository.findByPlanetId(id);
        Planet planet = planetRepository.findById(id).get();

        long populationOnPlanet = planet.getPopulation();
        long peopleOnShip = spaceship.getUtilization();

        spaceship.setUtilization(0);
        planet.setPopulation(populationOnPlanet+peopleOnShip);
        planetRepository.save(planet);
        spaceshipRepository.save(spaceship);

    }

    @Override
    public void toShip(long id) {
        Spaceship spaceship = spaceshipRepository.findByPlanetId(id);
        Planet planet = planetRepository.findById(id).get();

        long populationOnPlanet = planet.getPopulation();
        long peopleOnShip = spaceship.getUtilization();
        long maxCapacity = spaceship.getMaxCapacity();
        long freeSpots = maxCapacity - peopleOnShip;

        if(populationOnPlanet<freeSpots){
            spaceship.setUtilization((int) (peopleOnShip + populationOnPlanet));
            planet.setPopulation(0);
        } else {
            spaceship.setUtilization((int) (peopleOnShip + freeSpots));
            planet.setPopulation(populationOnPlanet-freeSpots);
        }
        spaceshipRepository.save(spaceship);
        planetRepository.save(planet);
    }

    @Override
    public Spaceship getSpaceship(long id) {
        return spaceshipRepository.findById(id).orElse(null);
    }
    public Spaceship getByPlanetId(long id){
        return spaceshipRepository.findByPlanetId(id);
    }
    public void setSpaceship (long id){


        Planet planet = planetRepository.findById(id).orElse(null);
        Spaceship spaceship = spaceshipRepository.findById(0l).orElse(null);
        if(!isSpaceshipHere(id)){
            spaceship.setPlanet(planet);
        }
        spaceshipRepository.save(spaceship);
    }
}
