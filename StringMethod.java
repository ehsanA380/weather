/**
 * StringMethod
 */
public class StringMethod {

    public static void main(String[] args) {
        //problem 1
        String name ="Jack Perker";
        // name= name.toLowerCase();
        name = name.toUpperCase();
        System.out.println(name);

        // problem 2
        String text = "To My Friend";
        text = text.replace(" ", "_");
        System.out.println(text);

        // problem 3
        String letter = "Dear <!name!>. Thanks alot.";
        letter = letter.replace("<!name!>", "Ehsan");
        System.out.println(letter);

        // problem 4
        String trim = "           I am a programmer";
        
        System.out.println(trim);
        
        trim = trim.trim();
        System.out.println("it has been trimmed "+trim);

        // program 5
        String myString= "This string contains  double and   triple space";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // problem 6
        String myLetter = "Dear Harry, This java course is Nice. Thankks!";
        myLetter="Dear Harry, \n\t This java course is Nice.\n\t Thanks!";
        System.out.println(myLetter);
    }
}