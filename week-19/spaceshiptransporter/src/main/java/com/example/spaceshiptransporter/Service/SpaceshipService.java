package com.example.spaceshiptransporter.Service;

import com.example.spaceshiptransporter.Model.Planet;
import com.example.spaceshiptransporter.Model.Spaceship;

public interface SpaceshipService {

    boolean isSpaceshipHere(long id);
    //void moveSpaceshipHere(long id);
    void toPlanet(long id);
    void toShip(long id);
    Spaceship getSpaceship(long id);
    Spaceship getByPlanetId(long id);

}
