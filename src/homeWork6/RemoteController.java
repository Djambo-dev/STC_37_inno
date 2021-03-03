package homeWork6;

public class RemoteController {

    private TV tv;
    public RemoteController(TV tv){
        this.tv = tv;
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public void selectChannel(int channel){
        this.tv.showChannel(channel);
    }
}

