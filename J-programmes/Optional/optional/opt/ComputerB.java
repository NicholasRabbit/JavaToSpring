package com.test.optional.opt;

import java.util.Optional;

public class ComputerB {

    private Optional<SoundCardB> soundCard;

    public Optional<SoundCardB> getSoundCard() {
        return soundCard;
    }

    public void setSoundCard(Optional<SoundCardB> soundCard) {
        this.soundCard = soundCard;
    }
}
