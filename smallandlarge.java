public class SmallAndLarge {  
    public static void main(String[] args) {  
        int a[] = {900, 100, 650, 200, 250, 300};  // Define array  

        // Finding Maximum Element
        int max = a[0];  
        for (int i = 1; i < a.length; i++) {  
            if (a[i] > max) {  
                max = a[i];  
            }
        }
        System.out.println("Maximum element: " + max);  

        // Finding Minimum Element
        int min = a[0];  
        for (int i = 1; i < a.length; i++) {  
            if (a[i] < min) {  // Corrected condition
                min = a[i];  
            }
        }
        System.out.println("Minimum element: " + min);  
    }
}
