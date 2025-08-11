import java.util.Scanner;
class BinSearch{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int i;
System.out.println("Please enter the limit of numbers:");
int n=sc.nextInt();
int []arr=new int[n];
System.out.println("Enter the elements of array:");
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();}
System.out.print("Enter the element to be searched: ");
int k=sc.nextInt();
int low = 0, high = n - 1, mid;
int flag=0;
while (low <= high) {
mid = (low + high) / 2;
if (arr[mid] == k) {
System.out.println("Element found at index:"+ mid);
flag=1;
break;
} else if (k < arr[mid]) {
high = mid - 1;
} else {
low = mid + 1;
}
}
if (flag==0) {
System.out.println("Element not found.");
}
}
}
