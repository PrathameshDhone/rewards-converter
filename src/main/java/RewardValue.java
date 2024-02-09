public class RewardValue {
     private double cashValue;
     private int milesValue;
   public RewardValue(double cashValue){

       this.cashValue=cashValue;
       this.milesValue=(int)Math.round((cashValue/0.0035d));


   }
    public RewardValue(int milesValue){
        this.milesValue=milesValue;
        this.cashValue=milesValue*0.0035d;
        this.cashValue=Math.round(this.cashValue*100)/100.0d;
    }
   public double getMilesValue(){
       return this.milesValue;
   }
    public double getCashValue(){
        return this.cashValue;
    }

}
