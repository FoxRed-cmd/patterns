package neo.study.factory;

public class Espresso extends Coffee {

    public Espresso() {
        this.name = CoffeeType.ESPRESSO.name();
    }

    @Override
    public void prepareCoffee() {
        System.out.println("Preparing " + this.name);
    }

}
