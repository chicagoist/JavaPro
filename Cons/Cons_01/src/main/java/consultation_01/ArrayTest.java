package consultation_01;

public class ArrayTest {
  public static void main(String[] args) {

    // Variant 1
    int[] numbers = new int[5];

    // Variant 2

    // Двумерный
    int[][] numbers2D = new int[4][5];

    int[][] numbers2Da = new int[7][];

    numbers2Da[0] = new int[3];
    numbers2Da[1] = new int[6];
    numbers2Da[2] = new int[9];

    int[][] numbers2Db = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    for (int[] innerArray : numbers2Db) {

      for (int element : innerArray) {
        System.out.print(element + " ");
      }
      System.out.println();
    }
  }
}
