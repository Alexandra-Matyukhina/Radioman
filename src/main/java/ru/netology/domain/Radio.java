package ru.netology.domain;

public class Radio {
    private String name;
    private int maxNumberRadioStation = 9;
    private int minNumberRadioStation = 0;
    private int currentRadioStation;
    private int maxSoundVolume = 10;
    private int minSoundVolume = 0;
    private int currentSoundVolume;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxNumberRadioStation() {
        return maxNumberRadioStation;
    }

    public void setMaxNumberRadioStation(int maxNumberRadioStation) {
        this.maxNumberRadioStation = maxNumberRadioStation;
    }

    public int getMinNumberRadioStation() {
        return minNumberRadioStation;
    }

    public void setMinNumberRadioStation(int minNumberRadioStation) {
        this.minNumberRadioStation = minNumberRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation <= maxNumberRadioStation) {
            this.currentRadioStation = currentRadioStation;
        } else {
            currentRadioStation = minNumberRadioStation;
        }

        if (currentRadioStation >= minNumberRadioStation) {
            this.currentRadioStation = currentRadioStation;
        } else {
            currentRadioStation = maxNumberRadioStation;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > maxSoundVolume) {
            this.currentSoundVolume = maxSoundVolume;
            return;
        }
        if (currentSoundVolume < minSoundVolume) {
            this.currentRadioStation = minNumberRadioStation;
            return;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public int nextRadioStation() {
        if (currentRadioStation <= maxNumberRadioStation) {
            currentRadioStation = currentRadioStation;
        }
        return currentRadioStation;
    }

    public void increaseVolume() {
        if (currentSoundVolume >= maxSoundVolume) {
            return;
        }
        currentSoundVolume = currentSoundVolume;
    }

    public void decreaseVolume() {
        if (currentSoundVolume <= minSoundVolume) {
            return;
        }
        currentRadioStation = currentSoundVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}

