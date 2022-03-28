package ReplitHelp;

public class Replit132 {
    /*
    Complete the reduce10 method by making it subtract 10 from every element of the double array nums.
    The method should static and it should return a new 2D array object
    Print values from new array in the format below input
     */

   /* static int[][] reduce10(int x[][] ){
        int newArr[][] = new int[0][];
        for (int j=0;j<x.length;j++){
            for (int i=0;i<x[j].length;i++) {
                newArr[j][i] = newArr[j][i] - 10;
            }

        }return newArr;
    }*/


    static int reduce10(int[][] array) {

        int newArr = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newArr = array[i][j] -= 10;
                System.out.print(newArr+" ");

            }
            System.out.println();

        }

        return newArr;

    }

    public static void main(String[] args) {

        int a[][]= new int[][]{

                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}

        };

        System.out.println(reduce10(a));

         }

}
