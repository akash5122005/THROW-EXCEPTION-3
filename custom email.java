import java.util.Scanner;
class InvalidEmailException extends Exception{
    public InvalidEmailException(String message){
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String email = scanner.nextLine();
            if(email.equalsIgnoreCase("exit")){
                System.out.println("Exiting the program.");
                break;
            }
            try{
                validEmail(email);
                System.out.println("Email is valid.");
            } catch (InvalidEmailException e){
                System.out.println(e.getMessage());
            }catch(Exception e){
                System.out.println("An unexpected error: "+ e.getMessage());
            }
           
        }

        scanner.close();
    }
    public static void validEmail(String email) throws InvalidEmailException{
        if(!email.contains("@")){
            throw new InvalidEmailException("Error: Invalid email format");
        }
    }
}
