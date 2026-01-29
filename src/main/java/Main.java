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
            else if(word.equals("type")){
                String word2 = input.substring(5);
                if(word2.equals("echo") || word2.equals("exit") || word2.equals("type")){
                    System.out.println(word2 + " is a shell builtin");
                }
                else{
                    System.out.println(word2 + ": not found");
                }
            }
            else {
                System.out.println(input + ": command not found");
            }
        }
    }
}
