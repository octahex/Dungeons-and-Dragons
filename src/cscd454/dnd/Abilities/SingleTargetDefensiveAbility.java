/* Bryan Anders
 * Sami Awwad
 * Samir Ouahhabi
 * 
 * Team abeeseesdee
 */

package cscd454.dnd.Abilities;

import java.util.ArrayList;
import cscd454.dnd.Characters.CharacterEntity;

public abstract class SingleTargetDefensiveAbility extends DefensiveAbility
{
	public SingleTargetDefensiveAbility(CharacterEntity master)
	{
		super(master);
	}

	protected ArrayList<CharacterEntity> getTargets(CharacterEntity target)
	{
		ArrayList<CharacterEntity> targets = new ArrayList<>();

		targets.add(target);

		return targets;
	}
}
