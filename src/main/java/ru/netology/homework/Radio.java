package ru.netology.homework;

public class Radio {
    private int numberOfHundredRadioStations = 10;
    private int stationNumber;
    private int volume;

    public Radio(int numberOfHundredRadioStations) {
        this.numberOfHundredRadioStations = numberOfHundredRadioStations;
    }

    public Radio() {
    }


    public int getNumberOfHundredRadioStations() {
        return numberOfHundredRadioStations;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber >= 0 && newStationNumber < numberOfHundredRadioStations) {
            this.stationNumber = newStationNumber;
        }
    }

    public void nextStation() {
        if (getStationNumber() < numberOfHundredRadioStations - 1) {
            this.stationNumber++;
        } else {
            this.stationNumber = 0;
        }

    }

    public void prevStation() {
        if (getStationNumber() == 0) {
            this.stationNumber = numberOfHundredRadioStations - 1;
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



