package mypackage;

/**
 * Created by Sabbib on 09/04/2017.
 */
public class ReceiverClass implements SenderClass.Inter{

    private int num;

    public int take(){
        new SenderClass().send(this);
        return num;
    }

    public void me(int var){
        num = var;
    }

}
