package OptionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.addAll(Arrays.asList(new Integer[]{5, 9, 2, 0, 1, 6, 3, 8, 4, 7}));
        System.out.println(data);
        Optional<Integer> min = data.stream().min(Integer::compare);
        System.out.println(min.get());

        List<Integer> data2 = new ArrayList<>();
        Optional<Integer> min2 = data2.stream().min(Integer::compare);
//        System.out.println(min2.get());//NoSuchElementException
        if (min2.isPresent()) {
            System.out.println(min2.get());
        }
        System.out.println(min2.isPresent());//false
        System.out.println(min.isPresent());//true
        System.out.println(min2.orElse(-1));//-1
        System.out.println(min2.orElseThrow(IllegalStateException::new));//IllegalStateException
    }
}
