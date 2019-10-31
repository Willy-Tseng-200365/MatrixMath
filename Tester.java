import java.util.Scanner;
//find the rowSum, rowAvg, columnSum, columnAvg;




public class Tester{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input total row : ");
        int row = sc.nextInt();
        System.out.print("Input total column : ");
        int column = sc.nextInt();

        int [][] matrix = new int[row][column];
         for (int i = 0; i < row; i++)
         {
            for(int j = 0; j < column; j++) {
            System.out.println("Row ["+i+"]:  Column "+j+" :");
            matrix[i][j] = sc.nextInt(); 
            }

         }
         String result="";
         for (int i = 0; i < row; i++) {
             result=result+"Data Array "+i+" :";
             for (int j = 0; j < column; j++) {
                System.out.println("Row [" + i + "]:  Column " + j + " :");
                matrix[i][j] = sc.nextInt();
                result=result+matrix[i][j]+", ";

            }

            }
            System.out.println(result);

    }

}
