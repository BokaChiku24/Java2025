package basics.loops.dowhileloop;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        boolean isFlag = false;
        do {
            if(i <= 10) {
                i++;
            }
            System.out.println(STR."This line is going to be printed at least once, even if the condition is false");
        } while (isFlag);
    }
}
