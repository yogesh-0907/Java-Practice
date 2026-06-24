public class SetterOnly {
    private String password;
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public static void main(String args[]){
        SetterOnly account = new SetterOnly();
        account.setPassword("Nani@0709");
    }
}
