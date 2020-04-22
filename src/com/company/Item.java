package com.company;

public class Item {
    private String name;
    private String description;
    private String type;
    private Effect effect;
    private Enchantment enchantment;
    private boolean equipable;

    public Item(String name) {
        if (name == "Lightbringer") {
            this.name = "LightBringer";
            this.description = "A espada que trará a luz sobre seus inimigos";
            this.type = "weapon";
            this.equipable = true;
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public Effect getEffect() {
        return effect;
    }

    public Enchantment getEnchantment() {
        return enchantment;
    }

    public boolean isEquipable() {
        return equipable;
    }

    public void setEnchantment(Enchantment enchantment) {
        this.enchantment = enchantment;
    }
}
