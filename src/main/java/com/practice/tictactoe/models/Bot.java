package com.practice.tictactoe.models;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;
    public Bot(String name,char symbol,BotDifficultyLevel bot){
        super(name,symbol,PlayerType.BOT);
        this.botDifficultyLevel=bot;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
