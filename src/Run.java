/**
 * Created by User on 170313.
 */
    public class Run {
    public static void main(String[] args) {
        Deck deck=new Deck();

        Card card=deck.drawOne();
        System.out.println(card.getSuit().getName() + " " + card.getRank().getName());
        Card card2=deck.drawOne();
        System.out.println(card2.getSuit().getName() + " " + card2.getRank().getName());
        Card card3=deck.drawOne();
        System.out.println(card3.getSuit().getName() + " " + card3.getRank().getName());




    }

    }

