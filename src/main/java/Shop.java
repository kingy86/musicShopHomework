import Instruments.Instrument;


import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Instrument> instruments;
    private Till till;


    public Shop(String name){
        this.name = name;
        this.till = till;
        this.instruments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
}
