package neo.study.factory;

public class CoffeeFactory {
    public static Coffee createCoffee(CoffeeType type) {
        switch (type) {
            case ESPRESSO:
                return new Espresso(type.name());
            case AMERICANO:
                return new Americano(type.name());
            default:
                throw new IllegalArgumentException("Неизвестный тип кофе: " + type);
        }
    }
}
