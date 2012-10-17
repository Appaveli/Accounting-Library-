/*
 * Calculates different Financial Statement formulas
 */
package EssentialAccounting;

/**
 *
 * @author dominque
 */
public class FinancialStatments 
{
    /**
     * 
     * @param liabilites: Liabilities
     * @param StockEquity: Stockholders equity
     * @return  Assets = Liabilities + Stockholders equity
     */
    public static float Assets(float liabilites, float StockEquity)
    {
        return liabilites / StockEquity;
        
    }
    
    /**
     * 
     * @param NetIncome: Net Income
     * @param StockDiv: Preferred stock dividends
     * @param CommonShares: Average common shares outstanding
     * @return Earning Per Share = (Net Income - Preferred stock dividends) / Average common shares outstanding
     */
    public static float EarningsPerShare(float NetIncome, float StockDiv, float CommonShares)
    {
        return (NetIncome - StockDiv) / CommonShares;
    }
    
    /**
     * 
     * @param CurrentAssts: Current Assets
     * @param CurrentLiabilites:  Current Liabilities
     * @return Current Ratio = Current Assets / Current Liabilities
     */
    public static float CurrentRatio(float CurrentAssts, float CurrentLiabilites)
    {
        return (CurrentAssts / CurrentLiabilites);
    }
    
    /**
     * 
     * @param TotalAssts: Total Assets
     * @param TotalLiabilites: Total Liabilities
     * @return  Debt Total Asset Ratio = Total Assets / Total Liabilities
     */
    public static float DebtTotalAssetRatio(float TotalAssts, float TotalLiabilites)
    {
        return (TotalAssts / TotalLiabilites);
    }
    
    /**
     * 
     * @param CashProvided: Cash provided by operations 
     * @param CashExpenditures: Cash Expenditures
     * @param CashDividends: Cash Dividends
     * @return Free Cash Flow = Cash provided by operations - Cash Expenditures - Cash Dividends
     */
    public static float FreeCashFlow(float CashProvided, float CashExpenditures, float CashDividends)
    { 
        return (CashProvided - CashExpenditures - CashDividends);
    }
}
