package ru.netology.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void numberOfHundredRadioStations() {
        Radio station = new Radio(10);

        Assertions.assertEquals(10, station.getNumberOfHundredRadioStations());
    }

    @Test
    public void permissibleStationValue() {
        Radio station = new Radio(10);
        station.setStationNumber(8);

        Assertions.assertEquals(8, station.getStationNumber());
    }

    @Test
    public void negativeStationNumber() {
        Radio station = new Radio(10);

        station.setStationNumber(-1);

        Assertions.assertEquals(0, station.getStationNumber());
    }

    @Test
    public void invalidStationValue() {
        Radio station = new Radio(10);

        station.setStationNumber(11);

        Assertions.assertEquals(0, station.getStationNumber());
    }

    @Test
    public void switchingStationsInCircle() {
        Radio station = new Radio(10);
        station.setStationNumber(9);

        station.nextStation();

        Assertions.assertEquals(0, station.getStationNumber());

    }

    @Test
    public void switchingStationToFront() {
        Radio station = new Radio(10);
        station.setStationNumber(6);

        station.nextStation();

        Assertions.assertEquals(7, station.getStationNumber());

    }

    @Test
    public void switchingStationsInCircleRevers() {
        Radio station = new Radio(10);
        station.setStationNumber(0);

        station.prevStation();
        Assertions.assertEquals(9, station.getStationNumber());
    }

    @Test
    public void switchToPrevStation() {
        Radio station = new Radio(10);
        station.setStationNumber(3);

        station.prevStation();

        Assertions.assertEquals(2, station.getStationNumber());
    }

    @Test
    public void noNumberOfRadioStations() {
        Radio station = new Radio();
        station.setStationNumber(5);
        station.prevStation();

        Assertions.assertEquals(4, station.getStationNumber());
    }

    @Test
    public void permissibleVolumeValue() {
        Radio volume = new Radio();

        volume.setVolume(5);

        Assertions.assertEquals(5, volume.getVolume());
    }

    @Test
    public void InvalidVolumeValue() {
        Radio volume = new Radio();

        volume.setVolume(101);

        Assertions.assertEquals(0, volume.getVolume());
    }

    @Test
    public void increaseVolume() {
        Radio volume = new Radio();

        volume.setVolume(50);
        volume.increaseVolume();

        Assertions.assertEquals(51, volume.getVolume());
    }

    @Test
    public void maxVolume() {
        Radio volume = new Radio();

        volume.setVolume(100);
        volume.increaseVolume();

        Assertions.assertEquals(100, volume.getVolume());
    }

    @Test
    public void minVolume() {
        Radio volume = new Radio();

        volume.setVolume(0);
        volume.decreaseVolume();

        Assertions.assertEquals(0, volume.getVolume());
    }

    @Test
    public void negativeVolume() {
        Radio volume = new Radio();

        volume.setVolume(-1);
        volume.decreaseVolume();

        Assertions.assertEquals(0, volume.getVolume());
    }

    @Test
    public void decreaseVolume() {
        Radio volume = new Radio();

        volume.setVolume(10);
        volume.decreaseVolume();

        Assertions.assertEquals(9, volume.getVolume());
    }


}
