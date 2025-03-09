public class smallandlarge {  
    public static void main(String[] args) {  // Fix: String with capital 'S'
        int a[] = {50, 100, 150, 200, 250, 300};  // Define array  
        int max = a[0];  // Assume first element is the maximum  

        for (int i = 1; i < a.length; i++) {  
            if (a[i] > max) {  
                max = a[i];  // Update max if a bigger element is found  
            }
        }

        System.out.println("Maximum element: " + max);  // Print result
    
        int min = a[0];  // Assume first element is the maximum  

        for (int i = 1; i < a.length; i++) {  
            if (a[i] > min) {  
                max = a[i];  // Update max if a bigger element is found  
            }
        }

        System.out.println("Minimum element: " + min);
    }
}