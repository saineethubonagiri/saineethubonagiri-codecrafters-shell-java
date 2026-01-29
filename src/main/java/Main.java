import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // TODO: Uncomment the code below to pass the first stage
        //System.out.print("$ ");
        Scanner sc = new Scanner(System.in);
       // String cmd = sc.next();
        //System.out.println(cmd + ": command not found");

        while(true){
           System.out.print("$ ");
            String input = sc.nextLine();
            String word = input.substring(0,4);
            if(input.equals("exit")) {
                System.exit(0);

            }
            else if(word.equals("echo")){
                System.out.println(input.substring(5));
            }
            else {
                System.out.println(input + ": command not found");
            }
        }
    }
}
