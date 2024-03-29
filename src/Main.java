public class Main {
    public static void main(String[] args) {
        //verticalZigZag(12);
        //hollowDiamondPyramid(6);
        hourglass09(9);
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
        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            for (int space = 1; space <= number - row; space++) {
                System.out.print("  ");
            }
            for (int space = 1; space <= number - row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= number; row++) {
            for (int col = number - row; col >= 0; col--) {
                System.out.print("* ");
            }
            for (int space = 1; space <= row - 1; space++) {
                System.out.print("  ");
            }
            for (int space = 1; space <= row - 1; space++) {
                System.out.print("  ");
            }
            for (int col = number - row; col >= 0; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowTrianglePattern(int number) {
        for (int row = 1; row <= number; row++) {
            for (int spaces = 1; spaces <= number - row; spaces++) {
                System.out.print(" ");
            }
            int totalColumns = (2 * row) - 1;
            for (int col = 1; col <= totalColumns; col++) {
                if (col == 1 || row == number || col == (2 * row) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    public static void reverseHollowTriangle(int number) {
        for (int row = number; row >= 1; row--) {
            int totalSpace = row + 1;
            for (int space = row; space <= number; space++) {
                System.out.print(" ");
            }
            int totalColumns = 2 * row - 1;
            for (int col = 1; col <= totalColumns; col++) {
                if (col == 1 || col == totalColumns || row == number) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");

        }

    }

    public static void KPattern(int number) {
        for (int row = 1; row <= number; row++) {
            int totalColumns = (number + 1) - row;
            for (int col = 1; col <= totalColumns; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 1; row < number; row++) {

            for (int col = 1; col <= row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightPascalTriangle(int number) {
        int increment = 1;
        for (int row = 1; row <= (number * 2) - 1; row++) {
            if (row <= number) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            } else {

                int totalColumns = number - increment;
                for (int col = 1; col <= totalColumns; col++) {
                    System.out.print("* ");
                }
                increment++;
            }
            System.out.println();
        }
    }

    public static void hourGlassPattern(int number) {
        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" ");
            }
            for (int starColumn = number - row; starColumn >= 0; starColumn--) {
                System.out.print("* ");


            }
            System.out.println();
        }
        for (int row = 1; row <= number - 1; row++) {
            for (int col = number - row - 1; col >= 0; col--) {
                System.out.print(" ");
            }
            for (int starColumn = 1; starColumn <= row + 1; starColumn++) {
                System.out.print("* ");


            }
            System.out.println();
        }

    }

    public static void verticalZigZag(int number) {
        for (int row = 1; row <= number; row++) {

            for (int col = 1; col <= 3; col++) {
                if (row % col == 0 && col == 2) {
                    System.out.print("*");
                } else if (row % 4 == 1 && col == 1) {
                    System.out.print("*");

                } else if (row % 4 == 3 && col == 3) {
                    System.out.print("*");

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

    }

    public static void hour(int number){
        for(int row=1;row<=number;row++){
            for(int col=1;col<=row;col++){
                System.out.print(" ");
            }
            for (int starColumn = number - row; starColumn >= 0; starColumn--) {
                System.out.print("* ");


            }
            System.out.println();

        }
        for(int row=1;row<=number-1;row++){
            for (int col=1;col<=number-row;col++){
                System.out.print(" ");
            }
            for(int star=1;star<=row+1;star++){
                System.out.print("* ");
            }

            System.out.println();
        }


    }
    public static void hollowDiamondPyramid(int number){
        for(int row=1;row<=number;row++){
            for(int col=1; col<=number-row;col++){
                System.out.print(" ");
            }
            for(int star=1;star<=row;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=1;row<=number;row++){
            for(int col=1; col<=row;col++){
                System.out.print(" ");
            }
            for(int star=1;star<=number-row;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hourglass09(int number){
        int counter=9;
        int totalElements=0;
        int dummyNumber=number;
        for(int i=number;i>=0;i--){
            totalElements+=dummyNumber;
            dummyNumber--;
        }
        totalElements=(2*totalElements)-1;

        int print=1;
        for(int row=1;row<=number;row++){
            int col;
            for (col=1;col<=row;col++){
                System.out.print(" ");

            }
            for(int pattern=number;pattern>=row;pattern--){

                if(print>9){
                    if(print%2==0){
                        System.out.print(" 0");
                        print++;


                    }else {
                        System.out.print(" 9");
                        print++;
                    }

                }else{
                    System.out.print( " "+print);
                    print++;
                }
            }
            System.out.println();
        }
        for(int row=1;row<=number-1;row++){
            int col;
            for (col=1;col<=number-row;col++){
                System.out.print(" ");

            }
            for(int pattern=1;pattern<=row+1;pattern++){

                if(print<=totalElements-9){
                    if(print%2==0){
                        System.out.print(" 0");
                        print++;


                    }else {
                        System.out.print(" 9");
                        print++;
                    }

                }else{

                    System.out.print( " "+counter);
                    counter--;
                }
            }
            System.out.println();
        }
    }
}


