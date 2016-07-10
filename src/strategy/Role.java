package strategy;

// 角色
// 实现样子类型、攻击技能、防御技能自由替换
// 这样也就实现了代码的复用
public class Role {

	// 角色名
	protected String name;

	// 样子类型
	protected IDisplayBehavior displayBehavior;
	// 攻击技能
	protected IAttackBehavior attackBehavior;
	// 防御技能
	protected IDefendBehavior defendBehavior;

	// 构造方法
	public Role(String name) {

		// 设置角色名
		this.name = name;
	}

	// 设置样子类型
	public Role setDisplayBehavior(IDisplayBehavior displayBehavior) {

		this.displayBehavior = displayBehavior;

		return this;
	}

	// 样子类型
	public void display() {

		displayBehavior.display();
	}

	// 设置攻击技能
	public Role setAttackBehavior(IAttackBehavior attackBehavior) {

		this.attackBehavior = attackBehavior;

		return this;
	}

	// 攻击技能
	public void attack() {

		attackBehavior.attack();
	}

	// 设置防御技能
	public Role setDefendBehavior(IDefendBehavior defendBehavior) {

		this.defendBehavior = defendBehavior;

		return this;
	}

	// 防御技能
	public void defend() {

		defendBehavior.defend();
	}
}
