//package com.github.zipcodewilmington.casino.games.roulette;
//
//import com.github.zipcodewilmington.casino.Person;
//import com.github.zipcodewilmington.casino.PlayerInterface;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class RoulettePlayer implements PlayerInterface{
//    public Person player;
//
//    public void RoulettePlayer(Person player){
//        this.player = player;
//    }
//
//    public Integer makeMove(){
//        Scanner scanner = new Scanner(System.in);
//        int x =0;
//        try{
//            System.out.println("Please choose a column number: ");
//            x = scanner.nextInt();
//        }catch (InputMismatchException e){
//            System.out.println(" "+scanner.next()+ " isn't a number!");
//        }
//
//        //ask for move
//        return x;
//    }
//         //choose number
//        //place bet
//    }
//}
