package ru.netology.domain;

public class Radio {
    private String name;
    private int maxNumberRadioStation = 10;
    private int minNumberRadioStation = 0;
    private int currentRadioStation;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private int currentSoundVolume;
    private boolean on;

    public Radio(String name, int maxNumberRadioStation, int minNumberRadioStation, int currentRadioStation, int maxSoundVolume, int minSoundVolume, int currentSoundVolume, boolean on) {
        this.name = name;
        this.maxNumberRadioStation = maxNumberRadioStation;
        this.minNumberRadioStation = minNumberRadioStation;
        this.currentRadioStation = currentRadioStation;
        this.maxSoundVolume = maxSoundVolume;
        this.minSoundVolume = minSoundVolume;
        this.currentSoundVolume = currentSoundVolume;
        this.on = on;
    }

    public Radio() {
    }

    public Radio(int maxNumberRadioStation) {
        this.maxNumberRadioStation = maxNumberRadioStation;
    }

    public String getName() {
        return name;
    }

    public int getMaxNumberRadioStation() {
        return maxNumberRadioStation;
    }

    public int getMinNumberRadioStation() {
        return minNumberRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxNumberRadioStation) {
            currentRadioStation = maxNumberRadioStation;
        }
        if (currentRadioStation < minNumberRadioStation) {
            currentRadioStation = minNumberRadioStation;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > maxSoundVolume) {
            currentSoundVolume = maxSoundVolume;
        }
        if (currentSoundVolume < minSoundVolume) {
            currentSoundVolume = minSoundVolume;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public int nextRadioStation() {
        if (currentRadioStation >= maxNumberRadioStation) {
            currentRadioStation = minNumberRadioStation;
            return minNumberRadioStation;
        }
        currentRadioStation++;

        return currentRadioStation;
    }

    public int prevRadioStation() {
        if (currentRadioStation <= minNumberRadioStation) {
            currentRadioStation = maxNumberRadioStation;
            return maxNumberRadioStation;
        }
        currentRadioStation--;

        return currentRadioStation;
    }


    public void increaseVolume() {
        if (currentSoundVolume >= maxSoundVolume) {
            return;
        }
        currentSoundVolume++;
    }

    public void decreaseVolume() {
        if (currentSoundVolume <= minSoundVolume) {
            return;
        }
        currentSoundVolume--;
    }
}

