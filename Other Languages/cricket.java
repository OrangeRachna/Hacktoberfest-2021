import java.util.Scanner;

public class cricket
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        final int players = 11;
        int runs[] = new int[players];
        String names[] = new String[players];
        try{
        for (int i = 0; i < players; i++) {
            System.out.println("Enter player " + (i + 1) + " name:");
            names[i] = in.nextLine();
            System.out.println("Enter player " + (i + 1) + " score:");
            runs[i] = in.nextInt();
            in.nextLine();
        }
    }
    catch(ArithmeticException  e){
        System.out.println(e);
    }
        
        int highScore = 0;
        for (int i = 1; i < players; i++) {
            if (runs[i] > runs[highScore])
                highScore = i;
        }
        
        System.out.println("Highest Scorer");
        System.out.println(names[highScore] + "\t" + runs[highScore]);
        System.out.println("man of the match award goes to :"+names[highScore]);
        
        final int bowlers=5;
        int wickets[]=new int[bowlers];
        String bnames[] = new String[bowlers];
        
        for (int i = 0; i < bowlers; i++) {
                System.out.println("Enter bowler " + (i + 1) + " name:");
                bnames[i] = in.nextLine();
                System.out.println("Enter wickets taken by " +bnames[i]+":");
                wickets[i] = in.nextInt();
                in.nextLine();
            }
        
        int highwickets = 0;
        for (int i = 1; i < bowlers; i++) {
            if (wickets[i] > wickets[highwickets])
                highwickets = i;
        }
        
        System.out.println("Highest Wicket Taker");
        System.out.println(bnames[highwickets] + "\t" + wickets[highwickets]);
        
    }
}
