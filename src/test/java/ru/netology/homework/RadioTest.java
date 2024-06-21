package ru.netology.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void permissibleStationValue() {
        Radio station = new Radio();

        station.setStationNumber(8);

        int expected = 8;
        int actual = station.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void negativeStationNumber() {
        Radio station = new Radio();

        station.setStationNumber(-1);

        int expected = 0;
        int actual = station.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void invalidStationValue() {
        Radio station = new Radio();

        station.setStationNumber(10);

        int expected = 0;
        int actual = station.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingStationsInCircle() {
        Radio station = new Radio();
        station.setStationNumber(9);

        station.next();
        int expected = 0;
        int actual = station.getStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void switchToNextStation() {
        Radio station = new Radio();
        station.setStationNumber(7);

        station.next();
        int expected = 8;
        int actual = station.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingStationsInCircleRevers() {
        Radio station = new Radio();
        station.setStationNumber(0);

        station.prev();
        int expected = 9;
        int actual = station.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchToPrevStation() {
        Radio station = new Radio();
        station.setStationNumber(3);

        station.prev();
        int expected = 2;
        int actual = station.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void permissibleVolumeValue(){
        Radio volume = new Radio();

        volume.setVolume(5);
        int expected = 5;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void InvalidVolumeValue(){
        Radio volume = new Radio();

        volume.setVolume(101);
        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume(){
        Radio volume = new Radio();

        volume.setVolume(50);
        volume.increaseVolume();
        int expected = 51;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolume(){
        Radio volume = new Radio();

        volume.setVolume(100);
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minVolume(){
        Radio volume = new Radio();

        volume.setVolume(0);
        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeVolume(){
        Radio volume = new Radio();

        volume.setVolume(-1);
        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolume(){
        Radio volume = new Radio();

        volume.setVolume(10);
        volume.decreaseVolume();
        int expected = 9;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
