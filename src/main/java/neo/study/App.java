package neo.study;

import neo.study.adapter.USBDevice;
import neo.study.adapter.USBFlash;
import neo.study.adapter.Computer;
import neo.study.adapter.SDCard;
import neo.study.adapter.USBAdapter;
import neo.study.factory.Coffee;
import neo.study.factory.CoffeeFactory;
import neo.study.factory.CoffeeType;
import neo.study.proxy.DatabaseConnection;
import neo.study.proxy.DatabaseConnectionImpl;
import neo.study.proxy.DatabaseConnectionProxy;
import neo.study.singleton.LoggerSingleton;

public class App {
    public static void main(String[] args) {
        // Singleton
        System.out.println("<------------------Singleton-------------------->");
        LoggerSingleton logger = LoggerSingleton.getInstance();
        logger.classLog(logger, "Some info"); // Log info: 04.06.25 - LoggerSingleton - Some info
        System.out.println("<------------------Singleton-------------------->\n");


        // Factory
        System.out.println("<-------------------Factory--------------------->");
        Coffee coffee = CoffeeFactory.createCoffee(CoffeeType.ESPRESSO);
        coffee.prepareCoffee();

        coffee = CoffeeFactory.createCoffee(CoffeeType.AMERICANO);
        coffee.prepareCoffee();
        System.out.println("<-------------------Factory--------------------->\n");


        // Adapter
        System.out.println("<-------------------Adapter--------------------->");
        Computer computer = new Computer();
        computer.readFromUSB(new USBFlash());

        USBDevice device = new USBAdapter(new SDCard());
        computer.readFromUSB(device);

        // computer.readFromUSB(new SDCard()); ERROR
        System.out.println("<-------------------Adapter--------------------->\n");

        // Proxy
        System.out.println("<--------------------Proxy---------------------->");
        DatabaseConnectionImpl database = new DatabaseConnectionImpl("test_db");
        System.out.println(database.connect());

        DatabaseConnection proxy = new DatabaseConnectionProxy(database, "localhost", 3306);
        System.out.println(proxy.connect());
        System.out.println("<--------------------Proxy---------------------->\n");
    }
}
