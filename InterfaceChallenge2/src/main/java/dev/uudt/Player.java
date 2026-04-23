package dev.uudt;

import java.util.List;
import java.util.ArrayList;

public class Player implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        // in order of this.name, this.hitPoints, this.strength, this.weapon
        List<String> playerList = new ArrayList<>();
        playerList.add(name);
        playerList.add(String.valueOf(hitPoints));
        playerList.add(String.valueOf(strength));
        playerList.add(weapon);
        return playerList;
    }

    @Override
    public void read(List<String> playerList) {
        if (playerList != null && playerList.size() > 0) {
            this.name = playerList.get(0);
            this.hitPoints = Integer.parseInt(playerList.get(1));
            this.strength = Integer.parseInt(playerList.get(2));
            this.weapon = playerList.get(3);
        }

    }

    @Override
    public String toString() {
        return """
        Player{name='%s', hitPoints=%d, strength=%d, weapon='%s'}"""
            .formatted(this.name, this.hitPoints, this.strength, this.weapon);
    }

    public String getName() {
        return this.name;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

}