import Instruments.Instrument;
import Interfaces.IBuy;
import Interfaces.ISell;


import java.util.ArrayList;

public class Shop implements IBuy, ISell {

    private String name;
    private ArrayList<Instrument> instruments;
    private Till till;
    private Instrument instrument;


    public Shop(String name){
        this.name = name;
        this.till = till;
        this.instruments = new ArrayList<>();
        this.instrument = instrument;
    }

    public String getName() {
        return name;
    }


    public int instrumentCount(){
        return instruments.size();
    }

    public void buyInstrument(Instrument instrument){
        instruments.add(instrument);
    }

    public void sellInstrument(Instrument instrument){
        instruments.remove(0);
    }

    public int instrumentHasPrice(Instrument instrument){
        return instrument.getPrice();
    }


}
