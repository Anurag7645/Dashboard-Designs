public class reverseastring {
    public static void main(String[] args) {
         StringBuilder st = new StringBuilder("Hello");
         {
            for(int i=0; i<st.length()/2; i++)
            {
                int front = i;
                int back = st.length()-1-i;

                char frontChar = st.charAt(front);
                char backchar = st.charAt(back);

                st.setCharAt(front, backchar);
                st.setCharAt(back, frontChar);

            }
            System.out.println(st);
         }
    }
}
