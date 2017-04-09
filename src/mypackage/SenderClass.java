package mypackage;

/**
 * Created by Sabbib on 09/04/2017.
 */
public class SenderClass {

    int t ;

    interface Inter{
        void me(int val);
    }

    public void send(Inter in){
        t = 1000;
        in.me(t);
    }

}
