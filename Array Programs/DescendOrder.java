import java.util.Scanner;
class DescendOrder{
public static void main(String args[]){
int n,i,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the limit:");
n=sc.nextInt();
int []arr=new int[n];
System.out.println("Enter the elements:");
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<n-1;i++){
for(int j=0;j<n-i-1;j++){
if(arr[j]<arr[j+1]){
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;}}}
System.out.println("Displaying elements in descending order:");
for(i=0;i<n;i++){
System.out.println(arr[i]+" ");
}
}
}




