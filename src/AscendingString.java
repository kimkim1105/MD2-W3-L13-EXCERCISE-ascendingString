import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class AscendingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao mot chuoi: ");
        String str = scanner.nextLine();
        LinkedList<Character> characters = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.addFirst(str.charAt(i));
            System.out.println(list);
            for (int j = i+1;j<str.length();j++){
                if (str.charAt(j)>list.getLast()){
                    list.add(str.charAt(j));
                    System.out.println(list.getLast());
                }
            }
            if (list.size()>characters.size()){
                characters.clear();
                characters.addAll(list);
                System.out.println(characters);
            }
            list.clear();
        }
        for (Character ch:
             characters) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
