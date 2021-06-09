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
        if(currentRadioStation > maxNumberRadioStation){
            currentRadioStation = maxNumberRadioStation;
        }
        if(currentRadioStation < minNumberRadioStation){
            currentRadioStation = minNumberRadioStation;
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
            currentSoundVolume = maxSoundVolume;
        }
        if (currentSoundVolume < minSoundVolume) {
            currentSoundVolume = minSoundVolume;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public int nextRadioStation() {
        if(currentRadioStation >= maxNumberRadioStation){
            currentRadioStation = minNumberRadioStation;
            return minNumberRadioStation;
        }
            currentRadioStation ++;

        return currentRadioStation;
    }
    public int prevRadioStation(){
        if(currentRadioStation <= minNumberRadioStation){
            currentRadioStation = maxNumberRadioStation;
            return maxNumberRadioStation;
        }
        currentRadioStation --;

        return currentRadioStation;
    }



    public void increaseVolume() {
        if (currentSoundVolume >= maxSoundVolume) {
            return;
        }
        currentSoundVolume ++;
    }

    public void decreaseVolume() {
        if (currentSoundVolume <= minSoundVolume) {
            return;
        }
        currentSoundVolume --;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}

