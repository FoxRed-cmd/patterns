package neo.study.adapter;

public class USBAdapter implements USBDevice {
    private SDCard card;

    public USBAdapter(SDCard card) {
        this.card = card;
    }

    @Override
    public String getData() {
        return card.getData();
    }

}
