public class itSlab
{
	public static void main(String[] args) {
		double sal = Double.parseDouble(args[0]);
		if(sal<=40000) ;
		else if(sal>40000 && sal <=80000 ){
		    System.out.println("Your tax is : " + (sal-40000)*0.1);
		}
		else if(sal>80000 && sal <=150000){
		    System.out.println("Your tax is : " + (sal-80000)*0.2 + 4000);
		}
		else if(sal>150000){
		    System.out.println("Your tax is : " + (sal-150000)*0.3+12000);
		}
		else{
		    System.out.println("Please enter valid salary");
		}
	}
}