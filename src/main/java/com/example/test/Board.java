package com.example.test;

import java.util.ArrayList;

public class Board {
    private ArrayList<Peg> board= new ArrayList<Peg>();
    private boolean jump;

    public Board(){
        for (int i =1; i<= 4;i++){
            board.add(new Peg("red", i));
        }
        board.add(new Peg());
        board.add(new Peg());
        for (int i=4; i>= 1; i--){
            board.add(new Peg("blue", i));
        }
    }

    public boolean movePeg(String color, int peg, int spaceIdx){
        for (int i=0; i< board.size(); i++){
            if (board.get(i).getColor().equals(color) && board.get(i).getNumber()==peg){
                if (board.get(spaceIdx).getColor().equals("empty")){
                    if (board.get(i).getColor().equals("red")){
                        if (spaceIdx>i && spaceIdx<=i+2) {
                            if (spaceIdx==i+2 ){
                                jump=true;
                            }else{
                                jump=false;
                            }
                            if (jump &&board.get(i+1).getColor().equals("empty")){
                                return false;
                            }
                            Peg temp = board.remove(spaceIdx);
                            Peg pegRem = board.remove(i);
                            board.add(spaceIdx - 1, pegRem);
                            board.add(i, temp);
                            return true;
                        }else{
                            return false;
                        }
                    }
                    if (board.get(i).getColor().equals("blue")){
                        if (spaceIdx<i&& spaceIdx>=i-2){
                            if (spaceIdx==i-2){
                                jump=true;
                            }else{
                                jump=false;
                            }
                            if (jump && board.get(i-1).getColor().equals("empty")){
                                return false;
                            }
                            Peg temp = board.remove(spaceIdx);
                            Peg pegRem = board.remove(i-1);
                            board.add(spaceIdx, pegRem);
                            board.add(i, temp);
                            return true;
                        }else{
                            return false;
                        }
                    }
                }else{
                    return false;
                }
            }
        }
        return false;
    }

    public ArrayList<Peg> getBoard(){
        return board;
    }

    public boolean winCondition(){
        for (int i =0; i < board.size(); i++){
            if (i<4){
                if (!board.get(i).getColor().equals("blue")){
                    return false;
                }
            }
            if (i>5){
                if (!board.get(i).getColor().equals("red")){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean jump(){
        return jump;
    }


}
