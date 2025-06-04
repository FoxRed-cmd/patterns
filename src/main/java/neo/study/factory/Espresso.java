package neo.study.factory;

public class Espresso extends Coffee {

    public Espresso(String name) {
        super(name);
    }

    @Override
    public void prepareCoffee() {
        System.out.println("Preparing " + this.name);
    }

}
