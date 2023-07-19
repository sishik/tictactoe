package com.practice.tictactoe;

import java.util.ArrayList;
import com.practice.tictactoe.models.Player;

import java.awt.*;
import java.util.Scanner;
import java.util.List;

public class TictactoeApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the game board size");
        int dimension = sc.nextInt();

        System.out.println("will ther be bot in the game? Y/N");
        String isBot=sc.next();
        List<Player> players = new ArrayList<>();



    }

}
