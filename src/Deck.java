import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    public static ArrayList mCardList=new ArrayList();
    Rank[] ranks = Rank.values;
    Suit[] suites = Suit.values;

            public  Deck() {
                for (int i = 0; i < suites.length; i++) {
                    for (int j = 0; j < ranks.length; j++) {
                        Card card = new Card(ranks[j], suites[i]);
                        mCardList.add(card);
                        //System.out.println(card.getSuit().getName() + " " + card.getRank().getName());
                    }
                }
            }

        //Перемішує колоду у випадковому порядку
        public void shuffle() {
            System.out.println("Перемешанный:");
            Collections.shuffle(mCardList);
            for(int x=0;x<mCardList.size();x++) {
                Card card = (Card) mCardList.get(x);
                //System.out.println(card.getSuit().getName() + " " + card.getRank().getName());
            }
        }



//        /* * Впорядкування колоди за мастями та значеннями
//        * Порядок сотрування:
//        * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
//        * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
//        * Наприклад
//        * HEARTS Ace
//        * HEARTS King
//        * HEARTS Queen
//        * HEARTS Jack
//        * HEARTS 10
//        * HEARTS 9
//        * HEARTS 8
//        * HEARTS 7
//        * HEARTS 6
//        * І так далі для DIAMONDS, CLUBS, SPADES */
        public void order() {
                Deck deck=new Deck();


        }
//
//
//        }
//
//        //Повертає true у випадку коли в колоді ще доступні карти
        public boolean hasNext() {
             if(mCardList.size()>0)
                 return true;
             else
            return false;
        }

//        }
//
//        //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
//        //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
//        //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
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

