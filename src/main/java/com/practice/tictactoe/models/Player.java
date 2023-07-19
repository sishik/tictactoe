package com.practice.tictactoe.models;

public class Player {
    private String playerName;
    private char symbol;
    private PlayerType type;

    public Player(String name,char symbol,PlayerType playerType){
        this.playerName=name;
        this.symbol=symbol;
        this.type=playerType;
    }


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public PlayerType getType() {
        return type;
    }

    public void setType(PlayerType type) {
        this.type = type;
    }
}
