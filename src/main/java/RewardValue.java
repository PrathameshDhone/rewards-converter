public class RewardValue {
    final private double cashValue;
   public RewardValue(double cashValue){
       this.cashValue=cashValue;
   }
   public double getMilesValue(){
       return this.cashValue*0.0035d;
   }
    public double getCashValue(){
        return this.cashValue;
    }

}
