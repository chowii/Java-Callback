package mypackage;

/**
 * Created by Sabbib on 09/04/2017.
 */
public class ReceiverClass implements SenderClass.ValueCallback {

    /**
     * This class implements the interface method
     */


    private int mReceiveValue;

    /**
     * This method invokes the method from the sender class to send the data to this class, by invoking
     * @return
     */
    public int receive(){
        new SenderClass().send(this);
        return mReceiveValue;
    }


    /**
     * The abstract method receives the object that is being passed through as the parameter
     * @param mPassValue
     */
    public void sendFunction(int mPassValue){
        mReceiveValue = mPassValue;
    }

}
