public class ArrayIndexOutException {

	public static void main(String[] args) {
	
		int i;
		
		int a[]={21,32,43,55,77};
		
		try
		{	
		for(i=0;i<5;i++)
		{
			System.out.println(a[5]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
	        System.out.println("Warning: ArrayIndexOutOfBoundsException, cannot be >5");
	     }

	}

}