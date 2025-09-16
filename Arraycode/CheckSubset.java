package Arraycode;

public class CheckSubset {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {2, 4, 5};

        boolean isSubset = true;

        for (int i = 0; i < B.length; i++) {
            boolean found = false;

            for (int j = 0; j < A.length; j++) {
                if (B[i] == A[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                isSubset = false;
                break;
            }
        }

        if (isSubset) {
            System.out.println("B is a subset of A.");
        } else {
            System.out.println("B is NOT a subset of A.");
        }
    }
}
