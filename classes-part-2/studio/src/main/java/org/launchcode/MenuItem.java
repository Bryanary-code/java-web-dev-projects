package org.launchcode;

import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private Date lastUpdated;

    public MenuItem(String name, double price, String description, String category, boolean isNew, Date lastUpdated) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.lastUpdated = lastUpdated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(price, menuItem.price) == 0 && isNew == menuItem.isNew && Objects.equals(name, menuItem.name) && Objects.equals(description, menuItem.description) && Objects.equals(category, menuItem.category) && Objects.equals(lastUpdated, menuItem.lastUpdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description, category, isNew, lastUpdated);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                ", lastUpdated=" + lastUpdated +
                '}';
    }

}

