public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public void printPerson(){
        System.out.println(firstName + " " + lastName + " (" + age + ")");
    }
}
