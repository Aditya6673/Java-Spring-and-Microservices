package com.aditya;


public class Alien {

    private Computer comp;

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }


    public Alien(){
        System.out.println("Alien constructor");
    }
    public void build() {
        System.out.println("Alien is building.....");
        comp.compile();
    }
}
