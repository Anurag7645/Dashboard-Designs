public class stringbuild {
    public static void main(String[] args) {
        StringBuilder ab = new StringBuilder("Anurag");
        System.out.println(ab);
        
        //Character at index 0
        System.out.println(ab.charAt(0));
         
        //Set character at index 0
        ab.setCharAt(0, 'V');
        System.out.println(ab);

        ab.setCharAt(0, 'A');
        System.out.println(ab);

        ab.insert(0, 'n');
        System.out.println(ab);

        ab.delete(0, 1);
        System.out.println(ab);

        ab.append("\tPandey");
        System.out.println(ab);

    }
}
