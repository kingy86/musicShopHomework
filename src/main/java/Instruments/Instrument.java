package Instruments;

public class Instrument {

    private String brand;
    private int price;

    public Instrument(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    public String instrumentCanPlay(){
//        return "Musical sounds";
//    }


}
