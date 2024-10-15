import java.util.*;

public class Main {
    static void oddEvenSort(int arr[], int n)
    {
        //Write your code here
        boolean isSorted=false;
        while(!isSorted){
            isSorted=true;
            for(int i=1;i<=n-2;i+=2){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    isSorted=false;
                }
            }
            for(int i=0;i<=n-2;i+=2){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    isSorted=false;
                }
            }
        }
       for(int i=0;i<n;i++)
       System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        oddEvenSort(array,n);
    }
}