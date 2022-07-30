package test01;

public class TaskArray04 {
    public static void main(String[] args) {
        String[][] xyArray = new String[5][9];
        for (int i = 0; i < xyArray.length; i++) {
            for (int a = 0; a < xyArray[i].length; a++) {
//                if (i == 0 && a == 4) {
//                    System.out.print("*");
//                } else {
//                    if((i != 0 && a > 4-i && a < 4+i)) {
//                    if ((i != 0 && a > xyArray[i].length / 2 - i - 1 && a <= xyArray[i].length / 2 + i)) {
                    if ((a > xyArray[i].length / 2 - i - 1 && a <= xyArray[i].length / 2 + i)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
//                }
            }
            System.out.println();
        }
    }
}

