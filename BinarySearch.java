import java.util.Scanner;
public class BinarySearch{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER HOW MANY ELEMENTS YOU NEED:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("ENTER SORTED ARRAY ELEMENTS");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            
        }
        System.out.println("ENTER THE KEY ELEMENT TO SEARCH:");
        int key = sc.nextInt();
        int low = 0;
        int high = n - 1;
        
        while (low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == key){
                System.out.println("ELEMENT FOUND AT " +mid);
                
                break;
        }
        else if (arr[mid] < key){
            low = mid + 1;
            
        }
        else {
            high = mid - 1;
        }
        
    }
    
}
}

