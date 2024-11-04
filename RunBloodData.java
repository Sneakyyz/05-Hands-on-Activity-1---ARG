import java.util.Scanner;
public class RunBloodData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BloodData bd = new BloodData();
        
        System.out.print("Enter blood type of patient (O, A, B, AB): ");
        String inputBloodType = scan.nextLine().trim();
        
        System.out.print("Enter the Rhesus factor (+ or -): ");
        String inputRhFactor = scan.nextLine().trim();
        
        if (!inputBloodType.isEmpty()) {
            bd.setBloodType(inputBloodType);
        }
        
        if (!inputRhFactor.isEmpty()) {
            bd.setRhFactor(inputRhFactor);
        }
        bd.display();
        scan.close();
    }
}