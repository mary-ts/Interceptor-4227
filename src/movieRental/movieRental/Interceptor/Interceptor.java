package movieRental.Interceptor;

public interface Interceptor {
    void onStart (ContextObj context);
    
    void onEnd(ContextObj context);
}
