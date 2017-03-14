/**
 * Created by User on 170313.
 */
    public class Run {
    public static void main(String[] args) {
        Card card=new Card(Rank.ACE,Suit.CLUBS);
        System.out.println(card.getSuit().getName()+ " " +card.getRank().getName());
        card.setRank(Rank.TEN);
        card.setSuit(Suit.DIAMONDS);
        System.out.println(card.getSuit().getName()+ " " +card.getRank().getName());
    }

    }

