public class ArrayDemo {

    public static void main(String[] args) {
        
        // pokemon
        // you can have a team of 6, index is max of 5

        // Pokemon[] team = new Pokemon[6];
        // {0, 1, 2, 3, 4, 5} ordered list

        // team[3] = new pokemon("Charizard");
        // {8, 1, 2, "charizard", 4, 5}

        // this code created a list of size 6, so the max index is 5

        // Pokemon[] box = new Pokemon[30];

        // Pokemon[] box2 = new Pokemon[1000]

        int[] myFavoriteNumbers = new int[4];
        myFavoriteNumbers[0] = 7;
        myFavoriteNumbers[1] = 8;
        myFavoriteNumbers[2] = 13;
        myFavoriteNumbers[3] = 5;

        // {7, 8, 13, 5}

        myFavoriteNumbers[0] = 6;
        
        // {6, 8, 13, 5}

        System.out.println(myFavoriteNumbers[3]);

        for (int i = 0; i < myFavoriteNumbers.length; i++) {
            System.out.println(myFavoriteNumbers[i]);
        }

        // print out the entire list using a for loop

        System.out.println(myFavoriteNumbers.length);

        // what id i actually have 5 favorite numbers

        // list sizes are imutable <- cant change it without creating a new object
        // String are a list (array) of characters! They are also immutable.
        // {'h', ,'e', 'l', 'l', 'o'}


        // String[] beatles = new String[4];
        // beatles[0] = "John Lennon";
        // beatles[1] = "Paul McCarney";

        String[] beatles = { "John Lennon", "Paul McCartney", "Ringo Starr", null};

        // challenge: update the beatles list to include you as the fifth beatle

        for (int i =0; i < beatles.length; i++) {
            if (beatles[i] != null) {
                System.out.println(beatles[i].length());
            } else {
                System.out.println("This element is null");
            }
        }

        int[] number = new int[3];
        // {0, 0, 0}

        boolean[] trust = new boolean[3];

        Strin

        // System.out.println(args.length)

    }
}