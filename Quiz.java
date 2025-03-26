package week004;

public class Quiz {
    private String[] questions = {
        "Kenapa lampu merah selalu berhenti?",
        "Buah apa yang paling sabar?",
        "Kenapa komputer kedinginan?",
        "Ayam apa yang tidak bisa bertelur?",
        "Kenapa burung gagak selalu hitam?",
        "Apa bedanya sarung dan kotak?",
        "Kenapa ikan selalu tahu segala hal?",
        "Kenapa gajah tidak pernah lupa?",
        "Kenapa batu tidak pernah lari?",
        "Kenapa semut selalu antri?"
    };

    private String[][] options = {
        {"1. Karena takut ditilang", "2. Karena capek", "3. Karena malu", "4. Karena ada polisi"},
        {"1. Jeruk", "2. Mangga", "3. Sabarilla", "4. Anggur"},
        {"1. Karena kehabisan baterai", "2. Karena punya banyak Windows", "3. Karena kipasnya rusak", "4. Karena kebanyakan browsing"},
        {"1. Ayam betina", "2. Ayam goreng", "3. Ayam jantan", "4. Ayam bakar"},
        {"1. Karena tidak pernah mandi", "2. Karena lahir sudah hitam", "3. Karena malas ganti baju", "4. Karena selalu di film horor"},
        {"1. Sarung bisa dilipat, kotak tidak", "2. Sarung bisa dipakai, kotak tidak", "3. Sarung tidak bisa dikotak-kotak", "4. Kotak tidak bisa disarungin"},
        {"1. Karena dia sering browsing", "2. Karena dia tinggal di air", "3. Karena dia punya banyak teman", "4. Karena dia sekolah"},
        {"1. Karena dia punya ingatan besar", "2. Karena dia besar", "3. Karena dia sering baca buku", "4. Karena dia pintar"},
        {"1. Karena dia tidak punya kaki", "2. Karena dia malas", "3. Karena dia sudah tua", "4. Karena dia keras kepala"},
        {"1. Karena mereka rajin", "2. Karena mereka kecil", "3. Karena mereka ikut budaya antre", "4. Karena mereka takut dihitung satu-satu"}
    };

    private int[] correctAnswers = {1, 3, 2, 3, 2, 3, 2, 1, 4, 4};

    private int score = 0;
    
   
    public int getQuestionCount() {
        return questions.length;
    }
    
    
    public void displayQuestion(int index) {
        System.out.println("\nPertanyaan " + (index + 1) + ": " + questions[index]);
        for (int j = 0; j < options[index].length; j++) {
            System.out.println(options[index][j]);
        }
    }
    
    public void checkAnswer(int index, int userAnswer) {
        if (userAnswer == correctAnswers[index]) {
            System.out.println("Benar!");
            score += 10;
        } else {
            System.out.println("Salah! Jawaban yang benar adalah: " + 
                options[index][correctAnswers[index] - 1]);
        }
    }
    
    // Method untuk mendapatkan skor
    public int getScore() {
        return score;
    }
}