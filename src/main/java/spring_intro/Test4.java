package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

//        Dog myDog = context.getBean("MyPet", Dog.class);
//        myDog.setName("Belka");
//        Dog yourDog = context.getBean("MyPet", Dog.class);
//        yourDog.setName("Strelka");
//
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());

//        System.out.println(myDog.equals(yourDog)); //ссылаются на один объект (Синглтон)

        context.close();
    }
}
