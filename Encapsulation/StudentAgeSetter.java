public class StudentAgeSetter{
    private int age;
    public void setAge( int age ){
        if( age > 0 )
            this.age = age;
    }
    public int getAge(){
        return age;
    }
    public static void main(String args[]){
        StudentAgeSetter studentAge = new StudentAgeSetter();
        studentAge.setAge(15);
        System.out.println("Student age : "+studentAge.getAge());
    }
}