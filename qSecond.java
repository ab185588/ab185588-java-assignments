import java.util.Scanner;

public class qSecond
{
    static void validate(int num) throws NegativeSizeException{
        if(num<0){
            throw new NegativeSizeException("Negative Number is Found");
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for( int i = 0 ; i < n ; i++ ){
    		try{
            	int temp = sc.nextInt();
    		    validate(temp);
    		    arr[i] = temp; 
    		}
    		catch(NegativeSizeException e){
    		    System.out.println("Exception occured "+e);
    		}
		}
	}
}
class NegativeSizeException extends Exception{
    public NegativeSizeException(String s){
        super(s);
    }
}