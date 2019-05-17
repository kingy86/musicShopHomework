package Instruments;

public class String extends Instruments.Instrument {

    private java.lang.String type;
    private java.lang.String sound;

    public String(String brand, int price, java.lang.String type, java.lang.String sound) {
        super(brand, price);
        this.type = type;
        this.sound = sound;
    }

    public java.lang.String getType() {
        return type;
    }
}