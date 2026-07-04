public class Calculator {
    static int add(int a,int b){
        return a+b;
    }    
    static int sub(int a,int b){
        return a-b;
    }    
    static int mul(int a,int b){
        return a*b;
    }    
    static int div(int a,int b){
        if(b==0){
            System.out.println("Division is not possible with zero");
            return -1;
        }
        return a/b;
    }
    public static void main(String args[]){
        int a = 10;
        int b = 0;
        System.out.println("Addition : "+add(a,b));
        System.out.println("Subtraction : "+sub(a,b));
        System.out.println("Multiplication : "+mul(a,b));
        System.out.println("Division : "+div(a,b));
    }
}
