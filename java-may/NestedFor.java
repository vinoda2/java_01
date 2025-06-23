public class NestedFor{
	
     public static void main(String[] args) {
     	for(int i=1;i<5;i++){
     		 System.out.println("i:"+i+" ");

     		for(int j=1;j<5;j++){
     		    System.out.println("j:"+j+" ");
     		    for(int k=1;k<5;k++){
     		      System.out.print("k:"+k+" ");
     	        }
     	             	     System.out.println();
     	    }
     	     System.out.println();
     	}
     }

}