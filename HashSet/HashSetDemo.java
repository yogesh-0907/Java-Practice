import java.util.HashSet;
class HashSetDemo{
    public static void main(String args[]){
        HashSet<String> skills = new HashSet<>();
        skills.add("Java");
        skills.add("DSA");
        skills.add("Java");
        skills.add("SQL");
        skills.add("DSA");
        System.out.println(skills);
        System.out.println(skills.size());
        System.out.println("Skills contian Java : "+skills.contains("Java"));
        skills.remove("SQL");
        System.out.println(skills);
        for( String skill : skills ){
            System.out.println(skill);
        }
    }
}