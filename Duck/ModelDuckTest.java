class ModelDuckTest{
	public static void main(String[] args){
		Duck d = new ModelDuck();
		d.performFly();
		d.performQuack();
		d.setFlyBehavior(new FlyRocketPowered());
		d.performFly();
	}
}
