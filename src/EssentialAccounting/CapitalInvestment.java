/*
 * Calulates diffent Capital Investment formulas
 */
package EssentialAccounting;

/**
 *
 * @author dominque
 */
public class CapitalInvestment 
{
    /**
     * 
     * @param CostInvestment: Cost of capital investment
     * @param CashFlow: Net annual cash flow
     * @return Cash Payback Period = cost of capital investment / net annual cash flow
     */
    public static float Paybackperiod(float CostInvestment, float CashFlow)
    {
        return (CostInvestment / CashFlow);
    }
    
    /**
     * 
     * @param NetCashFlow: Present value of Net Cash Flows
     * @param InitalInvestment: Initial Investment
     * @return   Profitability Index = Present value of Net Cash Flows / Initial Investment
     */
    public static float ProfitabilityIndex(float NetCashFlow, float InitalInvestment)
    {
        return (NetCashFlow / InitalInvestment);
    }
    
    /**
     * 
     * @param CapitalInvestment: Capital Investment
     * @param NetCashFlow: Net Annual Cash Flows
     * @return Interest Rate Return Factor = Capital Investment / Net Annual Cash Flows
     */
    public static float InterestRateReturn(float CapitalInvestment, float NetCashFlow)
    {
        return (CapitalInvestment / NetCashFlow);
    }
    
    /**
     *  
     * @param NetIncome: Expected annual Net Income
     * @param AverageInvestment: Average Investment
     * @return Annual Rate Return = Expected annual Net Income / Average Investment
     */
    public static float AnnualReturn(float NetIncome, float AverageInvestment)
    {
        return (NetIncome / AverageInvestment);
    }
     
     /**
      * 
      * @param OrgInvestment: Original Investment
      * @param EndValueLife: Value at end of useful life
      * @return Average Investment = (Original Investment + Value at end of useful life) / 2
      */
     public static float AverageInvestment(float OrgInvestment, float EndValueLife)
    {
        return (OrgInvestment + EndValueLife) /2;
    }
    
    
}
