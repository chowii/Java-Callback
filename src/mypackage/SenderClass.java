package mypackage;

/**
 * Created by Sabbib on 09/04/2017.
 */
public class SenderClass {

    private int mSendValue;


    /**
     * Interface has method [sendFunction(int)] that takes the object that needs to be called back as parameter
     */
    interface ValueCallback {
        void sendFunction(int val);
    }

    /**
     * This method takes in the interface as a parameter to invoke the abstract method
     * @param in
     */
    public void send(ValueCallback in){
        mSendValue = 1000;
        in.sendFunction(mSendValue);
    }

}
