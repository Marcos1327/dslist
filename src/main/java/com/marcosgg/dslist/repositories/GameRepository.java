package com.marcosgg.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosgg.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
