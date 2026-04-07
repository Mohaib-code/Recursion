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
    public static void main (String args[]){
        // printN(1);
        fun(10);
    }
}
