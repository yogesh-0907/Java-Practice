class ObjectReference {

    int x = 100;

    public static void main(String[] args) {

        ObjectReference a = new ObjectReference();

        ObjectReference b = a;

        System.out.println(a.x);
        System.out.println(b.x);
    }
}