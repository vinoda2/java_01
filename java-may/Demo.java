public class Demo{
	public static void main(String[] args) {
		String[]  itemNames={"mouse","pen","flower"};
		//mousepenflower -> concation
		String newValue = "";
		for(int index=0;index<itemNames.length;index++){
			newValue = newValue +" "+ itemNames[index];
			System.out.println("new value:"+newValue);
		}
       			System.out.println("new value:"+newValue);

	}

}