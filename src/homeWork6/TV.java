package homeWork6;

public class TV {


    private Channel[] channels;



    public Channel[] getChannels() {
        return channels;
    }

    public void setChannels(Channel[] channels) {
        this.channels = channels;
    }

    public TV(Channel[] channels){

        this.channels = channels;
    }


    public void showChannel (int channelNumber){
        try {
            Channel channel = channels[channelNumber];
            System.out.println("Выбран канал: " + channel.getChannelName());
            channel.showProgram();
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Канала под номером " + channelNumber + " не существует");
        }

    }
    public void addChannelInTv(Channel channel) {
        for (int i = 0; i < channels.length; i++) {
            if (channels[i] == null) {
                channels[i] = channel;
                break;
            }
        }

    }
}
