import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // TODO: Uncomment the code below to pass the first stage
        System.out.print("$ ");
        Scanner sc = new Scanner(System.in);
       // String cmd = sc.next();
        //System.out.println(cmd + ": command not found");

        while(true){
            System.out.print("$ ");
            String input = sc.nextLine();
            if(input.equals("exit")) {
                System.exit(0);

            }
            else{
                System.out.println(input);
            }
        }
    }
}
