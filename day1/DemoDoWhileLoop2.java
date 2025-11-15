class DemoDoWhileLoop2 {
    public static void main(String[] args) {
        int i = 1; // Declare i outside the loop

        do {
            if (i == 1)
                System.out.println("register.");
            else if (i == 2)
                System.out.println("find.");
            else if (i == 3)
                System.out.println("findAll.");
            else if (i == 4)
                System.out.println("delete.");
            else if (i == 5)
                System.out.println("update.");
            else
                System.out.println("exit.");

            i++; 
        } while (i == 3);     }
}
