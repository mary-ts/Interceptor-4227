package movieRental.Interceptor;

import java.util.ArrayList;

public class Dispatcher {

    ArrayList<Interceptor> interceptor =  new ArrayList<>();


   public void addInterceptor(Interceptor i){
        interceptor.add(i);
   }

   public void getObject(ContextObj o){
        for (int i=0; i < interceptor.size(); i++){
            interceptor.get(i).onStart(o);
        }
   }
}