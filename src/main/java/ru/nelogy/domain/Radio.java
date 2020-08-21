package ru.nelogy.domain;

public class Radio {

    private int currentRadiostation;
    private int maxRadiostation;
    private int minRadiostation;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;

    public void setMaxRadiostation(int maxStation) {
        this.maxRadiostation = maxStation;
    }

    public void setMinRadiostation(int minStation) {
        this.minRadiostation = minStation;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentStation() {
        return currentRadiostation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxRadiostation) {
            return;
        }
        if (currentStation < minRadiostation) {
            return;
        }
        this.currentRadiostation = currentStation;
    }

    public void setNextStation() {
        int nextStation = currentRadiostation + 1;
        if (nextStation > maxRadiostation) {
            this.currentRadiostation = minRadiostation;
        } else
            this.currentRadiostation = nextStation;
    }

    public void setPreviousStation() {
        int previousStation = currentRadiostation - 1;
        if (previousStation < minRadiostation) {
            this.currentRadiostation = maxRadiostation;
        } else
            this.currentRadiostation = previousStation;
    }

    public int getMaxStation() {

        return maxRadiostation;
    }


    public int getMinStation() {
        return minRadiostation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentVolume() {
        int nextVolume = currentVolume + 1;
        if (nextVolume > maxVolume) {
            return;
        }
        this.currentVolume = nextVolume;
    }

    public void decreaseCurrentVolume() {
        int previousVolume = currentVolume - 1;
        if (previousVolume < minVolume) {
            return;
        } else
            this.currentVolume = previousVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }


    public int getMinVolume() {
        return minVolume;
    }
}
