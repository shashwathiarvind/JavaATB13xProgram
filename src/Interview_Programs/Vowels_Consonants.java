package Interview_Programs;

public class Vowels_Consonants {
    public static void main(String[] args) {
        //program to count vowels and consonants
        //Shashwathi -> a, i

        String input = "Shashwathi";
        int vowels = 0;
        int consonants = 0;
        input = input.toLowerCase();
        System.out.println(input);

        for (int i = 0; i < input.length() ; i++) {
            char ch = input.charAt(i);
            if ( ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }else {
                    consonants++;

                }
            }
            System.out.println("Number of vowels: " +vowels);
            System.out.println("Number of consonants: " +consonants);
        }

    }

