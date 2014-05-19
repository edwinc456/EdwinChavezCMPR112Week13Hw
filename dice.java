
public class dice implements Cloneable
{
Object copy = new tridice(2);
int dices;
int bounces;
int value;

public dice(int dicenumber, int bouncesnumber)
{
	value = -1;
	bounces = bouncesnumber;
	dices=dicenumber;
}
@Override
public String toString()
{
	return "value: " + value + "\nbounces: " + bounces + "\ndices: " + dices ; 
}
public int Throw()
{
	value = 0;
	int sum= 0;
	for(int i = dices;i>0; i++)
	{
		for (int b= bounces; b>0;b++)
		{
			value+=(1+(int)(Math.random()*6));
			return value;
		}
	}
	value=sum;
	return value;
}
public int Value()
{
	return value;
}

public Object clone()
{
	
	tridice history;
	try
	{
	history = (tridice) super.clone();	
	}
	
	catch(CloneNotSupportedException e)
	{
	return null;
	}
	return history;
}

}

