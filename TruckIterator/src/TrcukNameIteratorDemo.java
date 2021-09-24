
public class TrcukNameIteratorDemo {

	public static void main(String[] args) {
	  TruckRepository namesRepository = new TruckRepository();

	  
	  System.out.println("Disply truck names..... \n");
	  
	  
	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Truck Name : " + name);
	      } 	
	   }
	
	
	
}
