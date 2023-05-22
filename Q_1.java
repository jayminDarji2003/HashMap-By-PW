
/*
    Q.1 :- print Max Frequency.
*/
import java.util.*;

public class Q_1 {
    // cal freq fnx
    public static int countFreq(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // adding value to map
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // cal max freq
        int maxFq = 0;
        int keyOfMaxFq = -1;
        for (Integer key : map.keySet()) {
            if (map.get(key) > maxFq) {
                maxFq = map.get(key);
                keyOfMaxFq = key;
            }
        }

        return keyOfMaxFq;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 1, 4, 4, 6, 4, 4, 4 };
        int maxFreq = countFreq(arr);
        System.out.println(maxFreq);
    }
}
