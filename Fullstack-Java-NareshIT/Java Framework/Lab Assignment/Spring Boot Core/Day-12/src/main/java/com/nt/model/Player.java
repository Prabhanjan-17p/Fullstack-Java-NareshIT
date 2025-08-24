package com.nt.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component("player")
@Getter
@Setter
public class Player {
    @Value("${player.id}")
    private int playerId;

    @Value("${player.name}")
    private String playerName;

    @Value("${player.yearsNumber}")
    private int yearsNumber;

    @Value("${team.name}")
    private String teamName;
}
