
public class Dice 
{
private int diceRoll;
private int d1;
private int d2;
private int d3;

public int getNumber()
{
	diceRoll = 1 + (int) ( Math.random() * (6) );
	return diceRoll;
}
public int D1()
{
	d1 = getNumber();
	return d1;
}
public int D2()
{
	d2 = getNumber();
	return d2;
}
public int D3()
{
	d3 = getNumber();
	return d3;
}

public int Throw()
{
	D1();
	D2();
	D3();
	
	/*int d1 = 1 + (int) ( Math.random() * (6) );
	int d2 = 1 + (int) ( Math.random() * (6) );
	int d3 = 1 + (int) ( Math.random() * (6) );
	*/
	
	int average= (d1+d2+d3)/3;
	
	
	return average;
}
	
	
	
	
}
