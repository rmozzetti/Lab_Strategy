/**
 * @author Robert Mozzetti
 * created: 3/23/2026
 * Explanation:
 */
package org.example;

import java.util.HashMap;
import java.util.Objects;

public abstract class Monster {

    public Monster(int maxHP, int xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    private int hp;
    private int xp;
    private int maxHP;
    private HashMap<String, Integer> items;

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public int getHp() {
        return 0;
    }

    public int getXp() {
        return 0;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer>) {

    }

    public int getMaxHP() {
        return 0;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Monster monster)) return false;

        return getHp() == monster.getHp() && getXp() == monster.getXp() && getMaxHP() == monster.getMaxHP() && Objects.equals(getItems(), monster.getItems());
    }

    @Override
    public int hashCode() {
        int result = getHp();
        result = 31 * result + getXp();
        result = 31 * result + getMaxHP();
        result = 31 * result + Objects.hashCode(getItems());
        return result;
    }

    @Override
    public String toString() {
        return "Imp has : hp=" + hp + "/" + hp +
                "\n Kobold has : hp=" + hp + "/" + hp;
    }
}
