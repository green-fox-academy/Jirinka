package com.greenfox.exampleexam.Repository;

import com.greenfox.exampleexam.Model.Shortens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShortensRepository extends JpaRepository<Shortens, Long> {
    Shortens findByAlias(String alias);
}
