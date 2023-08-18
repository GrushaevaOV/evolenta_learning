package evolenta.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //4.1
        System.out.println("4.1 Введите строку ");
        String line = in.nextLine();
        System.out.println("Введите подстроку ");
        String littleLine = in.nextLine();
        System.out.println("Число вхождений подстроки в строке "+ (line.split(littleLine,-1).length-1));
        //4.2
/*        System.out.println("4.2 Введите строку ");
        String lineStr = in.nextLine();
        String lineNoByaka = lineStr.replaceAll("бяка", "вырезано цензурой");
        String clearLine = lineNoByaka.replaceAll("кака", "вырезано цензурой");
        System.out.println(clearLine);
        //4.3
        System.out.println("Введите дату в формате ДД.MM.ГГГГ");
        String dataLine = in.nextLine();
        String[] data = dataLine.split("\\.");
        System.out.println(data[2]+"-"+data[1]+"-"+data[0]);
        //4.4
        String dataString = in.nextLine();
        SimpleDateFormat oldFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = oldFormat.parse(dataString);
            String result = newFormat.format(date);
            System.out.println(result);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }*/
    }
}