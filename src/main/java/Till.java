public class Till {

    private int money;

    public Till(int money) {
        this.money = money;
    }

    public int moneyInTill() {
        return money;
    }

    public int removeMoney(int money){
        return this.money -= money;
    }

    public int addMoney(int money){
        return this.money += money;
    }


}
