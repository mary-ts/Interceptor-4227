package movieRental.Interceptor;

public class ConcreteInt implements Interceptor{

    @Override
    public void onStart(ContextObj context) {
        System.out.println("Hello " + context.getName() + "!");
    }
    
}
