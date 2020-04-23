package com.company;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        Lightbringer mySword = new Lightbringer();
        System.out.println(player.getInventory().inventory());
        System.out.println(mySword.isEquiped());
        player.getInventory().pickItem(mySword);
        player.getInventory().equipWeapon(mySword, "right");
        System.out.println(player.getInventory().inventory(0).getName());
        System.out.println(player.getInventory().inventory(0).getDescription());
        System.out.println(player.getInventory().inventory(0).isEquiped());
    }
}