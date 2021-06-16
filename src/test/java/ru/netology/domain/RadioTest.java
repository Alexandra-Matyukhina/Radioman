package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldInitField() {
        Radio radio = new Radio();
        assertNull(radio.getName());
        assertEquals(10, radio.getMaxNumberRadioStation());
        assertEquals(0, radio.getMinNumberRadioStation());
        assertEquals(0, radio.getCurrentRadioStation());
        assertEquals(100, radio.getMaxSoundVolume());
        assertEquals(0, radio.getMinSoundVolume());
        assertEquals(0, radio.getCurrentSoundVolume());
        assertFalse(radio.isOn());
    }

    @Test
    public void radioName() {
        Radio radio = new Radio("Europa Plus", 10, 0, 0, 100, 0, 0, true);
        assertEquals("Europa Plus", radio.getName());
    }

    @Test
    public void shouldSwitchStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchStation3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.nextRadioStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchStation4() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.prevRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchStation5() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchStation6() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.prevRadioStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchStation7() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-3);
        radio.prevRadioStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseSound() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldIncreaseSound1() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldIncreaseSound2() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(101);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentSoundVolume());
    }
    @Test
    public void shouldIncreaseSound3() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldDecreaseSound() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentSoundVolume());
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
    public void shouldDecreaseSound3() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(7);
        radio.decreaseVolume();
        assertEquals(6, radio.getCurrentSoundVolume());
    }

    @Test
    public void shouldCheckMaxMinStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(25);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(-8);
        radio.prevRadioStation();
        assertEquals(10, radio.getCurrentRadioStation());
    }
    @Test
    public void shouldCheckRange(){
        Radio radio = new Radio("Europa Plus",40, 0, 28, 10, 0, 0, true);
        radio.nextRadioStation();
        assertEquals(29, radio.getCurrentRadioStation());
    }
    @Test
    public void shouldCheckRange2(){
        Radio radio = new Radio("Maximum", 20, 5, 6, 10, 0, 0, true);
        radio.prevRadioStation();
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChekSetter() {
        Radio radio = new Radio("Hit", 18, -4, 5, 25, 2, 16, true);
        assertEquals(18, radio.getMaxNumberRadioStation());
        assertEquals(-4, radio.getMinNumberRadioStation());
        assertEquals(5, radio.getCurrentRadioStation());
        assertEquals(25, radio.getMaxSoundVolume());
        assertEquals(2, radio.getMinSoundVolume());
        radio.setCurrentSoundVolume(16);
        assertEquals(16, radio.getCurrentSoundVolume());
    }

}
