package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setTheVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(50);

        int expected = 50;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void notExceedMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notExceedMinVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeByOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(60);

        rad.increaseVolume();

        int expected = 61;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeByOneMoreMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void dovnVolumeByOne() {
        Radio rad = new Radio();
        rad.setCurrentVolume(6);

        rad.downVolume();

        int expected = 5;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void dovnVolumeByOneMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.downVolume();

        int expected = 0;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void installRadioStation() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(4);

        int expected = 4;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void changeStationsForwardMax() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(10);

        rad.nextStation();

        int expected = 1;
        int actual = rad.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationsBackMin() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(-1);

        rad.prevStation();

        int expected = 9;
        int actual = rad.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationForward() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(4);

        rad.nextStation();

        int expected = 5;
        int actual = rad.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeStationBack() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(4);

        rad.prevStation();

        int expected = 3;
        int actual = rad.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minBoundaries() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(0);

        rad.prevStation();

        int expected = 9;
        int actual = rad.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxBoundaries() {
        Radio rad = new Radio();
        rad.setRadioStationNumber(9);

        rad.nextStation();

        int expected = 0;
        int actual = rad.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }


}