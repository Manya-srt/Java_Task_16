// Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
// Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
// Пользователь при тестировании программы по правилу черного ящика должен понимать,
// какой принцип остановки записи в файл он должен подать.

import java.io.*;

public class Task_16 {
    public static void main(String[] args) throws IOException {
        String line;

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Чтобы остановить запись в файль - введите слово 'stop'");

        File file = new File("file.txt");
        FileWriter fileWriter = new FileWriter(file);

        try (FileWriter fileWriter = new FileWriter(file.txt)){
            do{
                System.out.print(": ");
                line = bufferedReader.readLine();

                if(line.compareTo("stop")== 0) break;
                line = line + "\r\n";
                fileWriter.write(line);
            } while(line.compareTo("stop") != 0);
        } catch(IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }

    }
}
