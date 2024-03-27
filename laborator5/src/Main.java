public class Main {
    public static void main(String[] args) {

        String regex1 = "[abc]";
        String regex2 = "[^abc]";
        String regex3 = "[a-z]";
        String regex4 = "[a-zA-Z]";
        String regex5 = "[a-z][A-Z]";
        String regex6 = "[abc]+";
        String regex7 = "[abc]*";
        String regex8 = "[abc]{5}";
        String regex9 = "[abc]{5,}";
        String regex10 = "[abc]{5,10}";
        System.out.println("a".matches(regex1));
        System.out.println("d".matches(regex2));
        System.out.println("a".matches(regex3));
        System.out.println("A".matches(regex4));
        System.out.println("aA".matches(regex5));
        System.out.println("a".matches(regex6));
        System.out.println("a".matches(regex7));
        System.out.println("aaaaa".matches(regex8));
        System.out.println("aaaaaa".matches(regex9));
        System.out.println("aaaaaaa".matches(regex10));

        String text = "Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.";
        System.out.println("Lungimea sirului de caractere este: " + text.length());
        System.out.println("Textul contine doar litere mari si litere mici: " + text.matches("[a-zA-Z]+"));
        String[] words = text.split(" ");
        if (words.length % 2 == 0) {
            System.out.println("Cuvintele de la mijloc sunt: " + words[words.length / 2 - 1] + " " + words[words.length / 2]);
        } else {
            System.out.println("Cuvintele de la mijloc sunt: " + words[words.length / 2]);
        }
        System.out.println("Textul inversat este: " + new StringBuilder(text).reverse().toString());


    }
}