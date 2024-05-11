import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        
        System.out.println("Lazy Singltone : "+LazySingleton.getInstance());
        System.out.println("Lazy Singltone : "+LazySingleton.getInstance());

        System.out.println("Early Singleton : "+ EarlySingleton.getInstance());
        System.out.println("Early Singleton : "+ EarlySingleton.getInstance());

        System.out.println("Multithreaded Singleton : "+ MultithrededSigleton.getInstance());
        System.out.println("Multithreaded Singleton : "+ MultithrededSigleton.getInstance());

        Constructor<MultithrededSigleton> declaredConstructor = MultithrededSigleton.class.getDeclaredConstructor();

        
            declaredConstructor.setAccessible(true);

        MultithrededSigleton multithrededSigleton = declaredConstructor.newInstance();

        System.out.println(multithrededSigleton);


        System.out.println(EnumSingleton.Instance);
        System.out.println(EnumSingleton.Instance);
    }
}