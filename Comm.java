import java.util.Scanner;
class Comm{
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int i,j;
    System.out.println("Please enter the limit for Array-1:");
    int n=sc.nextInt();
    int []arr1=new int[n];
    System.out.println("Enter the elements:");
    for(i=0;i<n;i++)
    {
        
        arr1[i]=sc.nextInt();
    }
    System.out.println("Please enter the limit for Array-2:");
    int m=sc.nextInt();
    int []arr2=new int[m];
    System.out.println("Enter the elements:");
    for(j=0;j<m;j++)
    {
        
        arr2[j]=sc.nextInt();
    }
    
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            if(arr1[i]==arr2[j]){
                System.out.println("The common element is:"+arr1[i]);
                break;
            }}}
            }
        }
        
    
    