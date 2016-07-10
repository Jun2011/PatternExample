package strategy;

// 测试
public class Test {

	public static void main(String[] args) {

		// 这样不同的角色只需要设置不同的名字、样子类型、攻击技能、防御技能即可
		Role roleOYF = new Role("张无忌")
				.setDisplayBehavior(new DisplayJX())
				.setAttackBehavior(new AttackJYSG())
				.setDefendBehavior(new DefendTBS());
		
		System.out.println(roleOYF.name);
		roleOYF.display();
		roleOYF.attack();
		roleOYF.defend();
	}
}
