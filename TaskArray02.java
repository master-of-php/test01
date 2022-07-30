package test01;

public class TaskArray02 {
    public static void main(String[] args) {
        String[][] xyArray= new String[8][8];
        for (int i = 0; i < xyArray.length; i++) {
            for (int a = 0; a < xyArray[i].length; a++) {
//                if((i != 0 && a != 0) && ( i != xyArray.length - 1 && a != xyArray.length - 1)){
//                    System.out.print(" ");
//                } else {
//                    System.out.print("*");
//                }
                if (i == 0 || i == xyArray.length - 1) {
                    System.out.print("*");
                } else {
                    if (a == 0 || a == xyArray.length - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }


            }
            System.out.println();
        }
    }
}
