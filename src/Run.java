import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by User on 170313.
 */
    public class Run {
  public static ArrayList mCardList=new ArrayList();
    public static void main(String[] args) {
        mCardList = new ArrayList<>();
        Rank[] ranks = Rank.values;
        Suit[] suites = Suit.values;

        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suites.length; j++) {
                Card card = new Card(ranks[i], suites[j]);
                mCardList.add(card);
                System.out.println(card.getSuit().getName() + " " + card.getRank().getName());
            }
        }

        Collections.shuffle(mCardList, new Random(mCardList.size()));
        Card card= (Card) mCardList.get(3);
        System.out.println(card.getSuit().getName() + " " + card.getRank().getName());





    }

    }

