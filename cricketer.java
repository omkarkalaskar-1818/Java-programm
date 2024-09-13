
import java.util.Scanner;


public class cricketer {
    int pid;
    String name;
    int totalRun;
    int inning_played;
    int notout;
    public void get_data(int pid,String name,int totalRun,int inning_played,int notout)
    {
        this.pid=pid;
        this.name=name;
        this.totalRun=totalRun;
        this.inning_played=inning_played;
        this.notout=notout;
    }
    public void calulate(){
        int inning=inning_played-notout;
        if(inning>0){

        float av= (float)totalRun/inning;
        System.out.println("the average of player is :-"+av);
    }
    else{
        System.out.println("The playr has never been out, socannot find the avrage of player");
    }
}
    public void display(){
        System.out.println("the player id is :"+pid);
        System.out.println("The player name is :"+name);
        System.out.println("The player total run are :"+totalRun);
        System.out.println("The player played inning are :"+inning_played);
        System.out.println("The player are not out in mathes is :"+notout);
    }
    public static void main(String[] args)
     {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the number of players:");
        int size = sc.nextInt();

        // Create an array of cricketer objects
        cricketer[] players = new cricketer[size];

        // Input data for each player
        for (int i = 0; i < size; i++) {
            players[i] = new cricketer();  // Initialize each cricketer object
            System.out.println("\nEnter details for player " + (i + 1) + ":");
            
            System.out.print("Enter Player ID: ");
            int pid = sc.nextInt();
            sc.nextLine(); // Consume the newline

            System.out.print("Enter Player Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Total Runs: ");
            int totalRun = sc.nextInt();

            System.out.print("Enter Innings Played: ");
            int inning_played = sc.nextInt();

            System.out.print("Enter Not Out Count: ");
            int notout = sc.nextInt();

            // Set player data
            players[i].get_data(pid, name, totalRun, inning_played, notout);
        }

        // Display player details and calculate average for each player

        System.out.println("the player detailes: ");
        for (int i = 0; i < size; i++) {
            players[i].display();
            players[i].calulate();
        }
    }
    
}
