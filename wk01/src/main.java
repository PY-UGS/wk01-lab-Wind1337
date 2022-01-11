public class main {
    public static void main (String[] args){
		// 2101395 Teo Wen Yu Carlsen
		
        // Question 2a
        System.out.println("Hello, I am Carlsen");

        // Question 2b
        String currency = "CSC1009";
        switch (currency){
            case "AUD":
                System.out.println("Australian Dollar");
                break;
            case "MYR":
                System.out.println("Malaysian Ringgit");
                break;
            case "IDR":
                System.out.println("Indonesian Rupiah");
                break;
            case "SGD":
                System.out.println("Singapore Dollar");
                break;
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            default:
                System.out.println("Unknown Currency");
                break;
        }
        System.out.println("After Switch");

        // Question 2c
        for (int x = 102; x >= 66; x--){
            System.out.println("Value of x: " + x);
        }
    }
}
