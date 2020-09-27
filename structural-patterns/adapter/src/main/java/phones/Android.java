package phones;

public class Android implements MicroUSBPhone {

    private boolean microUSBConnected = false;

    public void recharge() {
        if (microUSBConnected) {
            System.out.println("Android successfully recharged!");
        } else {
            System.out.println("First connect micro USB cable!");
        }
    }

    public void useMicroUSB() {
        microUSBConnected = true;
        System.out.println("Micro USB cable connected!");
    }

}
