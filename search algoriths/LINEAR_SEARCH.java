class LINEAR_SEARCH

// name of the java file should be same as class name having main method ==>for error main method not found

{
    public static int search(int arr[],int n,int x)    //n is the length of array// x is our search element
    {
       for (int i=0;i<n;i++)   //traversing through loop
       {
        if (arr[i]==x)
           return i;
       }
       return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,10,40};
        int x=10;    //target
        int n=arr.length;
        int result=search(arr,n,x);  //calling search method 
        if (result==-1)
        System.out.print("Not found");
        else
        System.out.print(" Found @index "+result);


    }


}

//Timee complexity 
  //==>best case --> O(1) [target found at first index,, since we are also searching from first index]
  //==>worst case-->O(n)  [target is in last index,,since target is in last index of array,,loop should run n times]

//Auxilaty space
    //==> O(1)  [except for the variable to iterate through the list, no other variable is used]