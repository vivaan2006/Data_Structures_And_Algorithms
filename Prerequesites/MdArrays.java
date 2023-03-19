package Prerequesites;

public class MdArrays {

    public static void main(String[] args) {
        //multidimensional array of strings

        String[][] cars = {
                {"lambo urus", "ferrari 458", "Bugatti Chiron"},
                {"GT3", "charger", "challenger"},
                {"GT4", "Honda", "Tesla"}};
        // nested loop to print all the cars
        //loop i checks the rows and as long as counter is less than the number of items, it goes to next loop
        // and checks the colums. (length of the i counter)

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);
            }
        }
    }
}