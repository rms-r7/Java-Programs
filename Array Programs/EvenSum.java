import java.util.Scanner;
class EvenSum{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int i;
    System.out.println("Please enter the limit of numbers:");
    int n=sc.nextInt();
    int []arr=new int[n];
    System.out.println("Enter the elements:");
    for(i=0;i<n;i++)
    {
        
        arr[i]=sc.nextInt();
    }
    int sum=0;
    for(i=0;i<n;i++){
    if(arr[i]%2==0){
    sum+=arr[i];
    }}
    System.out.println("Displaying the sum of even numbers:"+sum);
}
}
