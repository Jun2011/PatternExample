package strategy;

// 防御技能：铁布衫
public class DefendTBS implements IDefendBehavior {

	@Override
	public void defend() {
		
		System.out.println("防御技能：铁布衫");
	}
}
