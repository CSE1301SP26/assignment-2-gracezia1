import java.util.Scanner;
public class Nim {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("How many sticks to start?");
    int totalSticks = in.nextInt();
    int humanSticks = 0;
    int computerSticks = 0;
while (totalSticks > 0) {
System.out.println("How many sticks do you take (1 or 2)?");
humanSticks = in.nextInt();

if (humanSticks > totalSticks){
    System.out.println("Pick again");
    humanSticks = in.nextInt();
}
else if (humanSticks == totalSticks){
    System.out.println("You win!");
}
while (humanSticks != 2 && humanSticks != 1){
System.out.println("Pick again");
    humanSticks = in.nextInt();
}

totalSticks = totalSticks - humanSticks;
System.out.println("Remaining sticks: " + totalSticks);

if (totalSticks > 2){
System.out.println("How many sticks does the computer take?");
computerSticks = (int)(Math.random()*2) + 1;
System.out.println(computerSticks); 
totalSticks = totalSticks - computerSticks;
System.out.println("Remaining sticks: " + totalSticks);
    }
    else if(totalSticks < 2 && totalSticks >0){
        System.out.println("How many sticks does the computer take?");
        System.out.println("1");
        System.out.println("Remaining sticks: 0");
        totalSticks = 0;
        System.out.println("Computer wins!");
    }
    }

if (totalSticks <= 0){
    System.out.println("Game over!");
}
}
}


