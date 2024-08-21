package com.test.optional.opt;

import java.util.Optional;

public class SoundCardWithOptional {

    public Optional<UsbWithOptional> getUsb() {
        return usb;
    }

    public void setUsb(Optional<UsbWithOptional> usb) {
        this.usb = usb;
    }

    private Optional<UsbWithOptional> usb;
}
