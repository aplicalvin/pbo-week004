package week004;
import java.util.Scanner;

public class Mainquiz {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        Quiz tebakan = new Quiz();

        System.out.println("Welcome!");

        int answer;

        // Looping pertanyaan
        for (int i = 0; i < tebakan.getQuestionCount(); i++) {
            // Looping pertanyaan
            tebakan.displayQuestion(i);
            
            // TANYA jawaban
            System.out.print("Jawaban anda : " );
            answer = inputan.nextInt();

            // Check for answer
            tebakan.checkAnswer(i,answer);
        }
        
        // Output Akhir
        System.out.print("Score anda : " + tebakan.getScore() + ". ");

        // Kasi pesan
        if (tebakan.getScore() == 0) {
            System.out.println("Anda cupu!");
        } else if (tebakan.getScore() == (tebakan.getQuestionCount() * 10)) {
            System.out.println("Anda Jago, benar semua njir");
        } else {
            System.out.println("Lumayanlah");
        }

    }

}