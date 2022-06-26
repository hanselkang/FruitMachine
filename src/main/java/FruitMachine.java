public class FruitMachine {

    private Reel reel1;
    private Reel reel2;
    private Reel reel3;

    public FruitMachine() {
        this.reel1 = new Reel();
        this.reel2 = new Reel();
        this.reel3 = new Reel();
    }

    public void spin() {
        reel1.setRandomSymbol();
        reel2.setRandomSymbol();
        reel3.setRandomSymbol();
    }

    public void printResult(){
        System.out.println(reel1.getSymbol());
        System.out.println(reel2.getSymbol());
        System.out.println(reel3.getSymbol());
    }

    public int result(){
        if (reel1.getSymbol() == reel2.getSymbol() && reel1.getSymbol() == reel3.getSymbol()){
            System.out.println("WIN!");
            System.out.println(reel1.getSymbol().getValue());
            return(reel1.getSymbol().getValue());
        } else {
            System.out.println("Try AGAIN!");
            System.out.println(0);
            return 0;
        }
    }
}
