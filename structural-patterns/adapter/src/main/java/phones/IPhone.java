package phones;

public class IPhone implements LightningPhone {

    private boolean lightningConnected = false;

    public void recharge() {
        if(lightningConnected) {
            System.out.println("iPhone successfully recharged!");
        } else {
            System.out.println("First connect lightning cable!");
        }
    }

    public void useLightning() {
        lightningConnected = true;
        System.out.println("Lightning cable connected!");
    }

}
