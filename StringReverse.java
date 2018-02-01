public class StringReverse {
    public static void main(String args[]) {
        String input="stats";
        System.out.println(input);
        char temp;
        int start=0;
        char out[]=input.toCharArray();
        int end=input.length()-1;
        while(end>start)
        {
            temp=out[start];
            out[start]=out[end];
            out[end]=temp;
            start++;
            end--;
        }
        System.out.println(out);
    }
}
