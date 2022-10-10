import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        String playerA = "";
        String playerB = "";
        String trash = "";
        boolean done = false;
        Scanner in = new Scanner(System.in);
        String playAgain = "";

        do
        {
            System.out.print("Enter Player A's move : ");


            if(in.hasNextLine())
            {
                playerA = in.nextLine();


                System.out.print("Enter Player B's move: ");
                playerB = in.nextLine();


                if (playerA.equalsIgnoreCase("R"))
                {
                    if (playerB.equalsIgnoreCase("R"))
                    {
                        System.out.println("Rock vs Rock, it's a TIE!");

                        System.out.print("Do you want to play again? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("N"))
                        {
                            done = true;
                        }
                    }
                    else if (playerB.equalsIgnoreCase("P"))
                    {
                        System.out.println("Paper cover Rock, Player B Wins!");

                        System.out.print("Do you want to play again? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("N"))
                        {
                            done = true;
                        }

                    }
                    else if (playerB.equalsIgnoreCase("S"))// Player B must be Scissors
                    {
                        System.out.println("Rock breaks Scissors, Player A Wins!");

                        System.out.print("Do you want to play again? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("N"))
                        {
                            done = true;
                        }
                    }
                    else
                    {
                        trash = in.nextLine();
                        System.out.println("You must enter a valid RPS Move for both players to continue. ");
                    }
                }

                else if (playerA.equalsIgnoreCase("P"))
                {
                    if (playerB.equalsIgnoreCase("R"))
                    {
                        System.out.println("Paper cover Rock, Player A Wins!");

                        System.out.print("Do you want to play again? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("N"))
                        {
                            done = true;
                        }
                    }
                    else if (playerB.equalsIgnoreCase("P"))
                    {
                        System.out.println("Paper vs Paper, it's a TIE!");

                        System.out.print("Do you want to play again? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("N"))
                        {
                            done = true;
                        }
                    }
                    else if (playerB.equalsIgnoreCase("S")) // Player B must be Scissors
                    {
                        System.out.println("Scissor cuts Paper, Player B Wins!");

                        System.out.print("Do you want to play again? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("N"))
                        {
                            done = true;
                        }

                    }
                    else
                    {
                        trash = in.nextLine();
                        System.out.println("You must enter a valid RPS Move for both players to continue. ");
                    }
                }
                else if (playerA.equalsIgnoreCase("S")) // playerA must be Scissors
                {
                    if (playerB.equalsIgnoreCase("R"))
                    {
                        System.out.println("Rock breaks Scissor, Player B Wins!");

                        System.out.print("Do you want to play again? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("N"))
                        {
                            done = true;
                        }
                    }
                    else if (playerB.equalsIgnoreCase("P"))
                    {
                        System.out.println("Scissor cuts Paper, Player A Wins!");

                        System.out.print("Do you want to play again? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("N"))
                        {
                            done = true;
                        }
                    }
                    else if (playerB.equalsIgnoreCase("S")) // Player B must be Scissors
                    {
                        System.out.println("Scissors vs Scissors, it's a TIE!");

                        System.out.print("Do you want to play again? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("N"))
                        {
                            done = true;
                        }
                    }
                    else
                    {
                        trash = in.nextLine();
                        System.out.println("You must enter a valid RPS Move for both players to continue. ");
                    }
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("You must enter a valid RPS Move for both players to continue. ");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid RPS Move for both players to continue.");
            }

        }while(!done);

    }
}