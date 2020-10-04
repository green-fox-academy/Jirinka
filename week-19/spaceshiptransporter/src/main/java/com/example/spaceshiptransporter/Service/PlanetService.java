package com.example.spaceshiptransporter.Service;

import com.example.spaceshiptransporter.Model.Planet;

import java.util.List;

public interface PlanetService {
    Planet getPlanet(long id);
    List<Planet> getAllPlanets();
}
