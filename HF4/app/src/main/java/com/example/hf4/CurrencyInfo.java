package com.example.hf4;

import java.io.Serializable;

public class CurrencyInfo implements Serializable {
    private String CurrencyName;
    private String CurrencyShort;
    private double SellValue;
    private double BuyValue;
    private int ImageID;

    public CurrencyInfo(String currencyName, String currencyShort, double sellValue, double buyValue, int imageID) {
        CurrencyName = currencyName;
        CurrencyShort = currencyShort;
        SellValue = sellValue;
        BuyValue = buyValue;
        ImageID = imageID;
    }

    public String getCurrencyName() {
        return CurrencyName;
    }

    public void setCurrencyName(String currencyName) {
        CurrencyName = currencyName;
    }

    public String getCurrencyShort() {
        return CurrencyShort;
    }

    public void setCurrencyShort(String currencyShort) {
        CurrencyShort = currencyShort;
    }

    public double getSellValue() {
        return SellValue;
    }

    public void setSellValue(double sellValue) {
        SellValue = sellValue;
    }

    public double getBuyValue() {
        return BuyValue;
    }

    public void setBuyValue(double buyValue) {
        BuyValue = buyValue;
    }

    public int getImageID() {
        return ImageID;
    }

    public void setImageID(int imageID) {
        ImageID = imageID;
    }
}
