class LoginSystem {
    public static void main(String[] args) {

        String username = "admin";
        String password = "java123";

        if(username.equals("admin") && password.equals("java123")) {
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Invalid Credentials");
        }
    }
}