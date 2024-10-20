package by.tatevik.week4;

import by.tatevik.week4.entity.Fish;
import by.tatevik.week4.entity.Ship;

public class Main {
    public static void main(String[] args) {
        Fish fish=new Fish();
        Ship ship=new Ship();
        SwimExecutor swimExecutor=new SwimExecutor();
        swimExecutor.goSwim(fish);
        swimExecutor.goSwim(ship);
    }
}
