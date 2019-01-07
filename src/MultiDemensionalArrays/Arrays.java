package MultiDemensionalArrays;

public class Arrays {

    public static void main(String[] args) {

        // first an example of a single dimension array
        int[] values = {3, 5, 12, 345};

        System.out.println(values[3]);
        // this will print 345


        // now a multidimensional array
        int[][] grid = {
                {3, 5, 12, 345},
                {2, 4},
                {6, 10, 30, 40}
        };
        // a multi-dimensional array is basically an array of arrays
        // for instance the int 30 is located in 2,2 or [2][2] - row first then column
        System.out.println(grid[2][2]);

        // one way to iterate through MD array
        for (int row = 0; row < grid.length; row ++){

            for (int col = 0; col < grid[row].length; col ++){

                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }
    }


}
