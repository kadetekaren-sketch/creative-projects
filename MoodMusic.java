import java.util.Scanner;

public class MoodMusic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Choose music based on how you're feeling and your preferred genre
        // still working on it, will add more moods and genres later
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
}else if (mood == 2 && genre == 1) {
    // Sad + Afrobeats
    System.out.println("1.Heaven - DJ Spinall ft. Tiwa Savage");
    System.out.println("2.body abd soul - Burna Boy");
    System.out.println("3.low - Rema");
}else if (mood == 2 && genre == 2) {
    // Sad + RnB
    System.out.println("1. We Belong Together - Mariah Carey");
    System.out.println("2. Un-break My Heart - Toni Braxton");
    System.out.println("3. Irreplaceable - Beyoncé");
}else if (mood == 2 && genre == 3) {
    // Sad + Hip Hop
    System.out.println("1. Lucid Dreams - Juice WRLD");
    System.out.println("2. All Girls Are The Same - Juice WRLD");
    System.out.println("3. Sad! - XXXTentacion");
}else if (mood == 2 && genre == 4) {
    // Sad + Pop
    System.out.println("1. Someone Like You - Adele");
    System.out.println("2. When We Were Young - Adele");
    System.out.println("3. Stay - Rihanna");
}else if (mood == 2 && genre == 5) {
    // Sad + Amapiano
    System.out.println("1. Mina nawe");
    System.out.println("2. Abalele");
    System.out.println("3. Fatela");
}else if (mood == 3 && genre == 1) {
    // Energetic + Afrobeats
    System.out.println("1. Ye - Burna Boy");
    System.out.println("2. Fall - Davido");
    System.out.println("3. Duro - Tekno");
}else if (mood == 3 && genre == 2) {
    // Energetic + RnB
    System.out.println("1. Crazy In Love - Beyoncé");
    System.out.println("2. Yeah! - Usher");
    System.out.println("3. Ignition (Remix) - R. Kelly");
}else if (mood == 3 && genre == 3) {
    // Energetic + Hip Hop
    System.out.println("1. Blinding Lights - The Weeknd");
    System.out.println("2. Save Your Tears - The Weeknd");
    System.out.println("3. Levitating - Dua Lipa");
}else if (mood == 3 && genre == 4) {
    // Energetic + Pop
    System.out.println("1. Watermelon Sugar - Harry Styles");
    System.out.println("2. Don't Start Now - Dua Lipa");
    System.out.println("3. Adore You - Harry Styles");
}else if (mood == 3 && genre == 5) {
    // Energetic + Amapiano
    System.out.println("1. Sipho Fana - Nasty C");
    System.out.println("2. Khaya - Amapiano");
    System.out.println("3. Mzansi - Amapiano");
}else if (mood == 4 && genre == 1) {
    // Relaxed + Afrobeats
    System.out.println("1. Peru - Fireboy DML");
    System.out.println("2. Trouble maker - Rema");
    System.out.println("3. Remember - Asake");
}else if (mood == 4 && genre == 2) {
    // Relaxed + RnB
    System.out.println("1. Adore - Prince");
    System.out.println("2. Sunshine - Floetry");
    System.out.println("3. The Sweetest thing - Lauryn Hill");
}else if (mood == 4 && genre == 3) {
    // Relaxed + Hip Hop
    System.out.println("1. Feather - Nujabes");
    System.out.println("2. The Light - Common");
    System.out.println("3. Jazz (We've Got) - A Tribe Called Quest");
}else if (mood == 4 && genre == 4) {
    // Relaxed + Pop
    System.out.println("1. Be Alright - Dean Lewis");
    System.out.println("2. Ocean Eyes - Billie Eilish");
    System.out.println("3. Liability - Lorde");
}else if (mood == 4 && genre == 5) {
    // Relaxed + Amapiano
    System.out.println("1. Umama Akhekho");
    System.out.println("2. Bedtime Stories");
    System.out.println("3. Uthando Lujulile");
}else if (mood == 5 && genre == 1) {
    // Angry + Afrobeats
    System.out.println("1. Last Last - Burna Boy");
    System.out.println("2. Dami Duro - Davido");
    System.out.println("3. Fela Kuti - Water No Get Enemy");
}else if (mood == 5 && genre == 2) {
    // Angry + RnB
    System.out.println("1. Bils, Bills, Bills - Destiny's Child");
    System.out.println("2. Caught Out There - Kelis");
    System.out.println("3. Ring the Alarm - Beyoncé");
}else if (mood == 5 && genre == 3) {
    // Angry + Hip Hop
    System.out.println("1. Go to Sleep by Eminem");
    System.out.println("2. Ante up by M.O.P");
    System.out.println("3. Where the hood at by DMX");
}else if (mood == 5 && genre == 4) {
    // Angry + Pop
    System.out.println("1. So What by P!nk");
    System.out.println("2. Since U Been Gone by Kelly Clarkson");
    System.out.println("3. Fighter by Christina Aguilera");
}else if (mood == 5 && genre == 5) {
    // Angry + Amapiano
    System.out.println("1. Shay'mpempe");
    System.out.println("2. Me now");
    System.out.println("3. Monate Ke Monate");
}
else {
    System.out.println("Invalid mood or genre selection. Please try again.");
}
        scanner.close();
    }
}