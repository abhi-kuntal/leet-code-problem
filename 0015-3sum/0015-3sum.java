import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);

        for (int fst = 0; fst < arr.length - 2; fst++) {
            if (fst > 0 && arr[fst] == arr[fst - 1]) {
                continue;
            }
            int mid = fst + 1;
            int end = arr.length - 1;

            while (mid < end) {
                int sum = arr[fst] + arr[mid] + arr[end];
                if (sum == 0) {
                    ans.add(Arrays.asList(arr[fst], arr[mid], arr[end]));
                    mid++;
                    end--;

                    while (mid < end && arr[mid] == arr[mid - 1]) {
                        mid++;
                    }
                    while (end > mid && arr[end] == arr[end + 1]) {
                        end--;
                    }

                } else if (sum > 0) {
                    end--;
                } else {
                    mid++;
                }
            }
        }
        return ans;

    }

}
