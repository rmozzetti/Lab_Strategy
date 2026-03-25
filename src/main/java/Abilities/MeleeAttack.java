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

    //Returns the damage dealt by the attack calculated from the attackers strength - targets defense
    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses melee attack on " + target;
        System.out.println(message);
        return attacker.getStr() - target.getDef();
    }
}
