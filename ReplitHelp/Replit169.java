package ReplitHelp;

public class Replit169 {

    final int avgElements(int[]a){
        int sum=0;
        int average=0;

        for(int avg:a){
            sum+=avg;
        }
        return sum;
    }

    public static void main(String[] args) {
        Replit169 b=new Replit169();

        int []a={2,7,3,8,4};
       System.out.println(b.avgElements(a));


    }

}
