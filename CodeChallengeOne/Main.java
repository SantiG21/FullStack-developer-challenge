import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int S = 1;  // Según tu hash MD5
        
        // Lista de números
        String[] input = {"16", "123", "99", "10", "567", "109"};
        
        List<String> result = new ArrayList<>();
        
        for (String numStr : input) {
            StringBuilder newNum = new StringBuilder();
            for (char digit : numStr.toCharArray()) {
                int currentDigit = Character.getNumericValue(digit);
                if (currentDigit < S) {
                    newNum.append(currentDigit);
                }
            }
        
            if (newNum.length() > 0) {
                result.add(newNum.toString());
            }
        }
        
        // Imprimir la lista modificada
        System.out.println("Lista modificada:");
        for (String num : result) {
            System.out.print(num + " ");
        }
    }
}

