package Instruments;

public class Percussion extends Instruments.Instrument {

    private String brand;
    private String sound;

    public Percussion(String type, int price, String brand, String sound) {
        super(type, price);
        this.brand = brand;
        this.sound = sound;
    }

    public String getType() {
        return brand;
    }

    public String instrumentCanPlay(){
        return "This instrument makes a sound like a " + sound;
    }
}
