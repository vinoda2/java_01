public class Price{
	
    public static void main(String[] args) {
    	int[] price_list = {12,60,120,460,46,900,20,10,73,33};
    	int even_count=0;
    	int odd_count=0;

    	for(int index = 0; index < price_list.length; index++){
    		if(price_list[index]% 2 ==0){
                  even_count = even_count+1;//0+1 = 1, 1+1 = 2
    		}else{
    			odd_count = odd_count+1;//0+1
    		}
    	}
    	System.out.println("even count: "+ even_count+ "     "+ "odd_count: "+odd_count);
    }


}