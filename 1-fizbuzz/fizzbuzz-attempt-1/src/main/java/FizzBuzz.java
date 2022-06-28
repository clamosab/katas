import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> getData() {
        List<String> data = new ArrayList<String>();
        for (int i=1;i<=100;i++) {
            if (i%3 == 0 && i%5 != 0) {
                data.add("Fizz");
            }
            else if (i%5 == 0 && i%3 != 0) {
                data.add("Buzz");
            }
            else if (i%15 == 0) {
                data.add("FizzBuzz");
            }
            else {
                data.add(String.valueOf(i));
            }
        }

        return data;
    }

}
