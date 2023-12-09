package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date lastMenuUpdate;

    public Menu(ArrayList<MenuItem> menuItems, Date lastMenuUpdate) {
        this.menuItems = menuItems;
        this.lastMenuUpdate = lastMenuUpdate;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastMenuUpdate() {
        return lastMenuUpdate;
    }

    public void setLastMenuUpdate(Date lastMenuUpdate) {
        this.lastMenuUpdate = lastMenuUpdate;
    }
}

