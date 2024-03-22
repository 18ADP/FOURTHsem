/*Write a java code for - Given N number of ropes of various length.
 You need to join these ropes to make a single rope. The cost of 
 joining two ropes of length A and B is (A+B) which is there
combined length.You need to find the minimum cost of joining all the ropes.
The minimum cost of joining rope is obtained when we always join the two smallest ropes.*/

import java.util.PriorityQueue;

public class MinCostJoiningRopes {
    public static void main(String[] args) {
        int[] ropeLengths = {1, 2, 3, 4, 5};
        System.out.println("Minimum cost of joining ropes: " + minCost(ropeLengths));
    }

    public static int minCost(int[] ropeLengths) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int length : ropeLengths) {
            minHeap.add(length);
        }

        int cost = 0;
        while (minHeap.size() > 1) {
            int first = minHeap.poll();
            int second = minHeap.poll();
            int joinedLength = first + second;
            cost += joinedLength;
            minHeap.add(joinedLength);
        }

        return cost;
    }
}
/*Output:
 * Minimum cost of joining ropes: 33
 */
