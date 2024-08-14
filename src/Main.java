//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        //Task 1
        System.out.println("Task 1");

        int[] arr1 = new int[] {1, 2, 3};
        double[] arr2 = new double[] {1.57, 7.654, 9.986};

        boolean[] arr3 = new boolean[3];
        arr3[0] = true;
        arr3[1] = false;
        arr3[2] = true;

        //Task 2
        System.out.println("Task 2");

        for (int i = 0; i < arr1.length ; i++) {
            if (i < arr1.length - 1) {
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.print(arr1[i]);
            }
        }
        System.out.println();


        for (int i = 0; i < arr2.length ; i++) {
            if (i < arr2.length - 1) {
                System.out.print(arr2[i] + ", ");
            } else {
                System.out.print(arr2[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < arr3.length ; i++) {
            if (i < arr3.length - 1) {
                System.out.print(arr3[i] + ", ");
            } else {
                System.out.print(arr3[i]);
            }
        }
        System.out.println();


        //Task3
        System.out.println("Task3");

        for (int i = arr1.length - 1 ; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.print(arr1[i]);
            }
        }
        System.out.println();

        for (int i = arr2.length - 1 ; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr2[i] + ", ");
            } else {
                System.out.print(arr2[i]);
            }
        }
        System.out.println();

        for (int i = arr3.length - 1 ; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr3[i] + ", ");
            } else {
                System.out.print(arr3[i]);
            }
        }
        System.out.println();

        //Task4
        System.out.println("Task 4");

        for (int i = 0; i < arr1.length ; i++) {
            if (arr1[i] % 2 == 1 ) {
                ++arr1[i];
            }
            System.out.print(arr1[i] + " ");

        }

    }
}