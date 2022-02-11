package ALGORITHMS;

public class FindNullInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8};

        int idx = -1;
        int sum = 0;
        int sumInitial = (arr.length + 1) * arr.length / 2;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                idx = i;
            } else {
                sum+= arr[i];
            }
        }

        System.out.println(sumInitial - sum);

        //ArrayList<Integer> arr1 = new ArrayList<Integer>();
//        int a[] = { 1,3,4,5,6,7,10 };
//        int j = a[0];
//        for (int i=0;i<a.length;i++)
//        {
//            if (j==a[i])
//            {
//                j++;
//                continue;
//            }
//            else
//            {
//                arr.add(j);
//                i--;
//                j++;
//            }
//        }
//        System.out.println("missing numbers are ");
//        for(int r : arr)
//        {
//            System.out.println(" " + r);
//        }







    }
}
