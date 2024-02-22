package ru.netology.javaqa;

public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int radioStationNumber = minRadioStation;

    public Radio() {

    }

    public Radio(int size) {
        maxRadioStation = minRadioStation + size;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;

    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }

    }

    public void downVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }

    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }


    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < minRadioStation) {
            return;
        }
        if (newRadioStationNumber > maxRadioStation) {
            return;
        }
        radioStationNumber = newRadioStationNumber;

    }

    public void nextStation() {
        if (radioStationNumber < maxRadioStation) {
            radioStationNumber = radioStationNumber + 1;
        } else {
            radioStationNumber = minRadioStation;
        }

    }

    public void prevStation() {
        if (radioStationNumber > minRadioStation) {
            radioStationNumber = radioStationNumber - 1;
        } else {
            radioStationNumber = maxRadioStation;
        }

    }
}