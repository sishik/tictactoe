package com.practice.tictactoe.models;

public class Cell {
    private Player player;
    private int rowNum;
    private int colNum;
    private CellState cellState;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public int getColNum() {
        return colNum;
    }

    public void setColNum(int colNum) {
        this.colNum = colNum;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public Cell(int row, int col, CellState cell, Player player)
    {
        this.rowNum=row;
        this.colNum=col;
        this.cellState=cell;
        this.player=player;
    }
    public Cell(int row,int col)
    {
        this.rowNum=row;
        this.colNum=col;
        this.cellState=CellState.EMPTY;
    }

}
