package Main;

public class Dviratis_2
{
	//kintamieji
	public String vardas;
	public float speed;
	public float km;
	public float distance;
	
	public float getSpeed()
	{
		return speed;
	}
	
	//konstruktorius
	public Dviratis_2(float speed, float km)
	{
		System.out.println("Hello I'm a bike 2!");
		this.speed = speed;
		this.km = km;
	}
	
	public Dviratis_2()
	{
		
	}
	
	//metodai	
	public void vaziuotiVienaVal()
	{
		float km = 1 * speed;
		distance += km;
	}
	
	public void vaziuotiXVal(int hours)
	{
		float km = hours * speed;
		distance += km;
	}
	
	public String nustatytiDviracioVarda()
	{
		return vardas;
	}
	
	public float nustatytiNuvaziuotusKm()
	{
		return distance;
	}
	
	public float nustatytiVidutiniGreiti()
	{
		return speed;
	}
}
