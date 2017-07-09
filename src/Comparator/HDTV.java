package Comparator;

public class HDTV implements Comparable<HDTV>  
//Class declaration which is implementing Comparable interface.
{
	String brandName;        
	//Declaring String object to Store the brand name.
	int size;          
	
	public HDTV(String brandName,int size)       
	{
		
		this.brandName=brandName;
		this.size=size;
	}

	public int compareTo(HDTV passedObject)     
	
	{
		
		if(this.size<passedObject.size)
	//Conditional Statements to compare objects.
			return -1;
		else if(this.size>passedObject.size)
			return 1;
		return 0;
	}
	
}   

