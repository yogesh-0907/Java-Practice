class ThisKeyword {

    int id;

    ThisKeyword(int id) {

        this.id = id;
    }

    void display() {
        System.out.println(id);
    }

    public static void main(String[] args) {

        ThisKeyword obj = new ThisKeyword(101);

        obj.display();
    }
}