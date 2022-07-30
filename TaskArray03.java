package test01;

public class TaskArray03 {
    //need add main method
    public static void main(String[] args) {
        String[][] xyArray= new String[8][8];
        for (int i = 0; i < xyArray.length; i++) {
            for (int a = 0; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
