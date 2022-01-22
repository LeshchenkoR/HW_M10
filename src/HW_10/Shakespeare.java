package HW_10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Shakespeare {

    public void FindPhraze(String fileName, String phraze) throws FileNotFoundException {
        Scanner scan = new Scanner(new FileReader(fileName));
        int lineCounter = 0;
        int result = 0;
        while (scan.hasNextLine()) {
            String content = scan.nextLine();
            lineCounter++;
            if (content.indexOf(phraze) != -1) {
                System.out.println("Строка " + lineCounter + " звучит так: " + content);
                result++;
            }
        }
        System.out.println("Количество совпадений = " + result);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Shakespeare sonet = new Shakespeare();
        sonet.FindPhraze("D:\\JAVA\\Новая папка\\HomeWork_M10\\src\\HW_10\\Shakespeare.txt", "вклад");
    }
}