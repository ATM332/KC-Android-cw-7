package com.example.cw7;

public class Items {

    private String itemName;
    private String itemArtist;
    private int itemImage;
    private double itemPrice;

    public Items(String itemName, String itemArtist, int itemImage, double itemPrice) {
        this.itemName = itemName;
        this.itemArtist = itemArtist;
        this.itemImage = itemImage;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemArtist() {
        return itemArtist;
    }

    public void setItemArtist(String itemArtist) {
        this.itemArtist = itemArtist;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
