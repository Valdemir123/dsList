package com.devsuperior.dsList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsList.dto.GameListDTO;
import com.devsuperior.dsList.dto.GameMinDTO;
import com.devsuperior.dsList.services.GameListService;
import com.devsuperior.dsList.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId) {
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}
	
	@GetMapping(value = "/{Id}")
	public GameListDTO findByID(@PathVariable Long Id) {
		GameListDTO result = gameListService.findById(Id);
		return result;
	}
	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll(); 
		return result;
	}
}
