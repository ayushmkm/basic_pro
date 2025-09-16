import java.util.Scanner;
class calculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter First number : ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("Enter Second number : ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("What operation u want to perfrom (Sum,Subtraction,Multiply,Division : ");
        String operation = scanner.nextLine();
        
        if(operation.equals("Sum")){
            System.out.printf("%f + %f = %f",number1,number2,number1+number2);
        }
       if(operation.equals("Subtract")){
            System.out.printf("%f - %f = %f",number1,number2,number1-number2);
        }
        if(operation.equals("Multiply")){
            System.out.printf("%f * %f = %f",number1,number2,number1*number2);
        }
        if(operation.equals("Division")){
            System.out.printf("%f / %f = %f",number1,number2,number1/number2);
        }
        scanner.close();
    }
}
