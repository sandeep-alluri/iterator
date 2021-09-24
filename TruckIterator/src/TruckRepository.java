
public class TruckRepository implements Container {
	
	 public String truckNames[] = {"The Roadrunner" , "Rambo" ,"Black Beauty" , "Bandito"};

	@Override
	public Iterator getIterator() {
		 
		return new TruckIterator();
	}

	private class TruckIterator implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < truckNames.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return truckNames[index++];
	         }
	         return null;
	      }		
	   }
	
	
	
}
