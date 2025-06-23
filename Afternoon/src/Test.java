import dto.FootDetails;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public class Test {

    public static void main(String[] args) throws IOException {
        FootDetails footDetails = new FootDetails("Rice", 20, "Veg");
        footDetails.setFoodType("non-veg");
        System.out.println("before changingfootdetails:"+footDetails);
        FootDetails cloneDetails = (FootDetails) footDetails.clone();
        cloneDetails.setPrice(40);
        System.out.println("after chaning footdetails:"+footDetails);
        System.out.println("cloneDetails:"+cloneDetails);
        String name = "demo.class";
        File file = new File(name);
        file.createNewFile();
        System.out.println(file.getAbsoluteFile());
    }
}
