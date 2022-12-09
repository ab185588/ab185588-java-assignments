public class Pattern{
	public static void main(String[] args){
		int size = Integer.parseInt(args[0]);
		int count = 1 ;
		for(int i = 1 ; i <= size ; i++){
			for(int j = size ; j > i ; j--){
  				System.out.print(" ");
			}
			for(int k = 0 ; k < 2*i-1 ; k++){
				System.out.print(count);
			}
			count++;
			System.out.println(" ");
		}
	}
}