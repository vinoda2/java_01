import java.util.*;
import java.util.stream.Stream;

public class FoodNamesRunner {

    public static void main(String[] args) {
        List<String> foodNames = new ArrayList<String>();
        System.out.println(foodNames.size());
        foodNames.add("Biriyani 1");
        foodNames.add("Biriyani 2");
        foodNames.add("Biriyani 3 ");


        //stream
      Stream<String> stream = foodNames.stream();
      stream.forEach(c-> System.out.println(c));
        System.out.println(foodNames.stream().count());

          foodNames.stream().filter(s->s.length()>10).forEach(s-> System.out.println(s));
        //filteredData.forEach(s-> System.out.println(s));
    }
}
