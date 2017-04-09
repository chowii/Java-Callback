import mypackage.ReceiverClass;

/**
 * Created by Sabbib on 09/04/2017.
 */
public class Main {

    public static void main(String[] args){
        int i = new ReceiverClass().receive();
        System.out.println("Your callback is here: " + i);
    }

}
