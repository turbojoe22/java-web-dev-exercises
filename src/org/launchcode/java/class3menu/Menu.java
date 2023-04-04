package org.launchcode.java.class3menu;
import java.util.ArrayList;
public class Menu {
public ArrayList<String> itemsOnMenu = new ArrayList<>();
private String dateChanged;

    public ArrayList<String> getItemsOnMenu() {
        return itemsOnMenu;
    }

    public void setItemsOnMenu(ArrayList<String> itemsOnMenu) {
        this.itemsOnMenu = itemsOnMenu;
    }

    public String getDateChanged() {
        return dateChanged;
    }

    public void setDateChanged(String dateChanged) {
        this.dateChanged = dateChanged;
    }
}
