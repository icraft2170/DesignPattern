package creational_pattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
    SingletonFive sf1 = SingletonFive.getInstance();

    Constructor<SingletonFive> constructor = SingletonFive.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    SingletonFive sf2 = constructor.newInstance();

    System.out.println(sf1 == sf2);
    }
}


//    SingletonFive sf1 = SingletonFive.getInstance();
//    SingletonFive sf2;
//        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singletonFive.obj"))){
//                out.writeObject(sf1);
//                }
//
//                try (ObjectInput in = new ObjectInputStream(new FileInputStream("singletonFive.obj"))){
//                sf2 = (SingletonFive) in.readObject();
//                }
//
//                System.out.println(sf1 == sf2);