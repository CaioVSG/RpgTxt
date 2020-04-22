package com.company;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        Item lightbringer = new Item("Lightbringer");
        System.out.println(player.getInventory().getWeapon());
        System.out.println(player.getInventory().inventory());
        player.getInventory().getItem(lightbringer);
        player.getInventory().equipItem(lightbringer);
        System.out.println(player.getInventory().inventory());
        System.out.println(player.getInventory().getWeapon());
    }
}
