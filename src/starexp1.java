import java.util.Scanner;

public class starexp1 {
    public static void main(String args[]){
        System.out.println("ENTER THE LAST ROW SIZE(ODD NUMBER ONLY)");
        Scanner sc=new Scanner(System.in);
        int limit=sc.nextInt();              //           OUTPUT
        int mid=(limit/2)+1;                 //             *
        int i,j;                             //           * * *
        int k=1;                             //         * * * * *
        int l;                               //       * * * * * * *
        l=mid;                               //     * * * * * * * * *
        for(i=0;i<=mid;i++,l--,k=k+2){       //   * * * * * * * * * * *
            for(j=1;j<=limit;j++){
                if(j!=l){
                    System.out.print("  ");
                }
                else if(j==l){
                    for(int u=1;u<=k;u++){
                      System.out.print("* ");
                    }

                }
            }
            System.out.println("");
        }
    }
}
