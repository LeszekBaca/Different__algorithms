package org.example;

import static org.example.Functions.solution;
import static org.example.Functions.solution2;

public class Main {
    public static void main(String[] args) {
//        System.out.println(solution(32));
//        System.out.println(solution(15));
       //System.out.println(solution(1041));
//        System.out.println(solution(328));
//        System.out.println(solution(5));

        //System.out.println(solution(512, 10));//expect; 972
        //System.out.println(solution(191, 4)); //expect;591
        //System.out.println(solution(285, 20)); // expect: 999

        System.out.println(solution3(100));

        // Stream.of(person1,person2,person3).filter(a->a.getAge()>1).forEach(System.out::println);

    }

    public static int solution3(int N) {
        if(N==1)
            return 11;
        int result = 0;
        for (int i = 0; i < N / 2; i++) {
            int num = (int)Math.pow(2, i);
            if (N % num == 0) {
                result = i;
            }
        }
        return result;
    }
}
