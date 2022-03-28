package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void getCurrentStation() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void getCurrentStation1() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void getCurrentStation2() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void getCurrentStation3() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void getCurrentStation4() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(20);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation1() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation2() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation3() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(19);

        int expected = 19;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation4() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(11);

        int expected = 11;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextTransferStation() {

        Radio radio = new Radio(10);

        radio.setCurrentStation(9);
        radio.nextTransferStation();
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextTransferStation1() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(8);
        radio.nextTransferStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextTransferStation2() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(11);
        radio.nextTransferStation();

        int expected = 12;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextTransferStation3() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(19);
        radio.nextTransferStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextTransferStation4() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(0);
        radio.nextTransferStation();

        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevCurrentStation() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(0);
        radio.prevCurrentStation();
        int expected = radio.setToMaxStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevCurrentStation1() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(9);
        radio.prevCurrentStation();
        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevCurrentStation2() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(0);
        radio.prevCurrentStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevCurrentStation3() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(0);
        radio.prevCurrentStation();
        int expected = 19;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevCurrentStation4() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(0);
        radio.prevCurrentStation();
        int expected = radio.setToMaxStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevCurrentStation5() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(15);
        radio.prevCurrentStation();
        int expected = (14);
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        int expected = 49;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(102);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void volume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(50);

        int expected = 50;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeOverMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
}