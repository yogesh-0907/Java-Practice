class Bank {

    double interestRate() {
        return 5.0;
    }
}

class SBI extends Bank {

    @Override
    double interestRate() {
        return 7.5;
    }

    public static void main(String[] args) {

        SBI s = new SBI();

        System.out.println(s.interestRate());
    }
}