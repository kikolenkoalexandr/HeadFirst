class Main{
	public static void main(String args[]){
		MallardDuck md = new MallardDuck();
		md.swim();
		md.display();
		md.quack();
		
		RedheadDuck rd = new RedheadDuck();
		rd.swim();
		rd.display();
		rd.quack();
		
		RubberDuck rubd = new RubberDuck();
		rubd.swim();
		rubd.display();
		rubd.quack();

		DecoyDuck dd = new DecoyDuck();
		dd.swim();
		dd.display();
	}
}