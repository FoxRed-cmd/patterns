package neo.study.adapter;

public class Computer {
    public void readFromUSB(USBDevice usb) {
        System.out.println("Reading " + usb.getData());
    }
}
