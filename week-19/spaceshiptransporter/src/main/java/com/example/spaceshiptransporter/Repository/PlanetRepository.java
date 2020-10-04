package com.example.spaceshiptransporter.Repository;

import com.example.spaceshiptransporter.Model.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> {

}
