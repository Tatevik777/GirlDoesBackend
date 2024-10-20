package by.tatevik.week4.entity;

import by.tatevik.week4.Swimmable;

public class Fish implements Swimmable {
    @Override
    public void swim() {
        fishEatsWorm();
        System.out.println("Рыбка поплыла!");
    }
    private void fishEatsWorm(){
        System.out.println("Рыбка увидела червяка!");
    }
}
