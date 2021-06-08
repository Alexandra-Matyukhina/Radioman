package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldInitField() {
        Radio radio = new Radio();
        assertNull(radio.getName());
        assertEquals(9, radio.getMaxNumberRadioStation());
        assertEquals(0, radio.getMinNumberRadioStation());
        assertEquals(0, radio.getCurrentRadioStation());
        assertEquals(10, radio.getMaxSoundVolume());
        assertEquals(0, radio.getMinSoundVolume());
        assertEquals(0, radio.getCurrentSoundVolume());
        assertFalse(radio.isOn());
    }

    @Test
    public void radioName() {
        Radio radio = new Radio();
        String expected = "Europa Plus";
        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());
    }

    @Test
    public void shouldSwitchStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.nextRadioStation();
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchStation3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.nextRadioStation();
        assertEquals(3, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchStation4() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.nextRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchStation5() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchStation6() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.nextRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchStation7() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-3);
        radio.nextRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseSound() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(9);
        radio.increaseVolume();
        assertEquals(9, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldIncreaseSound1() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldIncreaseSound2() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(11);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldDecreaseSound() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(1);
        radio.decreaseVolume();
        assertEquals(1, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldDecreaseSound1() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldDecreaseSound2() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldCheckMaxMinStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(25);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(-8);
        radio.nextRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }
    @Test
    public void shouldCheckRange(){
        Radio radio = new Radio();
        radio.setMaxNumberRadioStation(40);
        radio.setCurrentRadioStation(28);
        radio.nextRadioStation();
        assertEquals(28, radio.getCurrentRadioStation());
    }
    @Test
    public void shouldCheckRange2(){
        Radio radio = new Radio();
        radio.setMinNumberRadioStation(15);
        radio.setCurrentRadioStation(15);
        radio.nextRadioStation();
        assertEquals(15, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChekSetter() {
        Radio radio = new Radio();
        radio.setMaxNumberRadioStation(18);
        assertEquals(18, radio.getMaxNumberRadioStation());
        radio.setMinNumberRadioStation(-4);
        assertEquals(-4, radio.getMinNumberRadioStation());
        radio.setCurrentRadioStation(5);
        assertEquals(5, radio.getCurrentRadioStation());
        radio.setMaxSoundVolume(25);
        assertEquals(25, radio.getMaxSoundVolume());
        radio.setMinSoundVolume(2);
        assertEquals(2, radio.getMinSoundVolume());
        radio.setCurrentSoundVolume(16);
        assertEquals(16, radio.getCurrentSoundVolume());
        radio.setOn(false);
        assertFalse(radio.isOn());
    }

}
