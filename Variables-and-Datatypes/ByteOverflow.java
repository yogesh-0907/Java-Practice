class ByteOverflow {
    public static void main(String[] args) {
        byte num = 127;
        num++;
        System.out.println("After Overflow: " + num);
    }
}