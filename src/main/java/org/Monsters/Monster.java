/**
 * @author Robert Mozzetti
 * created: 3/23/2026
 * Explanation:
 */
package org.Monsters;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public abstract class Monster {

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    private Integer hp;
    private Integer xp = 10;
    Integer agi = 10;
    Integer def = 10;
    Integer str = 10;
    Attack attack;
    private Integer maxHP;
    private HashMap<String, Integer> items;

    public Integer attackTarget(Monster monster) {
        Integer damage = attack.attack(monster);

        monster.takeDamage(damage);

        return damage;
    }

    boolean takeDamage(Integer damage) {
        if(damage > 0) {
            hp = hp - damage;
            System.out.println("The creature was hit for " + damage + " damage");
        }

        if(hp <= 0) {
            System.out.println("Oh no! The creature has perished");
        }

        System.out.println(toString());

        if(hp > 0){
            return true;
        } else {
            return false;
        }
    }

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
        return hp;
    }

    public int getXp() {
        return xp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getAgi() {
        return agi;
    }

    public int getStr() {
        return str;
    }

    public int getDef() {
        return def;
    }

    Integer getAttribute(Integer min, Integer max){
        Random rand = new Random();
        if(min > max) {
            Integer temp = min;
            min = max;
            max = temp;
        }
        return rand.nextInt(max-min) + min;
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
        return hp + "/" + maxHP;
    }
}
