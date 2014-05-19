
public class maindice
{
public static void main(String[]args)
{
	tridice number= new tridice(2);
	
	Object copy = new tridice(2);
	tridice copy2 = (tridice) number.clone();
	
	
	System.out.println(number.Throw());
	
	System.out.println(number.toString());
	
	number.trippledicewithhistory();
	copy2.trippledicewithhistory();
	System.out.println(number.equals(copy2));
}
}

// Please overide toString to print values form array
