import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    // worst-case time complexity is O(N*log(N)) - covered
    // worst-case space complexity is O(N) - don't think is covered
    public int countIdenticalPairsWithMapping(int[] array) {
        Map<Integer,Integer> occurrences = new HashMap<>();
        for (int i =0; i <array.length;i++) {
            int element = array[i];
            occurrences.put( element, occurrences.getOrDefault(element, 0) + 1 );
        }

        return occurrences.values()
                .stream().filter(e -> e > 1).map(Solution::combination).reduce(0, Integer::sum);
    }

    // Mathematical equation
    public static int combination(final int N) {
        return (int) ( N * (N - 1 ) * 0.5 ) ;
    }

    // calculate recursively
    public static int combinatory(final int N) {
        if (N == 0 || N == 1) return 0;
        if (N == 2) return 1;
        return N - 1 + combinatory(N - 1);
    }

    //  better, complexity for sorting O(N*log(N))
    public int countIdenticalPairsWithSorting(int[] array) {
        Arrays.sort(array);

        int duplicates = 0;
        int occurrences = 1;
        for (int i = 0; i + 1 < array.length; i++) {
            if ( array[i] == array[i + 1] ) occurrences++;
            else {
                duplicates += combinatory(occurrences);
                occurrences = 1;
            }
        }

        duplicates += combinatory(occurrences);
        return duplicates;
    }

    public int countIdenticalPairs(int[] array) {
        int duplicates = countIdenticalPairsWithMapping(array);
//        int duplicates = countIdenticalPairsWithSorting(array);
//        int duplicates = countIdenticalPairsIterative(array);

        return  1_000_000_000 < duplicates ? 1_000_000_000 : duplicates;
    }

    // not efficient
    public int countIdenticalPairsIterative(int[] array) {
        int duplicates = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j ++) {
                if ( array[i] == array[j] ) {
                    duplicates++;
                }
            }
        }

        return duplicates;
    }
}

