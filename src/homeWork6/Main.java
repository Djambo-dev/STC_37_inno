package homeWork6;

public class Main {

    public static void main(String[] args) {
        Channel channel1 = new Channel("Discovery", new Program[5]);
        channel1.addProgramInChannel(new Program("Adventure Time1"));
        channel1.addProgramInChannel(new Program("Adventure Time2"));
        channel1.addProgramInChannel(new Program("Adventure Time3"));
        channel1.addProgramInChannel(new Program("Adventure Time4"));
        channel1.addProgramInChannel(new Program("Adventure Time5"));

        Channel channel2 = new Channel("Cooking", new Program[5]);
        channel2.addProgramInChannel(new Program("Cooking time1"));
        channel2.addProgramInChannel(new Program("Cooking time2"));
        channel2.addProgramInChannel(new Program("Cooking time3"));
        channel2.addProgramInChannel(new Program("Cooking time4"));
        channel2.addProgramInChannel(new Program("Cooking time5"));

        Channel channel3 = new Channel("News", new Program[5]);
        channel3.addProgramInChannel(new Program("News time5"));
        channel3.addProgramInChannel(new Program("News time4"));
        channel3.addProgramInChannel(new Program("News time3"));
        channel3.addProgramInChannel(new Program("News time2"));
        channel3.addProgramInChannel(new Program("News time1"));

        Channel channel4 = new Channel("Movies", new Program[5]);
        channel4.addProgramInChannel(new Program("Movies time1"));
        channel4.addProgramInChannel(new Program("Movies time2"));
        channel4.addProgramInChannel(new Program("Movies time3"));
        channel4.addProgramInChannel(new Program("Movies time4"));
        channel4.addProgramInChannel(new Program("Movies time5"));

        Channel channel5 = new Channel("Cartoons", new Program[5]);
        channel5.addProgramInChannel(new Program("Cartoons time1"));
        channel5.addProgramInChannel(new Program("Cartoons time2"));
        channel5.addProgramInChannel(new Program("Cartoons time3"));
        channel5.addProgramInChannel(new Program("Cartoons time4"));
        channel5.addProgramInChannel(new Program("Cartoons time5"));

        TV tv1 = new TV(new Channel[5]);
        tv1.addChannelInTv(channel1);
        tv1.addChannelInTv(channel2);
        tv1.addChannelInTv(channel3);
        tv1.addChannelInTv(channel4);
        tv1.addChannelInTv(channel5);

        RemoteController remoteController1 = new RemoteController(tv1);
        remoteController1.selectChannel(0);
        remoteController1.selectChannel(1);
        remoteController1.selectChannel(2);
        remoteController1.selectChannel(3);
        remoteController1.selectChannel(4);
        remoteController1.selectChannel(5);
    }
}
