package com.marcosgg.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosgg.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
