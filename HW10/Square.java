import java.util.ArrayList;
/**
* Ellie Parobek
* ISTE-120-03 
* HW 10
* The Square class tests if an array of numbers creates a magic square.
*/
public class Square{
   private ArrayList<Integer> numbers;
   private int[][] square;
   /*
   * Constructor to initilize numbers.
   */
   public Square(){
      numbers = new ArrayList<Integer>();
   }
   /*
   * Add an integer number to numbers from user input.
   * @param - i: integer to be added to numbers
   */
   public void add(int i){
      // Add i to numbers.
      numbers.add(i);
   }
   /*
   * Check if numbers is a perfect square size.
   * @return - true if perfect square, false if not perfect square
   */
   public boolean isSquare(){
      // If the size is less than 4, it cannot be a square.
      if(numbers.size() < 4){
         return false;
      }
      // Take the square root of the number as a double.
      double squareRoot = Math.sqrt(numbers.size());
      // Take the square root of the number as an integer.
      int num = (int) squareRoot;
      // If the integer square root is the same as the double square root, it is a perfect square.
      if(Math.pow(squareRoot, 2) == Math.pow(num, 2)){
         return true;
      }
      else{
         return false;
      }
   }
   /*
   * Check if each number in numbers is unique and within range.
   * @return - true if unique, false if not unique
   */
   public boolean isUnique(){
      // Create new empty integer array list.
      ArrayList<Integer> uniqueNumbers = new ArrayList<>();
      for(Integer num : numbers){
         // Add all numbers from numbers into uniqueNumbers without duplicates.
         if(!uniqueNumbers.contains(num)){
            uniqueNumbers.add(num);
         }
         // If a number is out of range, then return false.
         if(num > numbers.size()){
            return false;
         }
      }
      // If uniqueNumbers is not the same size as numbers, then there were duplicates, therefore return false.
      if(uniqueNumbers.size() != numbers.size()){
         return false;
      }
      return true;
   }
   /*
   * Check if the numbers in numbers make a magic square.
   * @return - true if magic square, false if not magi square
   */
   public boolean isMagic(){
      // Get the size of the magic square from the square root of the size of numbers.
      int size = (int)Math.sqrt(numbers.size());
      // Create 2D array square based on size.
      square = new int[size][size];
      int i = 0;
      // Create the magic square from numbers.
      for(int row = 0; row < square.length; row++){
         for(int col = 0; col < square[row].length; col++){
            square[row][col] = numbers.get(i);
            i += 1;
         }
      }
      // Set a magic number which is the sum of one of the rows to compare the rest of the rows and columns and diagonal too.
      int magicNumber = 0;
      // Create a 1D array of just one row's values.
      int[] row = square[0];
      // Magic number becomes the sum of one row.
        for(int value : row){
            magicNumber += value;  
        }
      int rowSum = 0;
      int colSum = 0;
      int diagonalSum = 0;
      // Check each row to see if the sum equals magic number.
      for(int row2 = 0; row2 < square.length; row2++){
         for(int col2 = 0; col2 < square[0].length; col2++){
            rowSum += square[row2][col2];
         }
         if(rowSum != magicNumber){
            return false;
         }
         rowSum = 0;
      }
      // Check each column to see if the sum equals magic number.
      for(int col3 = 0; col3 < square[0].length; col3++){
         for(int row3 = 0; row3 < square.length; row3++){
            colSum += square[row3][col3];
         }
         if(colSum != magicNumber){
            return false;
         }
         colSum = 0;
      }
      // Check each diagonal to see if the sum equals magic number.
      int currentRow = 0;
      int currentCol = 0;
      // The top left to bottom right diagonal sum.
      do{
         diagonalSum += square[currentRow][currentCol];
         currentRow += 1;
         currentCol += 1;
      }while(currentCol < square[0].length && currentRow < square.length);
      if(diagonalSum != magicNumber){
         return false;
      }
      diagonalSum = 0;
      currentRow = 0;
      currentCol = square.length - 1;
      // The top right to bottom left diagonal sum.
      do{
         diagonalSum += square[currentRow][currentCol];
         currentRow += 1;
         currentCol -= 1;
      }while(currentCol >= 0 && currentRow < square.length);
      if(diagonalSum != magicNumber){
         return false;
      }
      // If the method makes it to the end and never returns false, return true as it is a magic square.
      return true;
   }
}