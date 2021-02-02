import java.util.Scanner;

public class Main{

    static String generate(String name,String lname,String department){
        //concatinate the string and return it.
        String email = name+"."+lname.toLowerCase()+"@"+department.toLowerCase()+".company.com";
        return email;
    }

    static String password(int n)
    {
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scan.nextLine();
        System.out.print("Enter last name: ");
        String lastname = scan.nextLine();
        System.out.print("Enter the department: ");
        String department = scan.nextLine();
        System.out.printf("Enter length of password: ");
        int n = Integer.valueOf(scan.nextLine());
        System.out.println(name+" "+lastname);
        System.out.println("Yout email:"+generate(name,lastname,department));
        System.out.println("Your Password:"+password(n));
    }
}
