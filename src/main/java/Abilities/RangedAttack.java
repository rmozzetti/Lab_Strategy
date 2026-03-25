/**
 * @author Robert Mozzetti
 * created: 3/24/2026
 * Explanation:
 */
package Abilities;

import org.Monsters.Monster;

public class RangedAttack implements Attack {

    public RangedAttack(Monster attacker) {
        this.attacker = attacker;
    }

    Monster attacker;

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses ranged attack on " + target;
        System.out.println(message);
        return attacker.getAgi() - target.getAgi();
    }
}
