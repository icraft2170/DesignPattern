//package creational_pattern.factoryMethod._04_java;
//
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class SpringBeanFactoryExample {
//    public static void main(String[] args) {
//        BeanFactory xmlFactory = new ClassPathXmlApplicationContext("config.xml");
//        String hi = xmlFactory.getBean("hi", String.class);
//        System.out.println(hi);
//
//        BeanFactory javaFactory = new AnnotationConfigApplicationContext(Config.class);
//        String hello = javaFactory.getBean("hello", String.class);
//        System.out.println(hello);
//    }
//}
