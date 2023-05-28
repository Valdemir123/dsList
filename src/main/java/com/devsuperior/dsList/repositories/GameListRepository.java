package com.devsuperior.dsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
