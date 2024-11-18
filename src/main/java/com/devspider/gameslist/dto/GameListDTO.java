package com.devspider.gameslist.dto;

import com.devspider.gameslist.entities.Game;
import com.devspider.gameslist.entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;

    GameListDTO() {

    }
    public GameListDTO(GameList entity){
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
