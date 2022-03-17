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

    public void nextTransferStation(int currentStation) {
        if (currentStation == maxStation) {
            currentStation = setToMinStation();
            return;
        }
        currentStation++;

        this.currentStation = currentStation;

    } //Переключаем на +1 станцию

    public void prevCurrentStation(int currentStation) {
        if (currentStation == minStation) {
            currentStation = setToMaxStation();
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

    public void increaseVolume(int currentVolume) {
        if (currentVolume < 100) {
            currentVolume++;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    } //Прибавляем уровень звука

    public void decreaseVolume(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    } //Уменьшаем уровень звука


}
