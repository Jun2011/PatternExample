package strategy;

// ��ɫ
// ʵ���������͡��������ܡ��������������滻
// ����Ҳ��ʵ���˴���ĸ���
public class Role {

	// ��ɫ��
	protected String name;

	// ��������
	protected IDisplayBehavior displayBehavior;
	// ��������
	protected IAttackBehavior attackBehavior;
	// ��������
	protected IDefendBehavior defendBehavior;

	// ���췽��
	public Role(String name) {

		// ���ý�ɫ��
		this.name = name;
	}

	// ������������
	public Role setDisplayBehavior(IDisplayBehavior displayBehavior) {

		this.displayBehavior = displayBehavior;

		return this;
	}

	// ��������
	public void display() {

		displayBehavior.display();
	}

	// ���ù�������
	public Role setAttackBehavior(IAttackBehavior attackBehavior) {

		this.attackBehavior = attackBehavior;

		return this;
	}

	// ��������
	public void attack() {

		attackBehavior.attack();
	}

	// ���÷�������
	public Role setDefendBehavior(IDefendBehavior defendBehavior) {

		this.defendBehavior = defendBehavior;

		return this;
	}

	// ��������
	public void defend() {

		defendBehavior.defend();
	}
}
