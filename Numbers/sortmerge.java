import java.util.Scanner;
class arr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        printArray(arr, n); 
        mergesort(int s,int e,int m);
        printArray(arr, n);
        System.out.print(arr[]);

    }

    public static void merge(int s,int e,int m){
         int n1 = m - s + 1;    
         int n2 = e - m;    
         int Larray[n1], Rarray[n2];
         for (int i = 0; i < n1; i++){  
            Larray[i] = arr[s + i];    
            for (int j = 0; j < n2; j++)    
            Rarray[j] = arr[m + 1 + j];    
            i = 0; 
            j = 0; 
            k = s; 
            
            while (i < n1 && j < n2){    
                if(Larray[i] <= Rarray[j]){    
                    arr[k] = Larray[i];    
                    i++;    
                }
                else{    
                    arr[k] = Rarray[j];    
                    j++;    
                }k++;    
            }    
            
            while (i<n1){    
                arr[k] = Larray[i];    
                i++;    
                k++;  
            }    
      
            while (j<n2){    
                arr[k] = Rarray[j];    
                j++;    
                k++;    
            }
void mergeSort(int a[], int beg, int end){  
    if (s < e)   
    {  
        int m = (b + e) / 2;  
        mergeSort(arr[], s, m);  
        mergeSort(arr[], m + 1, e);  
        merge(arr[], b, m, e);  
    }  
}

void printArray(int arr[], int n)  
{  
    int i;  
    for (i = 0; i < n; i++)  
        printf("%d ", arr[i]);  
        printf("\n");  
}  

}    
  
    }
}
