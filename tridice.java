
import java.util.Arrays;
public class tridice extends dice 
{
public tridice(int bounces)
{
	super(3,bounces);
}
public void trippledicewithhistory()
{
	int[] Throw;
	Throw = new int[3];
	Throw[0] = Throw();
	Throw[1] = Throw();
	Throw[2] = Throw();
	
	int i;
	
	for (i=0; i<Throw.length;i++)
	{
		System.out.println("Throw" + (i+1)+ ":" +Throw[i]);
	}
	
	
	
	
}
}
