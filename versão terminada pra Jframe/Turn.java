import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.*;


public class Turn {
    public static boolean player1turn=true;
    public static boolean didsomeondewin = false;

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

    public static void turnplayer1(String value){
       int stolenCards=0;
       boolean cardssamevalue=false;

        for(int i=Player.player2.playerdeck.size()-1; i>=0;i--)
        {
            if (value.equals(Player.player2.playerdeck.get(i).value))
            {
                Player.player1.playerdeck.add(Player.player2.playerdeck.get(i));
                Player.player2.playerdeck.remove(Player.player2.playerdeck.get(i));
                stolenCards++;

            }

        }
        numberOfpeixinhosPlayer1();

        if (stolenCards>0)
        {
            return;
        }


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
        if (cardssamevalue)
        {
            return;
        }
        player1turn =false;
    }
    public static void turnplayer2(String value){
        int stolenCards;
        boolean cardssamevalue;

        stolenCards=0;
        cardssamevalue=false;


        for(int i=Player.player1.playerdeck.size()-1; i>=0;i--)
        {
            if (value.equals(Player.player1.playerdeck.get(i).value))
            {
                Player.player2.playerdeck.add(Player.player1.playerdeck.get(i));
                Player.player1.playerdeck.remove(Player.player1.playerdeck.get(i));
                stolenCards++;

            }

        }
        numberOfpeixinhosPlayer2();

        if (stolenCards>0)
        {
            return;
        }

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

        if (cardssamevalue)
        {
            return;
        }
        player1turn = true;
    }

public static void winner(){

         if(Player.player1.peixinhos >=7 || Player.player2.peixinhos >=7){

             JLabel Labelplayerwins = new JLabel();
             Labelplayerwins.setBounds(550,300,700,50);
             Labelplayerwins.setFont(new Font("Arial",Font.PLAIN,50));
             if(Player.player1.peixinhos >=7)
            {
                Labelplayerwins.setText(Player.player1.name + " venceu");

            }
            else {

                 Labelplayerwins.setText(Player.player2.name + " venceu");

            }

             JButton exit = new JButton("Sair");
             exit.setBounds(580,380,100,30);
             exit.addActionListener(new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                     Window.window.dispose();
                 }
             });

             Window.cardspanel.setVisible(false);
             Window.buttonpanel.setVisible(false);

             JButton backtomenu = new JButton("voltar pra o menu");
             backtomenu.setBounds(700,380,150,30);
             backtomenu.addActionListener(new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                     if(!Cards.deck.isEmpty())
                     {
                         Cards.deck.subList(0, Cards.deck.size()).clear();
                     }
                     if(!Player.player1.playerdeck.isEmpty())
                     {
                         Player.player1.playerdeck.subList(0, Player.player1.playerdeck.size()).clear();
                     }
                     if(!Player.player2.playerdeck.isEmpty())
                     {
                         Player.player2.playerdeck.subList(0, Player.player2.playerdeck.size()).clear();
                     }
                     Window.window.remove(exit);
                     Window.window.remove(backtomenu);
                     Window.window.remove(Labelplayerwins);
                     Cards.numbers.subList(0,Cards.numbers.size()).clear();
                     Deck.cardslist.add(Deck.card1);
                     Deck.cardslist.add(Deck.card2);
                     Deck.cardslist.add(Deck.card3);
                     Deck.cardslist.add(Deck.card4);
                     Deck.cardslist.add(Deck.card5);
                     Deck.cardslist.add(Deck.card6);
                     Deck.cardslist.add(Deck.card7);
                     Deck.cardslist.add(Deck.card8);
                     Deck.cardslist.add(Deck.card9);
                     Deck.cardslist.add(Deck.card10);
                     Deck.cardslist.add(Deck.card11);
                     Deck.cardslist.add(Deck.card12);
                     Deck.cardslist.add(Deck.card13);
                     Deck.cardslist.add(Deck.card14);
                     Deck.cardslist.add(Deck.card15);
                     Deck.cardslist.add(Deck.card16);
                     Deck.cardslist.add(Deck.card17);
                     Deck.cardslist.add(Deck.card18);
                     Deck.cardslist.add(Deck.card19);
                     Deck.cardslist.add(Deck.card20);
                     Deck.cardslist.add(Deck.card21);
                     Deck.cardslist.add(Deck.card22);
                     Deck.cardslist.add(Deck.card23);
                     Deck.cardslist.add(Deck.card24);
                     Deck.cardslist.add(Deck.card25);
                     Deck.cardslist.add(Deck.card26);
                     Deck.cardslist.add(Deck.card27);
                     Deck.cardslist.add(Deck.card28);
                     Deck.cardslist.add(Deck.card29);
                     Deck.cardslist.add(Deck.card30);
                     Deck.cardslist.add(Deck.card31);
                     Deck.cardslist.add(Deck.card32);
                     Deck.cardslist.add(Deck.card33);
                     Deck.cardslist.add(Deck.card34);
                     Deck.cardslist.add(Deck.card35);
                     Deck.cardslist.add(Deck.card36);
                     Deck.cardslist.add(Deck.card37);
                     Deck.cardslist.add(Deck.card38);
                     Deck.cardslist.add(Deck.card39);
                     Deck.cardslist.add(Deck.card40);
                     Deck.cardslist.add(Deck.card41);
                     Deck.cardslist.add(Deck.card42);
                     Deck.cardslist.add(Deck.card43);
                     Deck.cardslist.add(Deck.card44);
                     Deck.cardslist.add(Deck.card45);
                     Deck.cardslist.add(Deck.card46);
                     Deck.cardslist.add(Deck.card47);
                     Deck.cardslist.add(Deck.card48);
                     Deck.cardslist.add(Deck.card49);
                     Deck.cardslist.add(Deck.card50);
                     Deck.cardslist.add(Deck.card51);
                     Deck.cardslist.add(Deck.card52);



                     Cards.shuffle();
                     Cards.distribute();
                     Turn.numberOfpeixinhosPlayer1();
                     Turn.numberOfpeixinhosPlayer2();
                     Window.cardspanel.removeAll();
                     Window.buttonpanel.removeAll();
                     Window.window.dispose();
                     Window.menu();
                 }
             });
            Player.player1.peixinhos=0;
            Player.player2.peixinhos=0;
             Window.window.add(Labelplayerwins);
             Window.window.add(exit);
             Window.window.add(backtomenu);
             didsomeondewin=true;

         }

}

}

