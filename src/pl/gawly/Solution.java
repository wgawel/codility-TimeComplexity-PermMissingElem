package pl.gawly;

public class Solution {

    public int solution(int[] A) {
        // we have to calculate sum [1, 2, .., n, (N+1)]
        // which is n*(n+1)
        // 1   |    2   | 3   |  ...  | n-1  | n | n+1
        // n+1 |   n    | n-1 |  ...  | 3    | 2 |   1
        // sum:
        // n+2|   n + 2|  n+2 | ....  | n+2  | n+2| n+2
        // sum of 1,...,n+1 is: (n+1)*(n+2)/2

        long n = A.length;
        long sum = (n+1)*(n+2)/2;
        for (int i = 0; i<A.length; i++) {
            sum -= A[i];
        }
        return (int)sum;
    }

    /**
     * This solution pass all tests on my machine (32bit jvm, InteliJ IDEA 2016.3.3),
     * but fails on codility env. because of integer limit. Why it pass in my env? To check.
     */
    public int solution2(int[] A) {
        // we have to calculate sum [1, 2, .., n, (N+1)]
        // which is n*(n+1)
        // 1   |    2   | 3   |  ...  | n-1  | n | n+1
        // n+1 |   n    | n-1 |  ...  | 3    | 2 |   1
        // sum:
        // n+2|   n + 2|  n+2 | ....  | n+2  | n+2| n+2
        // sum of 1,...,n+1 is: (n+1)*(n+2)/2

        int n = A.length;
        int sum = (n+1)*(n+2)/2;
        for (int i = 0; i<A.length; i++) {
            sum -= A[i];
        }
        return sum;
    }
}
