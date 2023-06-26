abstract class Duck{
	FlyBehavior fb;
	QuackBehavior qb;

	public void setFlyBehavior(FlyBehavior fb_loc){fb = fb_loc;}
	public void setQuackBehavior(QuackBehavior qb_loc){qb = qb_loc;}
	void swim(){System.out.println("swim as duck.");};
	public abstract void display();
	public void performFly(){fb.fly();}
	public void performQuack(){qb.quack();}
	// Другие общие методы
}
