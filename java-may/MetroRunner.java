public class MetroRunner{
	
	public static void main(String[] args) {
		System.out.println("entered MetroRunner class ");

		//by using the reference
		Metro.metroName ="Namma metro";
		Metro.from ="BTM";
		Metro.to ="Jayanagar";
		Metro.ticket_price = 20;
		Metro.isMetroAvailable = false;
		if(Metro.metroName !=null ){
					System.out.println("Metro Name:"+Metro.metroName);

		}else{
					System.out.println("Metro Name is null");
		}

	    System.out.println("Metro Traveling details ");
		System.out.println("Metro Name:"+Metro.metroName);
		System.out.println("From:"+Metro.from);
		System.out.println("To: "+Metro.to);
		System.out.println("Ticket Price: "+Metro.ticket_price);
		System.out.println("is MetroAvailable: "+Metro.isMetroAvailable);

	}

}