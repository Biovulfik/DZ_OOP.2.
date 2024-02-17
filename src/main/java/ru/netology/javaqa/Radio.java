package ru.netology.javaqa;

public class Radio {
    public int currentVolume;
    public int radioStationNumber;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;

    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }

    }

    public void downVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }

    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            return;
        }
        if (newRadioStationNumber > 9) {
            return;
        }
        radioStationNumber = newRadioStationNumber;

    }

    public void nextStation() {
        if (radioStationNumber < 9) {
            radioStationNumber = radioStationNumber + 1;
        } else {
            radioStationNumber = 0;
        }

    }

    public void prevStation() {
        if (radioStationNumber > 0) {
            radioStationNumber = radioStationNumber - 1;
        } else {
            radioStationNumber = 9;
        }

    }
}