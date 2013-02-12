/*
 *Calculates the different ratios use.
 */
package EssentialAccounting;

/**
 *
 * @author dominque
 */
public class RatioAnalysis 
{
    /**
     * 
     * @param CashOperations Cash provided by operations
     * @param AverageCurrentLiabilities Average Current Liabilities
     * @return Cash debt coverage ratio = Cash provided by operations / Average Current Liabilities
     */
    public static float CashDebtCoverage(float CashOperations, float AverageCurrentLiabilities)
    {
        return (CashOperations / AverageCurrentLiabilities);
    }
    
    /**
     * 
     * @param NetCreditSales Net Credit Sales
     * @param AverageNetReceiveables Average Net Receivables
     * @return  Receivable turnover ratio = Net Credit Sales / Average Net Receivables 
     */
    public static float ReceiveableTurnoverRatio(float NetCreditSales,float AverageNetReceiveables )
    {
        return (NetCreditSales / AverageNetReceiveables);
    }
    /**
     * 
     * @param days number of days for the collection period
     * @param NetCreditSales Net Credit Sales
     * @param AverageNetReceiveables AverageNetReceivable
     * @return Average Collection Period = (days / Receivable Turnover Ratio(Net Credit Sales / Average Net Receivables).
     */
    public static float AverageCollectionPeriod(float days, float NetCreditSales,float AverageNetReceiveables)
    {
        return (days / ReceiveableTurnoverRatio(NetCreditSales, AverageNetReceiveables));
    }
    /**
     * 
     * @param CostOfGoodsSold Cost of goods sold
     * @param AverageInventory Average Inventory
     * @return Inventory Turnover Ratio = Cost of goods sold / Average Inventory
     */
    public static float InventoryTurnoverRatio(float CostOfGoodsSold, float AverageInventory)
    {
        return (CostOfGoodsSold / AverageInventory);
    }
    
    /**
     * 
     * @param days number of days in Inventory
     * @param CostOfGoodsSold Cost of goods sold
     * @param AverageInventory Average Inventory
     * @return Days in Inventory = (days / Inventory Turnover Ratio = Cost of goods sold / Average Inventory)
     */
    public static float DaysinInventory(float days,float CostOfGoodsSold, float AverageInventory )
    {
        return (days / InventoryTurnoverRatio(CostOfGoodsSold, AverageInventory));
    }
    /**
     * 
     * @param NetIncome Net Income
     * @param InterestExpense Interest Expense 
     * @param TaxExpense Tax Expense 
     * @return Time Interest Earned Ratio Net Income + Interest Expense  + Tax Expense / Interest Expense 
     */
    public static float TimeInterestEarnedRatio(float NetIncome, float InterestExpense, float TaxExpense)
    {
        return (NetIncome + InterestExpense + TaxExpense) / (InterestExpense);
    }
    /**
     * 
     * @param NetSales Net Sales
     * @param AverageTotalAssets Average Total Assets
     * @return Asset Turnover Ratio = Net Sales / Average Total Assets
     */
    public static float AssetTurnoverRatio(float NetSales, float AverageTotalAssets)
    {
        return (NetSales / AverageTotalAssets);
    }
    /**
     * 
     * @param GrossProfit Gross Profit
     * @param NetSales Net Sales
     * @return Gross Profit Ratio = Gross Profit / Net Sales
     */
    public static float GrossProfitRate(float GrossProfit, float NetSales)
    {
        return (GrossProfit / NetSales);
    }
}
