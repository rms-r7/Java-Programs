import java.util.Scanner;
class LargestSmallest{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int i;
    System.out.println("Please enter the limit:");
    int n=sc.nextInt();
    int []arr=new int[n];
    System.out.println("Enter the elements:");
    for(i=0;i<n;i++)
    {
        
        arr[i]=sc.nextInt();
    }
    int smallest=arr[0],largest=arr[0];
    for(i=1;i<n;i++){
        if(arr[i]<smallest){
            smallest=arr[i];}
            if(arr[i]>largest){
                largest=arr[i];}
    }
    System.out.println("Displaying the smallest element:"+smallest);
    System.out.println("Displaying the largest element:"+largest);
    }}