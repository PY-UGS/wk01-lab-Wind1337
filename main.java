public class main {
    public static void main (String[] args){
		// 2101395 Teo Wen Yu Carlsen
		
        // Question 2a
        System.out.println("Hello, I am Carlsen");

        // Question 2b
        String modCode = "CSC1009";
        switch (modCode){
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;
            case "CSC1007":
                System.out.println("Operating Systems");
                break;
            case "CSC1008":
                System.out.println("Data Structure and Algorithm");
                break;
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            case "CSC1010":
                System.out.println("Computer Networks");
                break;
            default:
                System.out.println("Unknown Module Code");
                break;
        }
        System.out.println("After Switch");

        // Question 2c
        for (int x = 102; x >= 66; x--){
            if (x % 2 != 0)
                System.out.println("Value of x: " + x);
        }
    }
}
