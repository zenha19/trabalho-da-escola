import java.util.ArrayList;

import java.util.List;

public class Deck {
    String suit;
    String value;
    int id;

    public static List <Deck> cardslist = new ArrayList<>(){};
    public Deck(int id, String suit, String value)
    {
        this.id=id;
        this.suit = suit;
        this.value = value;
        cardslist.add(this);
    }


    public static Deck card1 = new Deck(0,"Copas","A");
    public static Deck card2 = new Deck(1,"Copas","Q");
    public static Deck card3 = new Deck(2,"Copas","K");
    public static Deck card4 = new Deck(3,"Copas","J");
    public static Deck card5 = new Deck(4,"Copas","2");
    public static Deck card6 = new Deck(5,"Copas","3");
    public static Deck card7 = new Deck(6,"Copas","4");
    public static Deck card8 = new Deck(7,"Copas","5");
    public static Deck card9 = new Deck(8,"Copas","6");
    public static Deck card10 = new Deck(9,"Copas","7");
    public static Deck card11 = new Deck(10,"copas","8");
    public static Deck card12 = new Deck(11,"copas","9");
    public static Deck card13 = new Deck(12,"copas","10");
    public static Deck card14 = new Deck(13,"paus","A");
    public static Deck card15 = new Deck(14,"paus","Q");
    public static Deck card16 = new Deck(15,"paus","K");
    public static Deck card17 = new Deck(16,"paus","J");
    public static Deck card18 = new Deck(17,"paus","2");
    public static Deck card19 = new Deck(18,"paus","3");
    public static Deck card20 = new Deck(19,"paus","4");
    public static Deck card21 = new Deck(20,"paus","5");
    public static Deck card22 = new Deck(21,"paus","6");
    public static Deck card23 = new Deck(22,"paus","7");
    public static Deck card24 = new Deck(23,"paus","8");
    public static Deck card25 = new Deck(24,"paus","9");
    public static Deck card26 = new Deck(25,"paus","10");
    public static Deck card27 = new Deck(26,"ouros","A");
    public static Deck card28 = new Deck(27,"ouros","Q");
    public static Deck card29 = new Deck(28,"ouros","K");
    public static Deck card30 = new Deck(29,"ouros","J");
    public static Deck card31 = new Deck(30,"ouros","2");
    public static Deck card32 = new Deck(31,"ouros","3");
    public static Deck card33 = new Deck(32,"ouros","4");
    public static Deck card34 = new Deck(33,"ouros","5");
    public static Deck card35 = new Deck(34,"ouros","6");
    public static Deck card36 = new Deck(35,"ouros","7");
    public static Deck card37 = new Deck(36,"ouros","8");
    public static Deck card38 = new Deck(37,"ouros","9");
    public static Deck card39 = new Deck(38,"ouros","10");
    public static Deck card40 = new Deck(39,"espadas","A");
    public static Deck card41 = new Deck(40,"espadas","Q");
    public static Deck card42 = new Deck(41,"espadas","K");
    public static Deck card43 = new Deck(42,"espadas","J");
    public static Deck card44 = new Deck(43,"espadas","2");
    public static Deck card45 = new Deck(44,"espadas","3");
    public static Deck card46 = new Deck(45,"espadas","4");
    public static Deck card47 = new Deck(46,"espadas","5");
    public static Deck card48 = new Deck(47,"espadas","6");
    public static Deck card49 = new Deck(48,"espada","7");
    public static Deck card50 = new Deck(49,"espada","8");
    public static Deck card51 = new Deck(50,"espada","9");
    public static Deck card52 = new Deck(51,"espada","10");


}
