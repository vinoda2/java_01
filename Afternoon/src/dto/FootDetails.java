package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FootDetails implements Cloneable{

    private String foodName;
    private int price;
    private String foodType;

    @Override
    public Object clone() {
        try {
            FootDetails details =(FootDetails) super.clone();
            return details;
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
}
