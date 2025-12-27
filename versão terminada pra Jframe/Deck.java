import java.util.ArrayList;

import java.util.List;

public class Deck {
    String suit;
    String value;
    int id;
    Object cardimage;

    public static List <Deck> cardslist = new ArrayList<>(){};
    public  Deck(int id, String suit, String value,Object cardimage)
    {
        this.id=id;
        this.suit = suit;
        this.value = value;
        this.cardimage=cardimage;



        cardslist.add(this);
    }


    public static Deck card1 = new Deck(0,"copas","A",Window.imageIcon);
    public static Deck card2 = new Deck(1,"copas","Q",Window.imageIcon1);
    public static Deck card3 = new Deck(2,"copas","K",Window.imageIcon2);
    public static Deck card4 = new Deck(3,"copas","J",Window.imageIcon3);
    public static Deck card5 = new Deck(4,"copas","2",Window.imageIcon4);
    public static Deck card6 = new Deck(5,"copas","3",Window.imageIcon5);
    public static Deck card7 = new Deck(6,"copas","4",Window.imageIcon6);
    public static Deck card8 = new Deck(7,"copas","5",Window.imageIcon7);
    public static Deck card9 = new Deck(8,"copas","6",Window.imageIcon8);
    public static Deck card10 = new Deck(9,"copas","7",Window.imageIcon9);
    public static Deck card11 = new Deck(10,"copas","8",Window.imageIcon10);
    public static Deck card12 = new Deck(11,"copas","9",Window.imageIcon11);
    public static Deck card13 = new Deck(12,"copas","10",Window.imageIcon12);
    public static Deck card14 = new Deck(13,"paus","A",Window.imageIcon13);
    public static Deck card15 = new Deck(14,"paus","Q",Window.imageIcon14);
    public static Deck card16 = new Deck(15,"paus","K",Window.imageIcon15);
    public static Deck card17 = new Deck(16,"paus","J",Window.imageIcon16);
    public static Deck card18 = new Deck(17,"paus","2",Window.imageIcon17);
    public static Deck card19 = new Deck(18,"paus","3",Window.imageIcon18);
    public static Deck card20 = new Deck(19,"paus","4",Window.imageIcon19);
    public static Deck card21 = new Deck(20,"paus","5",Window.imageIcon20);
    public static Deck card22 = new Deck(21,"paus","6",Window.imageIcon21);
    public static Deck card23 = new Deck(22,"paus","7",Window.imageIcon22);
    public static Deck card24 = new Deck(23,"paus","8",Window.imageIcon23);
    public static Deck card25 = new Deck(24,"paus","9",Window.imageIcon24);
    public static Deck card26 = new Deck(25,"paus","10",Window.imageIcon25);
    public static Deck card27 = new Deck(26,"ouros","A",Window.imageIcon26);
    public static Deck card28 = new Deck(27,"ouros","Q",Window.imageIcon27);
    public static Deck card29 = new Deck(28,"ouros","K",Window.imageIcon28);
    public static Deck card30 = new Deck(29,"ouros","J",Window.imageIcon29);
    public static Deck card31 = new Deck(30,"ouros","2",Window.imageIcon30);
    public static Deck card32 = new Deck(31,"ouros","3",Window.imageIcon31);
    public static Deck card33 = new Deck(32,"ouros","4",Window.imageIcon32);
    public static Deck card34 = new Deck(33,"ouros","5",Window.imageIcon33);
    public static Deck card35 = new Deck(34,"ouros","6",Window.imageIcon34);
    public static Deck card36 = new Deck(35,"ouros","7",Window.imageIcon35);
    public static Deck card37 = new Deck(36,"ouros","8",Window.imageIcon36);
    public static Deck card38 = new Deck(37,"ouros","9",Window.imageIcon37);
    public static Deck card39 = new Deck(38,"ouros","10",Window.imageIcon38);
    public static Deck card40 = new Deck(39,"espadas","A",Window.imageIcon39);
    public static Deck card41 = new Deck(40,"espadas","Q",Window.imageIcon40);
    public static Deck card42 = new Deck(41,"espadas","K",Window.imageIcon41);
    public static Deck card43 = new Deck(42,"espadas","J",Window.imageIcon42);
    public static Deck card44 = new Deck(43,"espadas","2",Window.imageIcon43);
    public static Deck card45 = new Deck(44,"espadas","3",Window.imageIcon44);
    public static Deck card46 = new Deck(45,"espadas","4",Window.imageIcon45);
    public static Deck card47 = new Deck(46,"espadas","5",Window.imageIcon46);
    public static Deck card48 = new Deck(47,"espadas","6",Window.imageIcon47);
    public static Deck card49 = new Deck(48,"espada","7",Window.imageIcon48);
    public static Deck card50 = new Deck(49,"espada","8",Window.imageIcon49);
    public static Deck card51 = new Deck(50,"espada","9",Window.imageIcon50);
    public static Deck card52 = new Deck(51,"espada","10",Window.imageIcon51);


}
