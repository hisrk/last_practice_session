public class LazySingleton {


    private static LazySingleton lazySingleton;

    private LazySingleton(){}

  public static LazySingleton getInstance(){

        if(lazySingleton==null){

            return lazySingleton=new LazySingleton();
        }else {

            return lazySingleton;
        }

  }


}
