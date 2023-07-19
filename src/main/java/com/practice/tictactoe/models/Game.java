package com.practice.tictactoe.models;

import exceptions.InvalidGameBuildException;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Move>moves;
    private Board board;
    private List<Player> players;
    private GameStatus gameStatus;
    private int nextPlayerIndex;
    private Player winner;

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }
    public void displayBoard(){
    this.board.display();
    }
    public static Builder getBuilder(){
        return new Builder();
    }
    private Game()
    {}
    public static class Builder
    {
        private int dimension;
        private List<Player> players;

        public int getDimension() {
            return dimension;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
        private boolean isValid()throws InvalidGameBuildException
        {
            if(this.dimension<3){
                throw new InvalidGameBuildException("Board size(dimension) is less than 3");
            }
            if(this.players.size()!=this.dimension-1){
                throw new InvalidGameBuildException("Issue with number of Players.");
            }
            return true;
        }

        public Game Build()throws InvalidGameBuildException
        {
            isValid();//if this is false it will throw exception

            Game game = new Game();
            game.setBoard(new Board(dimension));
            game.setPlayers(players);
            game.setGameStatus(GameStatus.INPROGRESS);
            game.setMoves(new ArrayList<>());
            game.nextPlayerIndex(0);

            return game;
        }
    }
}
