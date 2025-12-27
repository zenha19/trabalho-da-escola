import java.util.*;


public class Turn {

    public static void numberOfpeixinhosPlayer1() {
        int A = 0;
        int Q = 0;
        int J = 0;
        int K = 0;

        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        int ten = 0;
        int index = 0;
        for (Deck obj : Player.player1.playerdeck) {
            switch (Player.player1.playerdeck.get(index).value) {
                case ("A"):
                    A += 1;
                    break;
                case ("Q"):
                    Q += 1;
                    break;
                case ("J"):
                    J += 1;
                    break;
                case ("K"):
                    K += 1;
                    break;

                case ("2"):
                    two += 1;
                    break;
                case ("3"):
                    three += 1;
                    break;
                case ("4"):
                    four += 1;
                    break;
                case ("5"):
                    five += 1;
                    break;
                case ("6"):
                    six += 1;
                    break;
                case ("7"):
                    seven += 1;
                    break;
                case ("8"):
                    eight += 1;
                    break;
                case ("9"):
                    nine += 1;
                    break;
                default:
                    ten += 1;
                    break;
            }
            index++;
        }
        if (A == 4 || Q == 4 || J == 4 || K == 4 ||  two == 4 || three == 4 || four == 4 || five == 4 || six == 4 || seven == 4 || eight == 4 || nine == 4 || ten == 4) {

            String value = Turn.valueOfPeixinho(A, Q, J, K, two, three, four, five, six, seven, eight, nine, ten);


            for (int i=Player.player1.playerdeck.size()-1;i>=0;i--) {
                if (Objects.equals(Player.player1.playerdeck.get(i).value, value)) {
                    Player.player1.playerdeck.remove(i);
                }

            }
            Player.player1.peixinhos += 1;
            IO.println(Player.player1.name+" fez um peixinho");
            IO.println();
        }

    }

    public static void numberOfpeixinhosPlayer2() {
        int A = 0;
        int Q = 0;
        int J = 0;
        int K = 0;

        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        int ten = 0;
        int index = 0;
        for (Deck obj : Player.player2.playerdeck) {
            switch (Player.player2.playerdeck.get(index).value) {
                case ("A"):
                    A += 1;
                    break;
                case ("Q"):
                    Q += 1;
                    break;
                case ("J"):
                    J += 1;
                    break;
                case ("K"):
                    K += 1;
                    break;

                case ("2"):
                    two += 1;
                    break;
                case ("3"):
                    three += 1;
                    break;
                case ("4"):
                    four += 1;
                    break;
                case ("5"):
                    five += 1;
                    break;
                case ("6"):
                    six += 1;
                    break;
                case ("7"):
                    seven += 1;
                    break;
                case ("8"):
                    eight += 1;
                    break;
                case ("9"):
                    nine += 1;
                    break;
                default:
                    ten += 1;
                    break;
            }
            index++;
        }
        if (A == 4 || Q == 4 || J == 4 || K == 4 || two == 4 || three == 4 || four == 4 || five == 4 || six == 4 || seven == 4 || eight == 4 || nine == 4 || ten == 4) {
            String value = Turn.valueOfPeixinho(A, Q, J, K,  two, three, four, five, six, seven, eight, nine, ten);


            for (int i=Player.player2.playerdeck.size()-1;i>=0;i--) {
                if (Objects.equals(Player.player2.playerdeck.get(i).value, value)) {
                    Player.player2.playerdeck.remove(i);
                }

            }
            Player.player2.peixinhos += 1;

            IO.println(Player.player2.name+" fez um peixinho");
            IO.println();

        }

    }

    public static String valueOfPeixinho(int A, int Q, int J, int K, int two, int three, int four, int five, int six, int seven, int eight, int nine, int ten) {
        String value;
        if (A == 4) {
            value = "A";

        } else if (Q == 4) {
            value = "Q";
        } else if (J == 4) {
            value = "J";

        } else if (K == 4) {
            value = "K";


        } else if (two == 4) {
            value = "2";

        } else if (three == 4) {

            value = "3";
        } else if (four == 4) {
            value = "4";

        } else if (five == 4) {
            value = "5";

        } else if (six == 4) {
            value = "6";

        } else if (seven == 4) {
            value = "7";

        } else if (eight == 4) {
            value = "8";

        } else if (nine == 4) {
            value = "9";

        } else {
            value = "10";

        }

        return value;
    }

public static void turns(){
    int index=0;
    int stolenCards;
    boolean cardssamevalue;
    String value;
        do{
            do {


                do {
                    stolenCards=0;
                    cardssamevalue=false;

                    IO.println("turno do "+Player.player1.name);
                    IO.readln();

                    for(int i=Player.player1.playerdeck.size()-1; i>=0;i--)
                    {
                        IO.println(Player.player1.playerdeck.get(i).suit +"."+Player.player1.playerdeck.get(i).value);

                    }
                    IO.readln();

                    int repeat=0;
                    do {

                        if(repeat>0)
                        {   IO.println("deve escolher A,J,K,Q ou um numero de 2 a 10");}
                        IO.println("escolha o valor que quer");
                        value =IO.readln();
                        repeat++;

                    }while (!Objects.equals(value, "A") && !Objects.equals(value, "J") && !Objects.equals(value, "Q") && !Objects.equals(value, "K") && !Objects.equals(value, "2") && !Objects.equals(value, "3") && !Objects.equals(value, "4") && !Objects.equals(value, "5") && !Objects.equals(value, "6") && !Objects.equals(value, "7") && !Objects.equals(value, "8") && !Objects.equals(value, "9") && !Objects.equals(value, "10"));

                    for(int i=Player.player2.playerdeck.size()-1; i>=0;i--)
                    {
                         if (value.equals(Player.player2.playerdeck.get(i).value))
                         {
                             Player.player1.playerdeck.add(Player.player2.playerdeck.get(i));
                             Player.player2.playerdeck.remove(Player.player2.playerdeck.get(i));
                             stolenCards++;
                             IO.println("roubou 1 carta");
                         }

                    }
                    numberOfpeixinhosPlayer1();
                }while (stolenCards>0);

                if (!Cards.deck.isEmpty())
                {
                    if(Objects.equals(Cards.deck.getLast().value, value))
                    {
                        cardssamevalue=true;
                    }
                   Player.player1.playerdeck.add(Cards.deck.getLast());
                    Cards.deck.remove(Cards.deck.getLast());

                }
                numberOfpeixinhosPlayer1();
            }while (cardssamevalue==true);
            do {


                do {
                        stolenCards=0;
                        cardssamevalue=false;

                        IO.println("turno do "+Player.player2.name);
                        IO.readln();

                        for(int i=Player.player2.playerdeck.size()-1; i>=0;i--)
                        {
                            IO.println(Player.player2.playerdeck.get(i).suit +"."+Player.player2.playerdeck.get(i).value);

                        }
                        IO.readln();

                        int repeat=0;
                        do {

                            if(repeat>0)
                            {   IO.println("deve escolher A,J,K,Q ou um numero de 2 a 10");}
                            IO.println("escolha o valor que quer");
                            value =IO.readln();
                            repeat++;

                        }while (!Objects.equals(value, "A") && !Objects.equals(value, "J") && !Objects.equals(value, "Q") && !Objects.equals(value, "K") && !Objects.equals(value, "2") && !Objects.equals(value, "3") && !Objects.equals(value, "4") && !Objects.equals(value, "5") && !Objects.equals(value, "6") && !Objects.equals(value, "7") && !Objects.equals(value, "8") && !Objects.equals(value, "9") && !Objects.equals(value, "10"));

                        for(int i=Player.player1.playerdeck.size()-1; i>=0;i--)
                        {
                            if (value.equals(Player.player1.playerdeck.get(i).value))
                            {
                                Player.player2.playerdeck.add(Player.player1.playerdeck.get(i));
                                Player.player1.playerdeck.remove(Player.player1.playerdeck.get(i));
                                stolenCards++;
                                IO.println("roubou 1 carta");
                            }

                        }
                        numberOfpeixinhosPlayer2();
                    }while (stolenCards>0);
                    if (!Cards.deck.isEmpty())
                    {
                        if(Objects.equals(Cards.deck.getLast().value, value))
                        {
                            cardssamevalue=true;
                        }
                        Player.player2.playerdeck.add(Cards.deck.getLast());
                        Cards.deck.remove(Cards.deck.getLast());

                    }
                numberOfpeixinhosPlayer2();
            }while (cardssamevalue==true);
        }while (Player.player1.peixinhos <7 || Player.player2.peixinhos <7);
        if(Player.player1.peixinhos >=7)
        {
            IO.println(Player.player1.name+" venceu");
        }
        else {
            IO.println(Player.player2.name+" venceu");
        }
}

}

