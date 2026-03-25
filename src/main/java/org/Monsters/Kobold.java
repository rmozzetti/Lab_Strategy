/**
 * @author Robert Mozzetti
 * created: 3/24/2026
 * Explanation: Kobald class that holds stats for the Kobald monster
 */
package org.Monsters;

import Abilities.MeleeAttack;
import Abilities.RangedAttack;

import java.util.HashMap;

public class Kobold extends Monster{
    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP,xp,items);
        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new RangedAttack(this);
        str = super.getAttribute(str, maxStr);
        def = super.getAttribute(def, maxDef);
        agi = super.getAttribute(agi, maxAgi);
    }

    //Returns a string showing the hp and max HP of Kobold
    @Override
    public String toString() {
        return "Kobold has : " + super.toString();
    }
}
