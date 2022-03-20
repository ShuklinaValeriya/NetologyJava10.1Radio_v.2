package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationQuantity = 10;
    private int maxStation = stationQuantity - 1;
    private int minStation = 0;

    public Radio() {
    }

    public Radio(int stationQuantity) {
        this.stationQuantity = stationQuantity;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setToMaxStation() {
        this.currentStation = maxStation;
        return 0;
    }

    public int setToMinStation() {
        this.currentStation = minStation;
        return 0;
    }


    // Работа с радиостанциями:

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    } //Устанавливаем конкретную станцию

    public void nextTransferStation() {
        if (currentStation == 9) {
            currentStation = 0;
            return;
        }
        currentStation++;

        this.currentStation = currentStation;

    } //Переключаем на +1 станцию

    public void prevCurrentStation() {
        if (currentStation == 0) {
            currentStation = 9;
            return;
        }
        currentStation--;

        this.currentStation = currentStation;
    } //Переключаем на -1 станцию


    // Работа с уровнем громкости звука:

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    } //Устанавливаем ур-нь звука

    public void increaseVolume() {
        if (currentVolume == 100) {
            currentVolume = 100;
            return;
        }
        currentVolume++;

    } //Прибавляем уровень звука

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }

    } //Уменьшаем уровень звука


}
