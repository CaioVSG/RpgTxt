package com.company;
import java.util.ArrayList;

public class Inventory {
    private int size;
    private ArrayList<Item> slots;
    private Item rhand;
    private Item lhand;
    private Item head;
    private Item chest;
    private Item gloves;
    private Item legs;
    private Item boots;


    public Inventory() {
        this.size = 20;
        this.slots = new ArrayList<Item>();
    }
    public boolean pickItem(Item item){
        if(this.slots.size() < size){
            this.slots.add(item);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean equipItem(Item item) {
        switch (item.type) {
            case "helmet":
                head = item;
                return true;
        }
        return false;
    }
    public boolean equipWeapon(Item item,String hand){
        if (hand == "right") {
            rhand = item;
            item.setEquiped(true);
            return true;
        }else if (hand == "left"){
            lhand = item;
            item.setEquiped(true);
            return true;
        }
        return false;
    }

    public ArrayList inventory() {return slots;}
    public Item inventory(int n) {return slots.get(n);}
}
