import java.util.ArrayList;
import java.util.List;

public class Player {
String name="";
int peixinhos;
    public  List<Deck> playerdeck;

public static Player player1 =new Player();
public static Player player2 =new Player();




    public Player()
    {
        playerdeck = new ArrayList<>();
    }
}
