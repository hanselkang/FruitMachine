import java.util.Random;

public class Reel{
    private Symbols symbols;


    public Symbols getSymbol() {
        return symbols;
    }

    public void setRandomSymbol(){
        Random random = new Random();

        int randomReel = random.nextInt(5);

//        hashmap
        symbols = Symbols.values()[randomReel];

//        System.out.println(randomReel); print random index
//        System.out.println(symbols); print random enum
    }
}