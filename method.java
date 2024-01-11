/**
 * method
 */
public class method {

     int logic (int x,int y){
        int z;
        if (x>y) {
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        method m = new method();
        System.out.println(m.logic(3,2));
    }
}