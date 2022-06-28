import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private List<String> fizzBuzzList = new ArrayList<String>();

    public FizzBuzz() {
        for (int i=0; i<100; i++) {
            fizzBuzzList.add(convertToCorrectElement(i+1));
        }
    }

    private String convertToCorrectElement(int position) {
        if ((position % 3 == 0) && (position % 5 != 0))
            return "Fizz";
        if ((position % 5 == 0) && (position % 3 != 0))
            return "Buzz";
        if (position % 15 == 0)
            return "FizzBuzz";
        return String.valueOf(position);
    }

    public String getElementFromList(int positionInList) {
        return fizzBuzzList.get(positionInList-1);
    }

    public List<String> getList() {
        return fizzBuzzList;
    }
}
