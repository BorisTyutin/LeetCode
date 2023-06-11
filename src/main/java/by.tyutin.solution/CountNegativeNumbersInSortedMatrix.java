package by.tyutin.solution;

public class CountNegativeNumbersInSortedMatrix {

    public static void main(String[] args) {
        CountNegativeNumbersInSortedMatrix counter = new CountNegativeNumbersInSortedMatrix();
        System.out.println(counter.countNegatives(new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}}));
        System.out.println(counter.countNegatives(new int[][]{{3,2},{1,0}}));
    }

    public int countNegatives(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int countOfNegativeNumbers = grid.length * grid[0].length;
        int rowNumber = 0;
        int columnNUmber = grid[0].length - 1;
        int currentValue;
        while (rowNumber < grid.length && columnNUmber >= 0) {
            currentValue = grid[rowNumber][columnNUmber];
            if (currentValue >= 0) {
                countOfNegativeNumbers = countOfNegativeNumbers - (columnNUmber + 1);
                rowNumber++;
            } else if (columnNUmber > 0) {
                columnNUmber--;
            } else {
                break;
            }
        }
        return countOfNegativeNumbers;
    }

}
