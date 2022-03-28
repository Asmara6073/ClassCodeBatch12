package ReplitHelp;

public class LoopPractice {

    public static void main(String[] args) {
//Write a program to calculate the sum of first 10 natural number.

        /*int x=0;
        int sum = 0;
        while(x<=10){
            sum+=x;
            x++;
        }
        System.out.print(sum);
        System.out.println();

        int num=0;
        int sum2=0;
        do{
            sum2+=num;
            num++;
        }while(num<=10);
        System.out.print(sum2);
        System.out.println();

        int sum3=0;
        for(int j=0;j<=10;j++){
            sum3+=j;
        }System.out.print(sum3);
*/


int [][] array={
        {1,2,3,4},
        {4,3,2,1}
};

for(int [] rows:array){
    for(int col:rows){
        System.out.print(col+" ");
    }
    System.out.println();
}



    }

}
