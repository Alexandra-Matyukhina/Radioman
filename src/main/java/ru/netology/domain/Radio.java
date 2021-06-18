package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private String name;
    private int maxNumberRadioStation = 10;
    private int minNumberRadioStation = 0;
    private int currentRadioStation;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private int currentSoundVolume;
    private boolean on;


    public Radio(int maxNumberRadioStation) {
        this.maxNumberRadioStation = maxNumberRadioStation;
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

