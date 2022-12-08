public class questionfourth{
	public static void main(String[] args){
	 	int hours,minutes,seconds;
		hours = Integer.parseInt(args[0]);
		minutes = Integer.parseInt(args[1]);
		seconds = Integer.parseInt(args[2]);
	 	clock c = new clock(hours,minutes,seconds);
	}
}
class clock{
	private int hh,mm,ss;
        clock(int h , int m , int s){
	 	hh = h;
		mm = m;
		ss = s;
		validate();	
	}
	void validate(){
		if(hh>=0 && hh < 24 && mm >= 0 && mm < 60 && ss >=0 && ss < 60){
			System.out.println("Valid Time");
			show();
		}
		else{
			System.out.println("Invalid : Please enter valid time");
		}
	}

        void show(){
		if( hh>12 ) {
			System.out.println("The current time is "+ (hh-12) + " hours " + mm + " minutes " + ss +" seconds "+ " PM");
		}
		else{
			System.out.println("The current time is "+ (hh) + " hours " + mm + " minutes " + ss +" seconds "+ " AM");
		}
	}
}