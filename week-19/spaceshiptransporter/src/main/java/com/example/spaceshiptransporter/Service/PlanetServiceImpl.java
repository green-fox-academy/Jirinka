package com.example.spaceshiptransporter.Service;

import com.example.spaceshiptransporter.Model.Planet;
import com.example.spaceshiptransporter.Repository.PlanetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetServiceImpl implements PlanetService {

    public final PlanetRepository planetRepository;

    public PlanetServiceImpl(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    @Override
    public Planet getPlanet(long id) {
        return planetRepository.findById(id).orElse(null);
    }

    @Override
    public List<Planet> getAllPlanets() {
        return planetRepository.findAll();
    }

}
