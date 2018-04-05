/**
 * Created by specu on 04.04.2018.
 */
public abstract class UserInterface {

    public static Options getOptions()
    {
        //values taken from GUI
        //test values here:
        Options newOptions = new Options(1, 2 ,"test","test");
        return newOptions;
    }
    int getFPSvalue(Options options)
    {
        return options.readFPSvalue();
    }
    int getNumberOfFrames(Options options)
    {
        return options.readNumberOfFrames();
    }
    String readPath(Options options, char io)
    {
        return options.readPath(io);
    }
}
