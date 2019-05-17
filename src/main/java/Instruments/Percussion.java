package Instruments;

public class Percussion extends Instruments.Instrument {

    private String type;
    private String sound;

    public Percussion(String brand, int price, String type, String sound) {
        super(brand, price);
        this.type = type;
        this.sound = sound;
    }

    public String getType() {
        return type;
    }
}
