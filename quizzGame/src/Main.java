import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // importing scanner
        Scanner sc = new Scanner(System.in);

        // question array

        String[] questions = {
                "1. What is the national animal of India?",
                "2. Who was the first Prime Minister of India?",
                "3. Which is the largest state in India by area?",
                "4. In which year did India gain independence?",
                "5. What is the national flower of India?",
                "6. Who wrote the Indian National Anthem?",
                "7. Which Indian city is known as the 'Pink City'?",
                "8. What is the currency of India?",
                "9. Which river is the longest in India?",
                "10. Who was known as the 'Iron Man of India'?",
                "11. What is the national sport of India?",
                "12. Where is the Taj Mahal located?",
                "13. Who is known as the 'Missile Man of India'?",
                "14. What is the national bird of India?",
                "15. Which Indian state is famous for backwaters?"
        };

        // option array
        String[][] options = {
                {"1) Lion", "2) Tiger", "3) Elephant", "4) Peacock"},
                {"1) Mahatma Gandhi", "2) Jawaharlal Nehru", "3) Sardar Patel", "4) Subhash Chandra Bose"},
                {"1) Maharashtra", "2) Rajasthan", "3) Madhya Pradesh", "4) Uttar Pradesh"},
                {"1) 1945", "2) 1947", "3) 1950", "4) 1952"},
                {"1) Rose", "2) Lotus", "3) Marigold", "4) Jasmine"},
                {"1) Rabindranath Tagore", "2) Mahatma Gandhi", "3) Bankim Chandra Chatterjee", "4) Sarojini Naidu"},
                {"1) Mumbai", "2) Jaipur", "3) Delhi", "4) Udaipur"},
                {"1) Dollar", "2) Yen", "3) Rupee", "4) Dinar"},
                {"1) Yamuna", "2) Ganga", "3) Godavari", "4) Brahmaputra"},
                {"1) Bhagat Singh", "2) Lal Bahadur Shastri", "3) Sardar Vallabhbhai Patel", "4) Dr. Rajendra Prasad"},
                {"1) Cricket", "2) Hockey", "3) Kabaddi", "4) Football"},
                {"1) Delhi", "2) Agra", "3) Jaipur", "4) Lucknow"},
                {"1) Dr. A.P.J. Abdul Kalam", "2) Vikram Sarabhai", "3) Homi Bhabha", "4) C.V. Raman"},
                {"1) Crow", "2) Parrot", "3) Peacock", "4) Sparrow"},
                {"1) Goa", "2) Kerala", "3) Tamil Nadu", "4) Gujarat"}
        };

        // answer array
        int[] answers = {2, 2, 2, 2, 2, 1, 2, 3, 3, 3, 2, 2, 1, 3, 2};

        int guess = 0;
        int count = 0;

        System.out.println("*********************");
        System.out.println("WELCOME TO QUIZZ GAME");
        System.out.println("*********************");

        for(int i = 0; i < questions.length; i ++){

            System.out.println(questions[i]);
            for (String option : options[i]){

                System.out.println(option);

            }


            System.out.print("Enter the answer : ");
            guess = sc.nextInt();

            if(guess == answers[i]){

                System.out.println("*********************");
                System.out.println("CORRECT !");
                System.out.println("*********************");
                count ++;

            } else {

                System.out.println("*********************");
                System.out.println("WRONG !");
                System.out.println("Correct Answer : " + answers[i]);
                System.out.println("*********************");

            }

        }

        System.out.println("Total Questions : " + questions.length);
        System.out.println("Correct Questions : " + count);

    }

}
