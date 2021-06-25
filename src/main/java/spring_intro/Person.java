package spring_intro;

public class Person {
    private Pet pet;
    private int age;
    private String surname;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }
//    public Person(Pet pet) {
//        System.out.println("Person bean has been created");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Person bean has been created");
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, pet!");
        pet.say();
    }
}
