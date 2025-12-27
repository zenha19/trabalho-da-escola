import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Cards {


    public static List<Deck> deck =new ArrayList<>(){};

    public static List<Integer> numbers=new ArrayList<>(){};
public static void shuffle()
{
    Random number1 =new Random();
    int numero =number1.nextInt(0,52);

    int numberofCards =0;


    numbers.add(numero);

    do {
        int j=0;
        Random orderofdeck = new Random();
        int random = orderofdeck.nextInt(0,52);
        for(int item : numbers) {

            if (random == item)
            {
                j++;
               break;
            }

        }

        if(j==0)
        {
            numbers.add(random);
            numberofCards++;
        }



    }while (numberofCards<51);
numberofCards=0;
int indexnumber=0;
int indexdeck=0;
    do
    {

        if(numbers.get(indexnumber) == Deck.cardslist.get(indexdeck).id)
        {
            Cards.deck.add(Deck.cardslist.get(indexdeck));
            numberofCards++;
            indexnumber++;
            Deck.cardslist.remove(indexdeck);
            indexdeck=0;
        }
        else
        {
            indexdeck++;
        }


    }while (numberofCards <52);


}

    public static void distribute()
    {
        for(int i=0; i<7;i++){ int numberofcards=Cards.deck.size() -1;

            Player.player1.playerdeck.add(Cards.deck.get(numberofcards));

            Cards.deck.remove(numberofcards);

            numberofcards=Cards.deck.size() -1;

            Player.player2.playerdeck.add(Cards.deck.get(numberofcards));

            Cards.deck.remove(numberofcards);


        }



    }
    public Cards() {

        deck = new ArrayList<>();
    }
}