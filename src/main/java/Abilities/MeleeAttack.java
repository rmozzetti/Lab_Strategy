/**
 * @author Robert Mozzetti
 * created: 3/24/2026
 * Explanation:
 */
package Abilities;

import org.Monsters.Monster;

public class MeleeAttack implements Attack {

    public MeleeAttack(Monster attacker) {
        this.attacker = attacker;
    }

    Monster attacker;

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses melee attack on " + target;
        System.out.println(message);
        return null;
    }
}
