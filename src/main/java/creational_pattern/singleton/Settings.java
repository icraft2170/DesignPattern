package creational_pattern.singleton;




public class Settings {
    private Settings() {}

    private static class SettingsHolder{
        private static final Settings INSTANCE = new Settings();
    }

    public synchronized static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
    
}


//
//public class Settings {
//    private Settings() {}
//
//    private static class SettingsHolder{
//        private static final Settings INSTANCE = new Settings();
//    }
//
//    public synchronized static Settings getInstance() {
//        return SettingsHolder.INSTANCE;
//    }
//}











/**
//public class Settings {
//    private static Settings instance;
//
//    private Settings() {}
//
//    public synchronized static Settings getInstance() {
//        if(instance == null){
//            instance = new Settings();
//        }
//        return instance;
//    }
//}
*/



/**
 * 싱글톤을 구현하는 방법 1
 *
 *      public class Settings {
 *
 *          private static Settings instance;
 *
 *          private Settings() {}
 *
 *          public static Settings getInstance() {
 *
 *              if(instance == null){
 *                     instance = new Settings();
 *              }
 *
 *              return instance;
 *           }
 *      }
 */
