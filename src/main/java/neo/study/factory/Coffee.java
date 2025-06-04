package neo.study.factory;

public abstract class Coffee {
    protected String name;

    public Coffee(String name) {
        this.name = name;
    }

    public abstract void prepareCoffee();
}
