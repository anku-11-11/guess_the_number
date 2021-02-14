package com.company;

import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int input;
    public int guess=0;

    public void setguess(int noofguess){
        this.guess=noofguess;
    }
    public int getguess(){
        return guess;
    }


     game(){
        Random ran= new Random();
        this.number= ran.nextInt(100);
    }
    void userinput(){
        System.out.println("guess the number");
        Scanner sc= new Scanner(System.in);
         input =sc.nextInt();


    }
    boolean istrue(){
        guess++;
        if(input==number){
            System.out.println("yes u guess the number correctly "+number +" in "+guess +" guess ");
            return true;
        }
        else if(input<number){
            System.out.println("too low");
        }
        else if(input>number){
            System.out.println("too high");
        }
        return false;
    }
}

public class game_guess {
    public static void main(String[] args){

        game g= new game();
        boolean b=false;
        while (!b){
            g.userinput();
            b= g.istrue();
        }
    }

}
