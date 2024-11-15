package com.devspider.gameslist.repositories;

import com.devspider.gameslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
