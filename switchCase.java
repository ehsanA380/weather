/**
 * switchCase
 */
public class switchCase {

    public static void main(String[] args) {
        // ===============traditional switch case statement ====================
        // String var = "subham";
        String var = "rohan";
        switch (var) {
            case "subham":
                System.out.println("your are a good boy");
                System.out.println("you are 18 yr old");
                break;
            case "rohan":
                System.out.println("You are nice ");
                System.out.println("Enjoy your life");
                break;
            default:
                System.out.println("I am defalut value");
                break;
        }
        // =========== Enhenced switch case statement (no break statement needed) ============
        
         String var1 = "mohadn";
        switch (var1) {
            case "rohan"->{
                System.out.println("-en I am rohan");
                System.out.println("-en I am 18 yr old");
            }
            case "mohan"->{
                System.out.println("-en I am mohan");
                System.out.println("-en I am  19 yr old");
            }
            default ->{
                System.out.println("I am default");
            }

        }
    }
}