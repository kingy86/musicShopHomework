package Instruments;

public class Brass extends Instruments.Instrument {

    private String type;
    private String sound;

    public Brass(String brand, int price, String type, String sound) {
        super(brand, price);
        this.type = type;
        this.sound = sound;
    }

    public String getType() {
        return type;
    }

}
