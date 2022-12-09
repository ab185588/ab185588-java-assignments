public class itSlab
{	
 	public static void main(String[] args) {
	double sal = Double.parseDouble(args[0]);
		System.out.println(sal);
		double tax = 0;
		if(sal-80000<0) {
			sal=0;
		}
		else{
			sal = sal-80000;
		}
		if(sal-80000<0){
		    	tax += 0.1*(sal);
		    	sal=0;
		}
		else{
			tax += 8000;
			sal = sal - 80000;
			
		}
		if(sal-150000<0){
		   	tax += 0.2*(sal);
		   	sal=0;
		}
		else {
		    tax += 30000;
			sal = sal - 150000;
		}
		
		tax += 0.3*sal;
		System.out.println(tax);
	}
}