package com.robot;

public class Robot {
    int x;
    int y;
    String direction;
//constructor
    /* Robot(){
        this.x = 0;
        this.y = 0;
        this.direction = "nord";
    }*/
    Robot(int x, int y, String direction){
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    void move(){
        if (direction == "nord"){
            y++;
        }
        else if (direction == "est"){
            x++;
        }
        else if(direction == "sud"){
            y--;
        }
        else if(direction == "ouest"){
            x--;
        }
    }
    void turn(){
        if (this.direction == "nord"){
            this.direction = "est";
        }
        else if (this.direction == "est"){
            this.direction = "sud";
        }
        else if (this.direction == "sud"){
            this.direction = "ouest";
        }
        else if (this.direction == "ouest"){
            this.direction = "nord";
        }
    }
    static void uneMethode(){
        //une methode de classe (ou methode statique) peut etre appelé directement depuis la classe sans construire d'objet
    }


    public static void main(String[] args) {
        //Robot.uneMethode(); c'est un appel d'une methode de classe
        Robot terminator = new Robot(10, 20, "ouest");
        terminator.move();
        terminator.turn();
        terminator.move();
        System.out.println(terminator.x + " " + terminator.y+", dir = "+terminator.direction);
    }
}
