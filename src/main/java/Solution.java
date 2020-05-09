class Solution {

    public int countIdenticalPairs(int[] array) {
        int duplicates = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j ++) {
                if ( array[i] == array[j] ) {
                    duplicates++;
                }
            }
        }

        return  1_000_000_000 < duplicates ? 1_000_000_000 : duplicates;
    }
}

