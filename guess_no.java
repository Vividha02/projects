import java.util.*;
public class Game2
{
    int a;
    int b;
    int c = 0;
    public Game2()
    {
        Random ram = new Random();
        a = ram.nextInt(100);
    }
    void takeUserInput()
    {
        System.out.println("Guess the number from 0 to 100");
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
    }
    boolean isCorrectNumber()
    {
        while(a!=b)
        {
            if(a<b)
            {
                System.out.println("Guessed value is larger, guess a bit less");
                takeUserInput();
                c++;
            }
            else if(a>b)
            {
                System.out.println("Guessed number is smaller,guess a bit larger");
                takeUserInput();
                c++;
            }
        }
        System.out.println("Number entered by user is true");
        return true;
    }
    int numberOfGuesses()
    {
        return c;
    }
    public static void main(String[] args)
    {
        Game2 game = new Game2();
        game.takeUserInput();
        game.isCorrectNumber();
        System.out.println();
        System.out.println();
        System.out.println("Total number of guesses = your score");
        System.out.println(game.numberOfGuesses());
        
    }
}