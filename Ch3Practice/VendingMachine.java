
public class VendingMachine {
   private int cans;
   private int tokens;
   public VendingMachine(int cansIn) {
       cans = cansIn;
   }
   public void insertCans(int cansAdd) {
       cans += cansAdd;
    }
   public void insertTokens(int tokensAdd) {
       tokens += tokensAdd;
       cans -= tokensAdd;
   }
   public int getCans() {
       return cans;
   }
   public int getTokens() {
       return tokens;
   }
}
