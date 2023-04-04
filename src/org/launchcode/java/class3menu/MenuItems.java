package org.launchcode.java.class3menu;

public class MenuItems {
    private String name;
    private String description;
    private String category;
    private double price;
    private boolean isAvailable;
    private boolean itemNew;
    private boolean isVegan;
    private String proteinType;
    private int spiceLevel;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isItemNew() {
        return itemNew;
    }

    public void setItemNew(boolean itemNew) {
        this.itemNew = itemNew;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public String getProteinType() {
        return proteinType;
    }

    public void setProteinType(String proteinType) {
        this.proteinType = proteinType;
    }

    public int getSpiceLevel() {
        return spiceLevel;
    }

    public void setSpiceLevel(int spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    public MenuItems(String name, String description, String category,
                    boolean isAvailable, boolean itemNew,
                    boolean isVegan, String proteinType, int spiceLevel){
        this.name = name;
        this.description = description;
        this.category = category;
        this.isAvailable = isAvailable;
        this.itemNew = itemNew;
        this.isVegan = isVegan;
        this.proteinType = proteinType;
        this.spiceLevel = spiceLevel;
    };

}
