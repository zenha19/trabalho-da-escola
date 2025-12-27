

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Window {
String imagepath;
    public Window(String imagepath) {
    this.imagepath=imagepath;
    }
   public static ImageIcon imageIcon = new ImageIcon("src/img/A-copas.png");
   public static ImageIcon imageIcon1 = new ImageIcon("src/img/Q-copas.png");
   public static ImageIcon imageIcon2 = new ImageIcon("src/img/K-copas.png");
   public static ImageIcon imageIcon3 = new ImageIcon("src/img/J-copas.png");
   public static ImageIcon imageIcon4 = new ImageIcon("src/img/2-copas.png");
   public static ImageIcon imageIcon5 = new ImageIcon("src/img/3-copas.png");
   public static ImageIcon imageIcon6 = new ImageIcon("src/img/4-copas.png");
   public static ImageIcon imageIcon7 = new ImageIcon("src/img/5-copas.png");
   public static ImageIcon imageIcon8 = new ImageIcon("src/img/6-copas.png");
   public static ImageIcon imageIcon9 = new ImageIcon("src/img/7-copas.png");
   public static ImageIcon imageIcon10 = new ImageIcon("src/img/8-copas.png");
   public static ImageIcon imageIcon11 = new ImageIcon("src/img/9-copas.png");
   public static ImageIcon imageIcon12 = new ImageIcon("src/img/10-copas.png");
   public static ImageIcon imageIcon13 = new ImageIcon("src/img/A-paus.png");
   public static ImageIcon imageIcon14 = new ImageIcon("src/img/Q-paus.png");
   public static ImageIcon imageIcon15 = new ImageIcon("src/img/K-paus.png");
   public static ImageIcon imageIcon16 = new ImageIcon("src/img/J-paus.png");
   public static ImageIcon imageIcon17 = new ImageIcon("src/img/2-paus.png");
   public static ImageIcon imageIcon18 = new ImageIcon("src/img/3-paus.png");
   public static ImageIcon imageIcon19 = new ImageIcon("src/img/4-paus.png");
   public static ImageIcon imageIcon20 = new ImageIcon("src/img/5-paus.png");
   public static ImageIcon imageIcon21 = new ImageIcon("src/img/6-paus.png");
   public static ImageIcon imageIcon22 = new ImageIcon("src/img/7-paus.png");
   public static ImageIcon imageIcon23 = new ImageIcon("src/img/8-paus.png");
   public static ImageIcon imageIcon24 = new ImageIcon("src/img/9-paus.png");
   public static ImageIcon imageIcon25 = new ImageIcon("src/img/10-paus.png");
    public static ImageIcon imageIcon26 = new ImageIcon("src/img/A-ouros.png");
    public static ImageIcon imageIcon27 = new ImageIcon("src/img/Q-ouros.png");
    public static ImageIcon imageIcon28 = new ImageIcon("src/img/K-ouros.png");
    public static ImageIcon imageIcon29 = new ImageIcon("src/img/J-ouros.png");
    public static ImageIcon imageIcon30 = new ImageIcon("src/img/2-ouros.png");
    public static ImageIcon imageIcon31 = new ImageIcon("src/img/3-ouros.png");
    public static ImageIcon imageIcon32 = new ImageIcon("src/img/4-ouros.png");
    public static ImageIcon imageIcon33 = new ImageIcon("src/img/5-ouros.png");
    public static ImageIcon imageIcon34 = new ImageIcon("src/img/6-ouros.png");
    public static ImageIcon imageIcon35 = new ImageIcon("src/img/7-ouros.png");
    public static ImageIcon imageIcon36 = new ImageIcon("src/img/8-ouros.png");
    public static ImageIcon imageIcon37 = new ImageIcon("src/img/9-ouros.png");
    public static ImageIcon imageIcon38 = new ImageIcon("src/img/10-ouros.png");
    public static ImageIcon imageIcon39 = new ImageIcon("src/img/A-espadas.png");
    public static ImageIcon imageIcon40 = new ImageIcon("src/img/Q-espadas.png");
    public static ImageIcon imageIcon41 = new ImageIcon("src/img/K-espadas.png");
    public static ImageIcon imageIcon42 = new ImageIcon("src/img/J-espadas.png");
    public static ImageIcon imageIcon43 = new ImageIcon("src/img/2-espadas.png");
    public static ImageIcon imageIcon44 = new ImageIcon("src/img/3-espadas.png");
    public static ImageIcon imageIcon45 = new ImageIcon("src/img/4-espadas.png");
    public static ImageIcon imageIcon46 = new ImageIcon("src/img/5-espadas.png");
    public static ImageIcon imageIcon47 = new ImageIcon("src/img/6-espadas.png");
    public static ImageIcon imageIcon48 = new ImageIcon("src/img/7-espadas.png");
    public static ImageIcon imageIcon49 = new ImageIcon("src/img/8-espadas.png");
    public static ImageIcon imageIcon50 = new ImageIcon("src/img/9-espadas.png");
    public static ImageIcon imageIcon51 = new ImageIcon("src/img/10-espadas.png");

    public static   boolean Player1VereficationIfButonClicked=false;
    public static   boolean Player2VereficationIfButonClicked=false;

    public static JFrame window = new JFrame();
    public static JFrame namewindow = new JFrame();
    public static JFrame menu =new JFrame();

    public static void names(){

        Player2VereficationIfButonClicked = false;
        Player1VereficationIfButonClicked=false;

        JLabel Labelwriteplayer1name = new JLabel("Escreva aqui o nome do joagador 1");
        Labelwriteplayer1name.setBounds(70,300,300,50);
        Labelwriteplayer1name.setForeground(Color.WHITE);

        JLabel Labelwriteplayer2name = new JLabel("escreva aqui o nome do joagador 2");
        Labelwriteplayer2name.setBounds(70,300,300,50);
        Labelwriteplayer2name.setForeground(Color.WHITE);

        JTextArea TextAreanameplayer1 = new JTextArea();
        TextAreanameplayer1.setBounds(30,350,300,50);


        JTextArea TextAreanameplayer2 = new JTextArea();
        TextAreanameplayer2.setBounds(30,350,300,50);

        JButton buttonplayer1= new JButton("escolho este nome");
        buttonplayer1.setBounds(30,425,300,30);
        buttonplayer1.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {
               Player.player1.name= TextAreanameplayer1.getText();
               if (Objects.equals(Player.player1.name, ""))
               {
                 Player.player1.name="nada";

               }
                if (Objects.equals(Player.player2.name,Player.player1.name))
                {
                    Player.player2.name +="2";
                }
                Window.Player1VereficationIfButonClicked=true;

               if ( Player2VereficationIfButonClicked)
               {
                   TextAreanameplayer1.setText(null);
                   TextAreanameplayer2.setText(null);
                   namewindow.dispose();
                   Window.visual();
               }
            }
        });

        JButton buttonplayer2= new JButton("escolho este nome");
        buttonplayer2.setBounds(30,425,300,30);
        buttonplayer2.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {
                Player.player2.name= TextAreanameplayer2.getText();
                if (Objects.equals(Player.player2.name, ""))
                {
                    Player.player2.name="nada";

                }
                if (Objects.equals(Player.player2.name,Player.player1.name))
                {
                    Player.player2.name +="2";
                }

                Window.Player2VereficationIfButonClicked=true;

                if ( Player1VereficationIfButonClicked)
                {
                    TextAreanameplayer1.setText(null);
                    TextAreanameplayer2.setText(null);
                    namewindow.dispose();

                    Window.visual();
                }
            }
        });


        namewindow.setLayout(null);
        namewindow.setSize(750,750);

        JPanel player1 = new JPanel();
        player1.setLayout(null);
        JPanel player2 = new JPanel();
        player2.setLayout(null);

        player1.setBounds(0,0,375,750);
        player1.setBackground(Color.red);
        player1.add(TextAreanameplayer1);
        player1.add(buttonplayer1);
        player1.add(Labelwriteplayer1name);

        player2.setBounds(375,0,375,750);
        player2.setBackground(Color.blue);
        player2.add(TextAreanameplayer2);
        player2.add(buttonplayer2);
        player2.add(Labelwriteplayer2name);


        namewindow.add(player1);
        namewindow.add(player2);
        namewindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        namewindow.setVisible(true);

        namewindow.revalidate();
        namewindow.repaint();

    }

    public static JPanel cardspanel= new JPanel();
    public static JPanel buttonpanel=new JPanel();

   public static void visual(){

       cardspanel.setVisible(true);
       buttonpanel.setVisible(true);
        JFrame messagebox = new JFrame();

        messagebox.setBounds(600,300,300,100);
        messagebox.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel Labelmessage = new JLabel("Deves escolher A,Q,J,K ou um valor de 2 a 10");
        Labelmessage.setBounds(0,20,300,10);
        messagebox.add(Labelmessage);
        messagebox.setLayout(null);



        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.setSize(1500,730);

        window.add(cardspanel);
        window.add(buttonpanel);

       JTextArea textareatoreceivevalue = new JTextArea();
       textareatoreceivevalue.setBounds(600,100,300,30);

       JLabel Labelplayr1peixinhos = new JLabel("Tens "+Player.player1.peixinhos+" peixinhos");
       Labelplayr1peixinhos.setBounds(800,50,300,30);

       JLabel Labelplayr2peixinhos = new JLabel("Tens "+Player.player2.peixinhos+" peixinhos");
       Labelplayr2peixinhos.setBounds(800,50,300,30);

       JLabel Labelplayer1turn = new JLabel("Turno do "+Player.player1.name);
       Labelplayer1turn.setBounds(600,50,300,30);

       JLabel Labelplayer2turn = new JLabel("Turno do "+Player.player2.name);
       Labelplayer2turn.setBounds(600,50,300,30);

       JLabel Labelchangeofturn=new JLabel("passe para o outro jogador");
       Labelchangeofturn.setBounds(570,250,400,50);


       Labelchangeofturn.setFont(new Font("Arial",Font.PLAIN,30 ));


       JButton hide =new JButton("revelar");
       hide.setBounds(700,350,100,50);
       hide.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               window.remove(hide);
               window.remove(Labelchangeofturn);
               buttonpanel.setVisible(true);
               cardspanel.setVisible(true);
           }
       });



       JButton buttonforvalue = new JButton("Escolha A,K,Q,J ou um valor de 2 a 10");
       buttonforvalue.setBounds(600,150,300,30);
       buttonforvalue.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String value="";
             value=textareatoreceivevalue.getText();

             if (Objects.equals(value, "A") || Objects.equals(value, "Q") || Objects.equals(value, "K") || Objects.equals(value, "J") || Objects.equals(value, "1") || Objects.equals(value, "2") || Objects.equals(value, "3") || Objects.equals(value, "4") ||Objects.equals(value, "5") || Objects.equals(value, "6") || Objects.equals(value, "7") || Objects.equals(value, "8") || Objects.equals(value, "9") || Objects.equals(value, "10"))
             {
                 if (Turn.player1turn)
                 {Turn.turnplayer1(value);
                     if (Turn.player1turn) {
                         Turn.winner();
                         if (Turn.didsomeondewin)
                         {
                             return;
                         }
                         cardspanel.removeAll();

                         for (int i = Player.player1.playerdeck.size() - 1; i >= 0; i--) {
                             JLabel cards = new JLabel();
                             cards.setIcon((Icon) Player.player1.playerdeck.get(i).cardimage);
                             cardspanel.add(cards);

                         }

                         cardspanel.revalidate();
                         cardspanel.repaint();
                         textareatoreceivevalue.setText("");
                         buttonpanel.remove(Labelplayr2peixinhos);
                         Labelplayr1peixinhos.setText("Tens "+Player.player1.peixinhos+" peixinhos");
                         buttonpanel.add(Labelplayr1peixinhos);
                         buttonpanel.revalidate();
                         buttonpanel.repaint();





                     }
                     else
                     {
                         Turn.winner();
                         if (Turn.didsomeondewin)
                         {
                             return;
                         }
                         cardspanel.removeAll();

                         for(int i=Player.player2.playerdeck.size()-1; i>=0;i--)
                         {
                             JLabel cards=new JLabel();
                             cards.setIcon((Icon) Player.player2.playerdeck.get(i).cardimage);
                             cardspanel.add(cards);

                         }
                         cardspanel.revalidate();
                         cardspanel.repaint();


                         buttonpanel.remove(Labelplayer1turn);
                         buttonpanel.add(Labelplayer2turn);
                         buttonpanel.remove(Labelplayr1peixinhos);
                         Labelplayr2peixinhos.setText("Tens "+Player.player2.peixinhos+" peixinhos");
                         buttonpanel.add(Labelplayr2peixinhos);
                         textareatoreceivevalue.setText("");
                         buttonpanel.revalidate();
                         buttonpanel.repaint();
                         buttonpanel.setVisible(false);
                         cardspanel.setVisible(false);
                         window.add(Labelchangeofturn);
                         window.add(hide);
                     }

                 }
                 else
                 {

                     Turn.turnplayer2(value);
                     if (!Turn.player1turn) {
                         Turn.winner();
                         if (Turn.didsomeondewin)
                         {
                             return;
                         }
                         cardspanel.removeAll();

                         for (int i = Player.player2.playerdeck.size() - 1; i >= 0; i--) {
                             JLabel cards = new JLabel();
                             cards.setIcon((Icon) Player.player2.playerdeck.get(i).cardimage);
                             cardspanel.add(cards);

                         }
                         cardspanel.revalidate();
                         cardspanel.repaint();
                         textareatoreceivevalue.setText("");
                         buttonpanel.remove(Labelplayr1peixinhos);
                         Labelplayr2peixinhos.setText("Tens "+Player.player2.peixinhos+" peixinhos");
                         buttonpanel.add(Labelplayr2peixinhos);
                         buttonpanel.revalidate();
                         buttonpanel.repaint();

                     }
                     else{
                         Turn.winner();
                         if (Turn.didsomeondewin)
                         {
                             return;
                         }
                         cardspanel.removeAll();

                         for (int i = Player.player1.playerdeck.size() - 1; i >= 0; i--) {
                             JLabel cards = new JLabel();
                             cards.setIcon((Icon) Player.player1.playerdeck.get(i).cardimage);
                             cardspanel.add(cards);

                         }
                         cardspanel.revalidate();
                         cardspanel.repaint();


                         buttonpanel.remove(Labelplayer2turn);
                         buttonpanel.add(Labelplayer1turn);
                         buttonpanel.remove(Labelplayr2peixinhos);
                         Labelplayr1peixinhos.setText("Tens "+Player.player1.peixinhos+" peixinhos");
                         buttonpanel.add(Labelplayr1peixinhos);
                         textareatoreceivevalue.setText("");
                         buttonpanel.revalidate();
                         buttonpanel.repaint();
                         buttonpanel.setVisible(false);
                         cardspanel.setVisible(false);
                         window.add(Labelchangeofturn);
                         window.add(hide);
                     }

                 }

             }
             else{

                 messagebox.setVisible(true);
             }
           }
       });




       buttonpanel.setLayout(null);

        buttonpanel.setBounds(0,500,1500,200);
        buttonpanel.setBackground(Color.gray);
        buttonpanel.add(buttonforvalue);
        buttonpanel.add(textareatoreceivevalue);
        buttonpanel.add(Labelplayer1turn);
        buttonpanel.add(Labelplayr1peixinhos);




        cardspanel.setBounds(0,0,1500,550);
        cardspanel.setBackground(Color.green);

       for(int i=Player.player1.playerdeck.size()-1; i>=0;i--)
       {
          JLabel cards=new JLabel();
          cards.setIcon((Icon) Player.player1.playerdeck.get(i).cardimage);
          cardspanel.add(cards);

       }


        window.setVisible(true);




   }

public static void menu()
{

    menu.setLayout(null);
    menu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    menu.setSize(750,750);

    JPanel mainmenu=new JPanel();

    JPanel rules = new JPanel();
    rules.setBounds(0,0,750,750);
    rules.setLayout(null);
    rules.setVisible(false);

    mainmenu.setLayout(null);
    mainmenu.setBounds(0,0,750,750);

    JLabel Labelrules = new JLabel("Cada jogador começa com 7 cartas. E a partir daí vão pedindo cartas. se o outro jogador ");
    Labelrules.setBounds(100,180,500,50);

    JLabel Labelrules1 = new JLabel("tiver a carta que pediste podes jogar novamente, caso contrario recebes uma carta do");
    Labelrules1.setBounds(100,200,500,50);

    JLabel Labelrules2 = new JLabel("baralho. E caso a carta que recebeste seja a que pediste, podes jogar novamente");
    Labelrules2.setBounds(100,220,500,50);

    JLabel Labelrules3 = new JLabel("Caso contrario aparecera uma tela com um botão revelar, demostrando que é o turno do");
    Labelrules3.setBounds(100,240,500,50);

    JLabel Labelrules4 = new JLabel("outro jogador. O objetivo é ser o primeiro a fazer 7 peixinhos um peixinho é um conjunto ");
    Labelrules4.setBounds(100,260,500,50);

    JLabel Labelrules5 = new JLabel("de cartas com valores iguais");
    Labelrules5.setBounds(100,280,500,50);

    JLabel title = new JLabel("Peixinho");
    title.setBounds(300,0,300,50);
    title.setFont(new Font("Arial",Font.BOLD,40));

    JLabel Labelruletitle = new JLabel("Regras");
    Labelruletitle.setBounds(305,150,200,50);
    Labelruletitle.setFont(new Font("Arial",Font.PLAIN,30));

    JLabel Labelmenu=new JLabel("Menu");
    Labelmenu.setBounds(335,300,200,50);
    Labelmenu.setFont(new Font("Arial",Font.PLAIN,30));

    JButton start=new JButton("começar o jogo");
    start.setBounds(300,350,150,20);
    start.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Window.menu.dispose();

            Window.names();
        }
    });

    JButton Buttonrules = new JButton("regras");
    Buttonrules.setBounds(300,375,150,20);
    Buttonrules.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainmenu.setVisible(false);
            rules.setVisible(true);

        }
    });

    JButton exit = new JButton("sair");
    exit.setBounds(300,400,150,20);
    exit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            menu.dispose();
        }
    });

    JButton Backtomenu =new JButton("voltar para o menu");
    Backtomenu.setBounds(260,340,200,30);
    Backtomenu.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainmenu.setVisible(true);
            rules.setVisible(false);
        }
    });

    mainmenu.add(start);
    mainmenu.add(Buttonrules);
    mainmenu.add(Labelmenu);
    mainmenu.add(exit);



    rules.add(Labelruletitle);
    rules.add(Labelrules);
    rules.add(Labelrules1);
    rules.add(Labelrules2);
    rules.add(Labelrules3);
    rules.add(Labelrules4);
    rules.add(Labelrules5);
    rules.add(Backtomenu);

    menu.add(title);
    menu.add(mainmenu);
    menu.add(rules);
    menu.setVisible(true);


}



}
