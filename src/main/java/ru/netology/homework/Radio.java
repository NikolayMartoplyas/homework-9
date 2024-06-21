package ru.netology.homework;

public class Radio {
    private int stationNumber;
    private int volume;

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber >= 0 && newStationNumber <= 9) {
            this.stationNumber = newStationNumber;
        } else {
            return;
        }

    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void next() {
        if (getStationNumber() == 9) {
            setStationNumber(0);
        } else {
            this.stationNumber++;
        }
    }

    public void prev() {
        if (getStationNumber() == 0) {
            setStationNumber(9);
        } else {
            this.stationNumber--;
        }
    }

    public void setVolume(int newVolume) {
        if (newVolume >= 0 && newVolume <= 100) {
            this.volume = newVolume;
        } else {
            return;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if (getVolume() < 100) {
            this.volume += 1;
        }
    }

    public void decreaseVolume() {
        if (getVolume() > 0) {
            this.volume -= 1;
        }
    }

}



