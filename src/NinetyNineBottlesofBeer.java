public class NinetyNineBottlesofBeer {

    public static void main (String[] args) {

    for (int i = 1; i < 3; i++) {
        int beerNum = 99;
        String word = "bottles";

            while (beerNum > 0) {
                if (beerNum == 1) {
                    word = "bottle";
                }

                System.out.println(beerNum + " " + word + " of beer on the wall");
                System.out.println(beerNum + " " + word + " of beer");
                System.out.println("Take one down.");
                System.out.println("Pass it around.");


                if (beerNum > 1) {
                    System.out.println(beerNum + " " + word + " of beer on the wall.\n");
                } else {
                    System.out.println("No more bottles of beer on the wall.\n");
                    System.out.println("No more bottles of beer on the wall.");
                    System.out.println("No more bottles of beer.");
                    System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.\n\n");
                    System.out.println("-------------------\n\n");
                }

                beerNum = beerNum - 1;
            }
        }
    }
}

