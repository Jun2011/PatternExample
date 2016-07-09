package strategy;

// ≤‚ ‘
public class Test {

	public static void main(String[] args) {

		Role roleOYF = new Role("’≈Œﬁº…")
				.setDisplayBehavior(new DisplayJX())
				.setAttackBehavior(new AttackJYSG())
				.setDefendBehavior(new DefendTBS());
		
		System.out.println(roleOYF.name);
		roleOYF.display();
		roleOYF.attack();
		roleOYF.defend();
	}
}
