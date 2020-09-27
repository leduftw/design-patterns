package main;

import adapter.LightningToMicroUSBAdapter;
import phones.Android;
import phones.IPhone;
import phones.LightningPhone;
import phones.MicroUSBPhone;

public class Main {

    private static void rechargeMicroUSBPhone(MicroUSBPhone phone) {
        phone.useMicroUSB();
        phone.recharge();
    }

    private static void rechargeLightningPhone(LightningPhone phone) {
        phone.useLightning();
        phone.recharge();
    }

    public static void main(String[] args) {
        Android android = new Android();
        IPhone iPhone = new IPhone();

        System.out.println("Recharging Android phone with micro USB cable...");
        rechargeMicroUSBPhone(android);
        System.out.println();

        System.out.println("Recharging iPhone with lightning cable...");
        rechargeLightningPhone(iPhone);
        System.out.println();

        // With lightning to micro USB adapter, we can recharge iPhone with micro USB cable
        System.out.println("Recharging iPhone with micro USB cable...");
        rechargeMicroUSBPhone(new LightningToMicroUSBAdapter(iPhone));
        System.out.println();

        /*
        System.out.println("Recharging Android phone with lightning cable...");
        rechargeLightningPhone(android);  // error, no lightning adapter for Android
        System.out.println();
        */
    }

}
