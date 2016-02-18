package GUIVersion;

import java.util.Arrays;

/**
 * Created by pedrosilva on 1/28/16.
 */
public class CardHandler {

    public static CardHandler CH = new CardHandler();

    public static void main(String[] args){

    CH.Suffle(CH.Deck());

        System.out.println(Arrays.toString(CH.Suffle(CH.Deck())));

    }

    //--Creates a Deck with 4 sets of 13 cards--
    private int[] Deck(){

        int[] deck = new int[52];

        int cardCt = 0;

        for (int suit = 0;suit<= 3; suit++){

            for (int cardN = 0; cardN <=12; cardN++){

                deck[cardCt] = cardN + 1;
                cardCt++;

            }

        }

        return deck;

    }

    //--Shuffles the Deck--
    private int[] Suffle(int[] deck){

        int[] Deck = new int[52];

        for (int i = 0; i <= 51; i++){

            int j = (int) Math.round(Math.floor(Math.random() * (i + 1)));
            int temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;

        }

        Deck = deck;

        return Deck;

    }

}
