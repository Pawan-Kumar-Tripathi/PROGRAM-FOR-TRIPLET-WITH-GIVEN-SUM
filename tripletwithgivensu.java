import java.io.*;
import java.util.*;
class tripletwithgivensu
    {
        public void main()
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of the array");
        int size = sc.nextInt(); 
        System.out.println("please enter the value for which you want the pairs  ");
        int x = sc.nextInt();
        int arr[] = new int [size];
        System.out.println("Please enter the values in the array");
        for(int i = 0 ;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0 ;i<size ; i++)
        {
             
            for(int j = i+1;j<size; j++)
            {
                
                for(int k = j+1 ; k<size;k++)
                {
                if(x == (arr[j]+arr[i]+arr[k]))
                {
                    System.out.println(i + " , " + j + " and " + k +" are index "+ arr[i] +" , " + arr[j] + " and " + arr[k] +" are the array elemnts ");
                }
            }
        }
        }
    }
}
        
        
        