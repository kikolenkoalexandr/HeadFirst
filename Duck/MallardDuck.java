class MallardDuck extends Duck implements Flyable, Quackable{
	void display(){System.out.println("display as mallard duck.");}
	public void fly(){System.out.println("fly as mallard duck.");}
	public void quack(){System.out.println("qack as mallard duck.");}
}