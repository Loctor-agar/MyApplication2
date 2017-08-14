package com.example.myapplication;

/**
 * Created by Хусан on 09.08.2017.
 */

class Fighters {
    private int health;
    private int power;
    private int agility;
    private int defence;
//    private int fighter1;
//    private int fighter2;

    public void health(int i) {

    }

    public void power(int i) {

    }

    public void agility(int i) {

    }

    public void defence(int i) {

    }

    public void hit(Fighters vasya) {
        vasya.takeHit(power);
    }

    private void takeHit(int power) {
        health = health - (power - defence/2);
    }

    public void kick(Fighters vasya) {
        vasya.takeKick(power);
    }

    private void takeKick(int power) {
        health = health - (power - defence/2);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getAgility() {
        return agility;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getDefence() {
        return defence;
    }

//    public int getFighter1() {
//        return fighter1;
//    }
//
//    public int getFighter2() {
//        return fighter2;
//    }
}
