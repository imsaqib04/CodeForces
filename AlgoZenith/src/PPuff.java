import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PPuff {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long N = sc.nextLong();

            ArrayList<Long> divisors = new ArrayList<>();

            for (long i = 1; i * i <= N; i++) {
                if (N % i == 0) {
                    divisors.add(i);
                    if (i * i != N) {
                        divisors.add(N / i);
                    }
                }
            }

            Collections.sort(divisors);

            for (long d : divisors) {
                System.out.println(d);
            }
        }
    }

