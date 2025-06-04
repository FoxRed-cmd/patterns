package neo.study.adapter;

public class USBFlash implements USBDevice {
    private String data = "data from USBFlash";

    @Override
    public String getData() {
        return data;
    }
}
