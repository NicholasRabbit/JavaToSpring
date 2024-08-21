package com.test.optional.opt;

import java.util.Optional;

public class Computer {

    private Optional<SoundCardWithOptional> soundCard;

    public Optional<SoundCardWithOptional> getSoundCard() {
        return soundCard;
    }

    public void setSoundCard(Optional<SoundCardWithOptional> soundCard) {
        this.soundCard = soundCard;
    }
}
