package Comparator;

//This java file is inside package named Comparator inside src folder.
import java.util.*;       
//importing all classes from java's util library.

public class CollectionComparator
{
	public static void main(String[] args)        
	//Main Function Declaration.
	{
		ArrayList<HDTV> objectsList = new ArrayList<HDTV>();    
		//Creating ArrayList to store the objects of HDTV class.
		
		
		objectsList.add( new HDTV("LG",85) ); //Creat and add elements to the ArrayList.
		objectsList.add( new HDTV("Samsung",50) );
		objectsList.add( new HDTV("Videocon",80) );
		
		
		Collections.sort( objectsList );
		//Sorting objects in the ArrayList 
		
		Iterator<HDTV> readList = objectsList.iterator();     
		
		while(readList.hasNext())    
		{
			HDTV currentObj = (HDTV) readList.next();      
			
			System.out.println("BrandName is "+currentObj.brandName+" and Size is "+currentObj.size);
			                             
		}
		
	}    

}    
