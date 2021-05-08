/*Write a function

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns the number of distinct values in array A.

For example, given array A consisting of six elements such that:

 A[0] = 2    A[1] = 1    A[2] = 1
 A[3] = 2    A[4] = 3    A[5] = 1
the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
*/

import java.util.*;
import java.util.stream.Collectors;

public class Distinct {
    public static int solution(int[] A)
    {
        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
        Set<Integer> set= new HashSet<>(list);
        int b= set.size();
        return b;
    }

    public static void main(String[] args) {
        int[] A={1,1,2,2,3,3};
        int b=solution(A);
        System.out.println(b);
    }
}


Method 2:
import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public static int solution(int[] A) {
        Set set=new HashSet();
       for(int i:A) {
          set.add(i);
       }
       return set.size();
    }

    public static void main(String[] args) {
        int[] A={2,1,3,2,1,3};
        System.out.println(solution(A));
    }
}
