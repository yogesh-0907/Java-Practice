public class PPP {
    private int var_1 = 1;
    int private_method(){
        return var_1;
    }
    protected int var_2;
    public int var_3;
    public static void main(String args[]){
        PPP obj = new PPP();
        System.out.println("Private Variable : "+obj.private_method());
        System.out.println("Protected Variable : "+obj.var_2);
        System.out.println("Private Variable : "+obj.var_3);
        
    }
}
