package org.launchcode.java.class3menu;
import java.time.LocalDate;
import java.util.Date;

public class MenuItems {
    private String name;
    private String description;
    private String category;
    private double price;
    private boolean itemNew;
    private String proteinType;
    private int spiceLevel;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


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


    public boolean isItemNew() {
        return itemNew;
    }

    public void setItemNew(boolean itemNew) {
        this.itemNew = itemNew;
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
                      String proteinType, int spiceLevel, Date date){
        this.name = name;
        this.description = description;
        this.category = category;
        this.itemNew = false;
        this.proteinType = proteinType;
        this.spiceLevel = spiceLevel;
        this.date =  date;
    };

}
