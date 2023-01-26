public class Person {
    private String firstname;
    private String lastName;
    private int age;


    public Person (String firstname, String lastName,int age){
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
