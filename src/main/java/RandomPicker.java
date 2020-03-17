import java.util.List;
import java.util.Random;

class RandomPicker {
    private final List<String> list;
    public static final String LIST_IS_EMPTY = "LIST_IS_EMPTY";

    public RandomPicker(List<String> list) {
        this.list = list;
    }

    public String pick() {

        if (list == null || list.isEmpty()) {
            return LIST_IS_EMPTY;
        } else {
            return list.get(pickRandomNumber(list.size()));
        }
    }

    //Choose random number between 0 to max size
    private int pickRandomNumber(int max) {
        return new Random().nextInt(max);
    }


}
