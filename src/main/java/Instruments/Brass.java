package Instruments;

import Interfaces.IPlay;

public class Brass extends Instruments.Instrument implements IPlay {

    private String brand;
    private String sound;

    public Brass(String type, int price, String brand, String sound) {
        super(type, price);
        this.brand = brand;
        this.sound = sound;
    }

    public String getBrand() {
        return brand;
    }

    public String instrumentCanPlay(){
        return "This instrument makes a sound like a " + sound;
    }

}
