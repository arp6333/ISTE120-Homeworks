public class CoinToss{
   private int heads, tails, tosses;
   private char flips[];
   private char bestCoin;
   public CoinToss(int num){
      heads = 0;
      tails = 0;
      tosses = num;
      flips = new char[tosses];
      bestCoin = 0;
   }
   public char[] flip(){
      double random = 0;
      for(int i = 0; i < flips.length; i++){
         random = Math.random();
         if(random < 0.5){
            flips[i] = 't';
            tails += 1;
         }
         else{
            flips[i] = 'h';
            heads += 1;
         }
         random = 0;
      }
      return flips;
   }
   public int longestRun(){
      int best = 1;
      int count = 1;
      for(int i = 1; i < flips.length; i++){
         if(flips[i] == flips[i-1]){
            count += 1;
            if(count > best){
               best = count;
               if(flips[i] == 'h'){
                  bestCoin = 'h';
               }
               else{
                  bestCoin = 't';
               }
            }
         }
         else{
            count = 1;
         }
      }
      return best;
   }
   public double getNumHeads(){
      return (double) heads / tosses;
   }
   public double getNumTails(){
      return (double) tails / tosses;
   }
   public int getTosses(){
      return tosses;
   }
   public String getBestRun(){
      if(bestCoin == 'h'){
         return "heads";
      }
      else{
         return "tails";
      }
   }
   public void setTosses(int num){
      tosses = num;
   }
}
      