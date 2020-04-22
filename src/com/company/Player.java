package com.company;

public class Player {
    private String name;
    private EntityAtributes atributes;
    private Inventory inventory;
    private int gold;
    private int level;
    private int exp;

    public Player() {
        this.atributes = new EntityAtributes("warrior");
        this.inventory = new Inventory();
        this.gold = 0;
        this.level = 1;
        this.exp = 0;
    }

    public EntityAtributes getAtributes() {
        return atributes;
    }
    public Inventory getInventory() { return inventory;}
}
