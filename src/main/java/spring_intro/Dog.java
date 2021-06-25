package spring_intro;

public class Dog implements Pet {
//    private String name;

    public Dog() {
        System.out.println("Dog bean has been created");
    }

    @Override
    public void say() {
        System.out.println("Bark-bark");
    }

    public void init() {
        System.out.println("Init here");
    }

    public void destroy() {
        System.out.println("Destroy here");

    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
