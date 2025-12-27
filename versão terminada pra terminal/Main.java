//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() {
    IO.println("nome do jogador 1?");
   Player.player1.name= IO.readln();
if (Objects.equals(Player.player1.name, ""))
{
    Player.player1.name="nada";
}
IO.println("nome do jogador 2?");
    Player.player2.name= IO.readln();
    if (Objects.equals(Player.player2.name, ""))
    {
        Player.player2.name="nada";

    }
    if (Objects.equals(Player.player1.name, Player.player2.name))
    {
        Player.player2.name += "2";
    }
    Cards.shuffle();
    Cards.distribute();
    Turn.numberOfpeixinhosPlayer1();
    Turn.numberOfpeixinhosPlayer2();
    Turn.turns();
}
