class CharacterType {
    public static void main(String[] args) {

        char ch = 'A';

        if(ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase Letter");
        }
        else if(ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase Letter");
        }
        else {
            System.out.println("Special Character");
        }
    }
}