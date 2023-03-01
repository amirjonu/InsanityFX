package com.example.test;
import java.util.*;
public class Test {
    public static void main(String[] args){
        Board board= new Board();
        for (Peg pegs: board.getBoard()){
            System.out.print(pegs.getColor()+" "+ pegs.getNumber()+" ");
        }
        System.out.println();
        for (int i=0; i< 9; i++){
            System.out.print("  "+i+" ");
        }
        System.out.println();
        Scanner s= new Scanner (System.in);
        while (true){
            System.out.print("Enter pegy color: ");
            String pegCol= s.nextLine();
           System.out.print("Enter movement: ");
           int move= s.nextInt();
           System.out.print("Enter which peg to Move: ");
           int pegToMove= s.nextInt();
           if (board.movePeg(pegCol, pegToMove, move)){
               for (Peg pegs: board.getBoard()){
                   System.out.print(pegs.getColor()+" "+ pegs.getNumber()+" ");
               }
               System.out.println();
               for (int i=0; i< 9; i++){
                   System.out.print("  "+i+" ");
               }
               System.out.println();
           }
           else {
               System.out.println("Error");
               System.out.println();
               for (Peg pegs: board.getBoard()){
                   System.out.print(pegs.getColor()+" "+ pegs.getNumber()+" ");
               }
               System.out.println();
               for (int i=0; i< 9; i++){
                   System.out.print("  "+i+" ");
               }
               System.out.println();
           }
           boolean c=true;
           for (int i=0; i< board.getBoard().size(); i++){
               if (i<4){
                   if (!board.getBoard().get(i).getColor().equals("blue")) {
                       c = false;
                   }
               }
               if (i>5){
                   if (!board.getBoard().get(i).getColor().equals("red")){
                       c= false;
                   }
               }
           }
           if (c){
               break;
           }
        }
        System.out.println("The end");
    }
}
