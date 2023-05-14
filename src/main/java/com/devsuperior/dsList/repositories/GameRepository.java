package com.devsuperior.dsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
