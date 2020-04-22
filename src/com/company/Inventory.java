package com.company;

import java.util.ArrayList;

public class Inventory {
    private int size;
    private ArrayList slots = new ArrayList();
    private Item weapon;

    public Inventory() {
        this.size = 20;
        this.weapon = null;
    }

    public boolean getItem(Item item){
        if(this.slots.size() < size){
            this.slots.add(item);
            return true;
        }
        else{
            return false;
        }
    }

    public void equipItem(Item item) {
        if (item.isEquipable()) {
            if (item.getType() == "weapon"){
                this.weapon = item;
            }
        }
    }

    public Item getWeapon() {return weapon;}

    public ArrayList inventory() {return slots;}
    public Item inventory(int n) {return slots.get(n);}
}
