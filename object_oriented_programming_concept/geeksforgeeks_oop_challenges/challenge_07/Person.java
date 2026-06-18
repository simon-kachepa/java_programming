package challenge_07;

public class Person {
    private String firstName;
    private String lastName;

    // Constructor to initialise the data fields
    public Person(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    // setter method for firstName
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    // getter method for firstName
    public String getFirstName(){
        return this.firstName;
    }

    // setter method for lastName
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    // getter method for firstName
    public String getLastName(){
        return this.lastName;
    }

    // Overriding the toString method to return first and last name
    @Override
    public String toString(){
        return this.getFirstName() + " " + this.getLastName();
    }
}
