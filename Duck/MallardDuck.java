class MallardDuck extends Duck{
	public MallardDuck(){
		qb = new Quack();
		fb = new FlyWithWings();
	}
	public void display(){System.out.println("display as mallard duck.");}
}
