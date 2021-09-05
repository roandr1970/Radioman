package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.currentVolume;
        assertEquals(expected, actual);
        radio.currentVolume = 10;
        radio.increaseVolume();
        expected = 10;
        actual = radio.currentVolume;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.currentVolume;
        assertEquals(expected, actual);
        radio.currentVolume = 10;
        radio.decreaseVolume();
        expected = 9;
        actual = radio.currentVolume;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio radio = new Radio();
        radio.prevRadioStation();
        int expected = 9;
        int actual = radio.currentRadioStation;
        assertEquals(expected, actual);
        radio.currentRadioStation = 5;
        radio.prevRadioStation();
        expected = 4;
        actual = radio.currentRadioStation;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {
        Radio radio = new Radio();
        radio.nextRadioStation();
        int expected = 1;
        int actual = radio.currentRadioStation;
        assertEquals(expected, actual);
        radio.currentRadioStation = 9;
        radio.nextRadioStation();
        expected = 0;
        actual = radio.currentRadioStation;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        int expected = 6;
        int actual = radio.currentRadioStation;
        assertEquals(expected, actual);
        radio.setCurrentRadioStation(10);
        expected = 6;
        actual = radio.currentRadioStation;
        assertEquals(expected, actual);
        radio.setCurrentRadioStation(-1);
        expected = 6;
        actual = radio.currentRadioStation;
        assertEquals(expected, actual);
    }
}