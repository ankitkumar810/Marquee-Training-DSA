class Practice {
    public static void main(String[] args) {
        String s = "Hello";
        String s1= "Hello";
        System.out.print(s==s1);
        String s2 = "hello";
        String s3 = new String("Hello");
        // String s3 = "Hello";
        System.out.print(s3);
        System.out.print(s1==s2);
        System.out.print(s.concat("World"));
    }
}