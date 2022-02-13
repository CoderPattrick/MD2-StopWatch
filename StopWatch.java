import java.util.Date;

public class StopWatch {
    long startTime;
    long endTime;
    public void startTime(){
        Date date = new Date();
        startTime= date.getTime();
    }
    public void endTime(){
        Date date = new Date();
        endTime= date.getTime();
    }
    public long getElapsedTime(){
        return endTime-startTime;
    }
}
