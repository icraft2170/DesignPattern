package creational_pattern.singleton;

import java.io.Serializable;

// static inner 클래스 사용하기
public class SingletonFive implements Serializable {

    private SingletonFive() {}

    private static class SingletonFiveHolder{
        private static final SingletonFive INSTANCE = new SingletonFive();
    }

    public static SingletonFive getInstance() {
        return SingletonFiveHolder.INSTANCE;
    }

    protected Object readResolver(){
        return getInstance();
    }


}
