/**
 * aray
 */
public class aray {

    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0]= 100;
        marks[1]= 101;
        marks[2]= 102;
        marks[3]= 103;
        marks[4]= 104;
        // marks[5]= 100; // through error (limit exceed);

        System.out.println(marks[4]);

        // another way of declearation and memory allocation & initialization together
        int [] mark ={1,3,4,5,6,7,9};
        
        // for (int i : mark) {
        //     System.out.println(mark[i-1]);
        // }
    //    for (int i = 0; i < mark.length; i++) {
    //     System.out.println(mark[i]);
    //    }
    for (int i : mark) {
        System.out.println(i);
    }
        for (int b : marks) {
            System.out.println(b);
        }
    }
}