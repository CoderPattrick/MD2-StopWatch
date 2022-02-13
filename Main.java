import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.startTime();
        Scanner input =new Scanner(System.in);
        boolean choice = true;
        while (choice){
            System.out.println("Enter 1 to stop watch.");
        int chosenNumb = input.nextInt();
        if(chosenNumb==1){
         choice=false;
         stopWatch.endTime();
         long timePassed = stopWatch.getElapsedTime();
            System.out.println(timePassed);
        }
        }
    }
}
