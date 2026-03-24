/**
 * @author Robert Mozzetti
 * created: 3/24/2026
 * Explanation:
 */
package org.Monsters;

import Abilities.MeleeAttack;
import Abilities.RangedAttack;

import java.util.HashMap;

public class Kobold extends Monster{
    public Kobold(int maxHP, int xp, HashMap<String, Integer> items) {
        super(maxHP,xp,items);
        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new RangedAttack(this);
        str = super.getAttribute(str, maxStr);
        def = super.getAttribute(def, maxDef);
        agi = super.getAttribute(agi, maxAgi);
    }

    @Override
    public String toString() {
        return "Kobold has : " + super.toString();
    }
}
