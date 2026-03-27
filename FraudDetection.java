import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FraudDetection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            String sender = sc.next();
            String receiver = sc.next();
            int amount = sc.nextInt();
            int time = sc.nextInt();

            String key = sender + "-" + receiver + "-" + amount;

            if (map.containsKey(key)) {
                int prevTime = map.get(key);

                if (Math.abs(time - prevTime) <= 60) {
                    System.out.println(sender + " " + receiver + " " + amount + " " + time);
                }
            }

            map.put(key, time);
        }
    }
}