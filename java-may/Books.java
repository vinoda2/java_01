public class Books{
	
   public static void main(String[] args) {
   	  String[] book_names = {"Two states","Animal Farm","A tale of two cities","Alice in Wonderland"};

   	  for(int index = 0; index < book_names.length; index++){
   	  	 if(book_names[index] != "Two states"){
   	  	 System.out.println("book name found");
   	  	 System.out.println(index+" : "+book_names[index]);
   	  	 }
   	  }

      System.out.println("displaying book names in reverse order");
   	  for(int index = book_names.length-1; index >= 0;index-- ){
   	  	   	  	 System.out.println(index+" : "+book_names[index]);
   	  }

   }

}