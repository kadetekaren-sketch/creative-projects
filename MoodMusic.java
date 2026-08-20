import java.util.Scanner;

public class MoodMusic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("🎵 Mood Music Recommender 🎵");
        System.out.println("How are you feeling today?");
        System.out.println("1. Happy");
        System.out.println("2. Sad");
        System.out.println("3. Energetic");
        System.out.println("4. Relaxed");
        System.out.println("5. Angry");
        System.out.print("Enter a number: ");
        
        int mood = scanner.nextInt();
        
        System.out.println("\nPerfect! What genre do you like?");
        System.out.println("1. Afrobeats");
        System.out.println("2. RnB");
        System.out.println("3. Hip Hop");
        System.out.println("4. Pop");
        System.out.println("5. Amapiano");
        System.out.print("Enter a number: ");
        
        int genre = scanner.nextInt();
        
        System.out.println("\n🎧 Recommended songs for you:");
        
        scanner.close();
    }
}