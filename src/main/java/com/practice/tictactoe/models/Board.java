package com.practice.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> board;//2D Matrix
    //another approach to initialize the below code
//    public Board(int dimension) {
//        this.board = new ArrayList<>();
//        for (int i = 0; i < dimension; i++) {
//            ArrayList<Cell> row = new ArrayList<>();
//            for (int j = 0; j < dimension; j++) {
//                row.add(new Cell(i, j));
//            }
//            this.board.add(row);
//        }
//    }

    public Board(int dimension){
        this.board = new ArrayList<>();
        for(int i=0;i<dimension;i++)
        {
            this.board.add(new ArrayList<>());
            for(int j=0;j<dimension;j++)
                this.board.get(i).add(new Cell(i,j));
        }

    }
/*
    X   0
      0 X
    X   0
     */

    public void display()
    {
     for (int i=0;i<board.size();i++){
         for (int j=0;j<board.size();j++){
             if(board.get(i).get(j).getCellState().equals(CellState.EMPTY)){
                 System.out.print("|  |");
             }
             else{
                 System.out.print("| "+board.get(i).get(j).getPlayer().getSymbol()+" |");
             }
         }
     }
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
}
