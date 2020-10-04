package com.example.spaceshiptransporter.Repository;

import com.example.spaceshiptransporter.Model.Spaceship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceshipRepository extends JpaRepository<Spaceship, Long> {
    Spaceship findByPlanetId(long id);

}
