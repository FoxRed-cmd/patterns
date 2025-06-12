package neo.study.factory;

public class Americano extends Coffee {

    public Americano() {
        this.name = CoffeeType.AMERICANO.name();
    }

    @Override
    public void prepareCoffee() {
        System.out.println("Preparing " + this.name);
    }

}
