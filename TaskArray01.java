package test01;

public class TaskArray01 {
    public static void main(String[] args) {
        String[][] xyArray= new String[8][8];
        for (int i = 0; i < xyArray.length; i++) {
            for (int a = 0; a < xyArray[i].length; a++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
