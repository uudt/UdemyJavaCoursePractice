package dev.uudt;

import java.util.List;
import java.util.ArrayList;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> monsterList = new ArrayList<>();

        monsterList.add(name);
        monsterList.add(String.valueOf(hitPoints));
        monsterList.add(String.valueOf(strength));

        return monsterList;
    }

    @Override
    public void read(List<String> monsterList) {
        if (monsterList != null && monsterList.size() > 0) {
            this.name = monsterList.get(0);
            this.hitPoints = Integer.parseInt(monsterList.get(1));
            this.strength = Integer.parseInt(monsterList.get(2));
        }
    }

    @Override
    public String toString() {
        return """
        Monster{name='%s', hitPoints=%d, strength=%d}"""
            .formatted(this.name, this.hitPoints, this.strength);
    }

    public String getName() {
        return this.name;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public int getStrength() {
        return this.strength;
    }
}
