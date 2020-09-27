package adapter;

import phones.LightningPhone;
import phones.MicroUSBPhone;

public class LightningToMicroUSBAdapter implements MicroUSBPhone {

    private final LightningPhone lightningPhone;

    public LightningToMicroUSBAdapter(LightningPhone lightningPhone) {
        this.lightningPhone = lightningPhone;
    }

    public void recharge() {
        lightningPhone.recharge();
    }

    public void useMicroUSB() {
        System.out.println("Micro USB cable connected!");
        lightningPhone.useLightning();
    }

}
