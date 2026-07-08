// package 05_Strings;

public class CountWord {
    public static void main(String[] args) {
	    String str = "Cat dog meow";
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(((str.charAt(i)+0)>=65 && (str.charAt(i)+0)<=90) || (str.charAt(i)+0)>=97 && (str.charAt(i)+0)<=122){
                count++;
            } 
        }
	    System.out.println(count);
	}
}