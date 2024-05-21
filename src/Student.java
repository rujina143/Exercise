public class Student {
    private int[] scores;
    private int scoreCount;


    public Student(int[] scores) {
        this.scores = scores;
        this.scoreCount = scores.length;
    }


    public void removeMin() {
        if (scoreCount == 0) {
            System.out.println("No scores to remove.");
            return;
        }


        int minIndex = 0;
        for (int i = 1; i < scoreCount; i++) {
            if (scores[i] < scores[minIndex]) {
                minIndex = i;
            }
        }


        for (int i = minIndex; i < scoreCount - 1; i++) {
            scores[i] = scores[i + 1];
        }


        scoreCount--;


        scores[scoreCount] = 0;
    }


    public void displayScores() {
        for (int i = 0; i < scoreCount; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] scores = {88, 95, 70, 100, 85};
        Student student = new Student(scores);

        System.out.println("Original scores:");
        student.displayScores();

        student.removeMin();

        System.out.println("Scores after removing the minimum:");
        student.displayScores();
    }
}

