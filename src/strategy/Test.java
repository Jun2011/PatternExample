package strategy;

// ����
public class Test {

	public static void main(String[] args) {

		// ������ͬ�Ľ�ɫֻ��Ҫ���ò�ͬ�����֡��������͡��������ܡ��������ܼ���
		Role roleOYF = new Role("���޼�")
				.setDisplayBehavior(new DisplayJX())
				.setAttackBehavior(new AttackJYSG())
				.setDefendBehavior(new DefendTBS());
		
		System.out.println(roleOYF.name);
		roleOYF.display();
		roleOYF.attack();
		roleOYF.defend();
	}
}
