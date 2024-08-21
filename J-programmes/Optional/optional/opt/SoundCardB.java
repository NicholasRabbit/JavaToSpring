package com.test.optional.opt;

import java.util.Optional;

public class SoundCardB {

    private String name;

    public SoundCardB() {
    }

    public SoundCardB(String name) {
        this.name = name;
    }

    public Optional<UsbB> getUsb() {
        return usb;
    }

    public void setUsb(Optional<UsbB> usb) {
        this.usb = usb;
    }

    private Optional<UsbB> usb;

    public String getName() {
        return this.name;
    }
}
