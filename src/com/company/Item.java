package com.company;

public abstract class Item {
    protected String name;
    protected String description;
    protected String type;
    protected boolean equiped;
    protected int value;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

    public boolean isEquiped() {
        return equiped;
    }

    public void setEquiped(boolean equiped) {
        this.equiped = equiped;
    }
}
