package com.marcosgg.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcosgg.dslist.dto.GameListDTO;
import com.marcosgg.dslist.entities.GameList;
import com.marcosgg.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional
	public List<GameListDTO> findAll(){
		List<GameList> gameList = gameListRepository.findAll();
		List<GameListDTO> gameListDTO = gameList.stream().map(convert -> new GameListDTO(convert)).toList();
		return gameListDTO;
	}
}
