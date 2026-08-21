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
        if (mood == 1 && genre == 1) {
    // Happy + Afrobeats
    System.out.println("1. Essence - Wizkid ft Tems");
    System.out.println("2. Pe le - Oxlade");
    System.out.println("3. Kilofeshe - Asake");
} else if (mood == 1 && genre == 2) {
    // Happy + RnB
    System.out.println("1. Good Days - SZA");
    System.out.println("2. Pick Up Your Feelings - Jazmine Sullivan");
    System.out.println("3. Leave The Door Open - Bruno Mars");
}else if ( mood == 1 && genre == 3) {
    // Happy + Hip Hop
    System.out.println("1. Blinding Lights - The Weeknd");
    System.out.println("2. Save Your Tears - The Weeknd");
    System.out.println("3. Levitating - Dua Lipa");
}else if (mood == 1 && genre == 4) {
    // Happy + Pop
    System.out.println("1. Watermelon Sugar - Harry Styles");
    System.out.println("2. Don't Start Now - Dua Lipa");
    System.out.println("3. Adore You - Harry Styles");
}else if (mood == 1 && genre == 5) {
    // Happy + Amapiano
    System.out.println("1. Sipho Fana - Nasty C");
    System.out.println("2. Khaya - Amapiano");
    System.out.println("3. Mzansi - Amapiano");
}

        scanner.close();
    }
}