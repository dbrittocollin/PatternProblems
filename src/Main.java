public class Main {
    public static void main(String[] args) {
        hourGlassPattern(6);
    }

    public static void ReverseRightPyramid(int number) {
        for (int row = 1; row <= number; row++) {
            //for columns
            for (int col = 1; col <= number + 1 - row; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public static void reverseLeftHalfPyramid(int number) {
        for (int row = 1; row <= number; row++) {
            //for columns
            int totalCols = number - row;
            int totalSpaces = number - totalCols;
            for (int space = 1; space <= totalSpaces; space++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= totalCols + 1; col++) {

                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public static void rhombusPattern(int number) {
        for (int row = 1; row <= number; row++) {
            //for columns
            int totalCols = number - row;
            int totalSpaces = number - totalCols;
            for (int space = 1; space <= totalSpaces; space++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= number; col++) {

                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public static void squareFillPattern(int number) {
        for (int row = 1; row <= number; row++) {
            //for columns
//            int totalCols=number-row;
//            int totalSpaces=number-totalCols;
//            for (int space=1;space<=totalSpaces;space++){
//                System.out.print("  ");
//            }

            for (int col = 1; col <= number; col++) {

                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void pyramidPattern(int number) {
        for (int row = 1; row <= number; row++) {
            //for columns
            //int totalCols=number-row;
            int totalSpaces = number - row;
            for (int space = 1; space <= totalSpaces; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {

                System.out.print(" *");

            }
            System.out.println();
        }
    }

    public static void diamondStar(int number) {
        for (int row = 1; row <= 2 * number; row++) {
            //for columns
            int totalCols = row > number ? 2 * number - row : row;
            int totalSpaces = number - totalCols;
            for (int space = 1; space <= totalSpaces; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalCols; col++) {

                System.out.print(" *");

            }
            System.out.println();
        }


    }

    public static void butterflyPattern(int number) {
        for(int row=1;row<=number;row++){
            for (int col=1;col<=row;col++){
                System.out.print("* ");
            }
            for (int space=1;space<=number-row;space++){
                System.out.print("  ");
            }
            for (int space=1;space<=number-row;space++){
                System.out.print("  ");
            }
            for (int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=1;row<=number;row++){
            for (int col=number-row;col>=0;col--){
                System.out.print("* ");
            }
            for (int space=1;space<=row-1;space++){
                System.out.print("  ");
            }
            for (int space=1;space<=row-1;space++){
                System.out.print("  ");
            }
            for (int col=number-row;col>=0;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void hollowTrianglePattern(int number){
        for (int row=1;row<=number;row++){
                for(int spaces=1;spaces<=number-row;spaces++){
                    System.out.print(" ");
                }
                int totalColumns=(2*row)-1;
                for(int col=1;col<=totalColumns;col++) {
                    if (col == 1 || row == number || col == (2 * row) - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.println();
                }
        }
    }
    public static void reverseHollowTriangle(int number){
        for (int row=number;row>=1;row--){
            int totalSpace=row+1;
            for(int space=row;space<=number;space++){
                System.out.print(" ");
            }
            int totalColumns=2*row-1;
            for (int col=1;col<=totalColumns;col++){
                if(col==1||col==totalColumns||row==number){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");

        }

    }
    public static void KPattern(int number){
        for(int row=1;row<=number;row++){
            int totalColumns=(number+1)-row;
            for(int col=1;col<=totalColumns;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=1;row<number;row++){

            for(int col=1;col<=row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void rightPascalTriangle(int number){
        int increment=1;
        for(int row=1;row<=(number*2)-1;row++){
            if(row<=number){
                for (int col=1;col<=row;col++){
                    System.out.print("* ");
                }
            }else {

                int totalColumns=number-increment;
                for (int col=1;col<=totalColumns;col++){
                    System.out.print("* ");
                }
                increment++;
            }
            System.out.println();
        }
    }

    public static void hourGlassPattern(int number){
        for(int row=1;row<=number;row++){
            for (int col=1;col<=row;col++){
                System.out.print(" ");
            }
            for(int starColumn=number-row;starColumn>=0;starColumn--){
                System.out.print("* ");


            }
            System.out.println();
        }
        for(int row=1;row<=number-1;row++){
            for (int col=number-row-1;col>=0;col--){
                System.out.print(" ");
            }
            for(int starColumn=1;starColumn<=row+1;starColumn++){
                System.out.print("* ");


            }
            System.out.println();
        }

    }


}