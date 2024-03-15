public class Exam2 {
    public static void main(String[] args) {

        // 높이 : 3
        printStars(3);

        /*

           *
          ***
         *****

         */

        // 높이 : 5
        printStars(5);
        // 출력

        /*

             *
            ***
           *****
          *******
         *********

         */

        // 높이 : 7
        printStars(7);
        // 출력

        /*

               *
              ***
             *****
            *******
           *********
          ***********
         *************

         */

    }

    public static void printStars(int height) {
        for (int i = 0; i < height; i++) {
            String space = "\s";
            String star = "*";
            System.out.println(space.repeat(height - i - 1) + star.repeat(i * 2 + 1));
        }
    }
}