import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    public static ArrayList mCardList=new ArrayList();
    Rank[] ranks = Rank.values;
    Suit[] suites = Suit.values;

            public  Deck() {
                for (int i = 5; i < suites.length; i++) {
                    for (int j = 0; j < ranks.length; j++) {
                        Card card = new Card(ranks[j], suites[i]);
                        mCardList.add(card);
                        //System.out.println(card.getSuit().getName() + " " + card.getRank().getName());
                    }
                }
            }

            public void shuffle() {
            System.out.println("Перемешанный:");
            Collections.shuffle(mCardList);
//            for(int x=0;x<mCardList.size();x++) {
//                Card card = (Card) mCardList.get(x);
//                System.out.println(card.getSuit().getName() + " " + card.getRank().getName());
            //}
        }


        public void order() {
                Deck deck=new Deck();


        }

        public boolean hasNext() {
             if(mCardList.size()>0)
                 return true;
             else
            return false;
        }


       public Card drawOne() {
                if (mCardList.size()==0)
                    return null;
                else
                    {
                    int indexsize=mCardList.size();
                    Card card= (Card) mCardList.get(indexsize-1);
                    mCardList.remove(indexsize-1);
                    return card;
                    }
            }
    }

