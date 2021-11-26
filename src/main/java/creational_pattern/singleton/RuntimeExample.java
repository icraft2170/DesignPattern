package creational_pattern.singleton;

public class RuntimeExample {

    public static void main(String[] args) {
        // 애플리케이션의 실행되는 환경 문맥 정보.
        Runtime runtime1 = Runtime.getRuntime();
        Runtime runtime2 = Runtime.getRuntime();

        System.out.println(runtime1 == runtime2);

        System.out.println(runtime1.maxMemory());
        System.out.println(runtime1.freeMemory());
    }
}
