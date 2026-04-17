public class Basic_Recursion{
    public static void printN(int n){
        //Base Case
        if(n==10){
            return;
        }
        //Work
        System.out.println(n);
        //Recursive call
        printN(n+1);
    }
    public static void fun(int n) {
    if(n == 0) return;

    fun(n - 1);
    System.out.println(n);
}
    public static void printInc(int n){
        //Base Condition
        if(n ==0){
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static int factorial(int n){
        //Base Case
        if (n == 0){
            return 1;
        }
        //f(n)=n*f(n-1)
        //function call
        return n*factorial(n-1);

    }
    public static int fact(int n){
        //Base case
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fnm1;
        return fn;
    }
    public static int sumNaturalNumber(int n){
        //Base Case
        if(n==1){
            return 1;
        }
        //Function Call
        int fnm1=sumNaturalNumber(n-1);
        int fn=n+fnm1;
        return fn;
    }
    public static int fibo(int n){
        if(n==1 || n==0){
            return n;
        }
        int fnm1=fibo(n-1);
        int fnm2=fibo(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void firstOccurence(int arr[],int i,int key){
        if(i==arr.length){
            System.out.println(-1);
            return ;
        }
        if(arr[i]==key){
            System.out.println("key found at index :"+i);
            return;
        }
        firstOccurence(arr, i+1, key);
    }
    public static int lastOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int ls=lastOccurence(arr, key, i+1);
        if(ls != -1){
            return ls;
        }
        if(arr[i]==key){
            return i;
        }
        return ls;

    }
    public static int isPow(int x,int n){
        if(n==0){
            return 1;
        }
        
        int pow=x*isPow(x, n-1);
        return pow;
    }
    public static int optiPow(int a ,int n){
        //O(log n)
        //Base Condition
        if(n == 0){
            return 1;
        }
        int half=optiPow(a, n/2);
        int halfSqr=half*half;
        //if n is odd
        if(n%2 !=0){
            halfSqr=a*halfSqr;
        }
        return halfSqr;
    }
    public static int tileProblem(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //vertical case
        int ver=tileProblem(n-1);
        //horizontal case
        int hor=tileProblem(n-2);
        return ver+hor;
    }
    public static void main (String args[]){
        // printN(1);
        // fun(10);
        // printInc(10);
        // System.out.println(factorial(5));
        // System.out.println(fact(5));
        // System.out.println(sumNaturalNumber(5));
        // System.out.println(fibo(5));
        // int arr[]={1,2,4,3,4,5};
        // System.out.println(isSorted(arr, 0));
        // int arr2[]={2,34,3,2,5,3,4,5,5,5};
        // firstOccurence(arr2, 0, 35);
        // int arr3[]={2,3,4,5,6,7,5};
        // int ls=lastOccurence(arr3, 5, 0);
        // System.out.println(ls);
        // System.out.println(isPow(2, 5));
        // System.out.println(optiPow(2, 15));
        System.out.println(tileProblem(5));
    }
}
