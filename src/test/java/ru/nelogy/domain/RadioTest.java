package ru.nelogy.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldNotChangeStationMore() {
        Radio radio = new Radio();
        radio.setMaxRadiostation(10);
        radio.setMinRadiostation(0);
        radio.setCurrentStation(100);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldNotChangeStationLess() {
        Radio radio = new Radio();
        radio.setMaxRadiostation(10);
        radio.setMinRadiostation(0);
        radio.setCurrentStation(-5);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeStation() {
        Radio radio = new Radio();
        radio.setMaxRadiostation(10);
        radio.setMinRadiostation(0);
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setMaxRadiostation(10);
        radio.setMinRadiostation(0);
        radio.setCurrentStation(5);
        radio.setNextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMinStation() {
        Radio radio = new Radio();
        radio.setMaxRadiostation(10);
        radio.setMinRadiostation(0);
        radio.setCurrentStation(10);
        radio.setNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPreviousStation() {
        Radio radio = new Radio();
        radio.setMaxRadiostation(10);
        radio.setMinRadiostation(0);
        radio.setCurrentStation(5);
        radio.setPreviousStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio();
        radio.setMaxRadiostation(10);
        radio.setMinRadiostation(0);
        radio.setCurrentStation(0);
        radio.setPreviousStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(100);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(-5);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetNextVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        radio.increaseCurrentVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetNextVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);
        radio.increaseCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPreviousVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        radio.decreaseCurrentVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetPreviousVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());

    }

}