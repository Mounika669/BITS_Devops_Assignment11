class Bike 
{
	private double topspeed=190;
	private double mileage=45;

	public double run()
	{
		return mileage;
	}
	public double run1()
	{
		return topspeed;
	}
	public void jump(double topspeed)
	{
		this.topspeed=topspeed;
		System.out.println(this.topspeed);
	}
	private void ride()
	{
	System.out.println("riding with the bike having topspeed "+this.topspeed+"and mileage "+this.mileage);
	}
}
