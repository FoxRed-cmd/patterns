package neo.study.factory;

public class Americano extends Coffee {
    public Americano(String name) {
        super(name);
    }

    @Override
    public void prepareCoffee() {
        System.out.println("Preparing " + this.name);
    }

}
