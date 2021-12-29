package com.expresslab;

import com.expresslab.games.*;
import com.expresslab.human.Girl;
import com.expresslab.human.Man;
import com.expresslab.human.Person;
import com.expresslab.human.Woman;
import com.expresslab.stadium.Fighting;

public class Executor {
    public static void main(String []args){

        // Game game1 = new Game();
        // Game game2 = new Game();
        // Game game3 = new Game();

        Game game4 = new Team("Basketball",401);
        Game game5 = new Single("Gofl",400);
        game4.printPlay();
        game5.printPlay();

        Mobile mobile = new Mobile();
        System.out.println("Mobile " + mobile.getScore() + " " + mobile.getName() );

        Chess chess = new Chess();
        System.out.println("Chess " + chess.getScore() + " " + chess.getName() );

        Football football = new Football();
        System.out.println("Football " + football.getScore() + " " + football.getName() );

        Golf golf = new Golf();
        System.out.println("Golf " + golf.getScore() + " " + golf.getName() );


        Person person = new Person();

        person.play();
        person.say();


        Woman woman = new Woman();

        woman.say();
        woman.play();


        Man man = new Man();

        man.play();
        man.say();

        Girl aaa = new Girl();
        aaa.showTheGirl();

        Girl aa = new Girl();
        aa.showThePlanets();

        Fighting fighting = new Fighting();
        fighting.printInform("i like tacos");
        fighting.printInfo("2023");







        //System.out.println(game1.getName());
        //System.out.println(game2.getName());


        //game1.setName("Tennis");
        // game2.setName("Football");

        // game1.setSpecialClothes("Nike");
        // game2.setSpecialClothes("Adidas");

          /*  System.out.println("Score of the " + game2.getName() + " = "+ game2.secondScore);
            System.out.println("Score of the " + game1.getName() + " = "+ game1.firstScore);
            System.out.println("Uniform for  " + game1.getName() + " is "+ game1.getSpecialClothes() );
            System.out.println("Uniform for  " + game2.getName() + " is " + game2.getSpecialClothes() );*/

    }
}

