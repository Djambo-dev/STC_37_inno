import java.util.Random;

public class Channel {

    public Channel(String channelName, Program[] programs) {
        this.channelName = channelName;
        this.programs = programs;
    }

    private String channelName;
    private Program[] programs;

    public void addProgramInChannel(Program program) {
        for (int i = 0; i < programs.length; i++) {
            if (programs[i] == null) {
                programs[i] = program;
                break;
            }
        }

    }

    public void showProgram() {
        Random random = new Random();
        Program program = programs[random.nextInt(programs.length)];
        System.out.println("Показана программа: " + program.getName());
    }


    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Program[] getPrograms() {
        return programs;
    }

    public void setPrograms(Program[] programs) {
        this.programs = programs;
    }
}
