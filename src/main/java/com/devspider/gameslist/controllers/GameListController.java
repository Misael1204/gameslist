package com.devspider.gameslist.controllers;

import com.devspider.gameslist.dto.GameListDTO;
import com.devspider.gameslist.dto.GameMinDTO;
import com.devspider.gameslist.service.GameListService;
import com.devspider.gameslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }
}
