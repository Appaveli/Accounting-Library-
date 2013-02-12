/*
 * Calculates different Cost-Volume Profit formulas
 */
package EssentialAccounting;

/**
 *
 * @author dominque
 */
public class CostVolumeProfit 
{
    /**
     * 
     * @param CostChange: Change in total cost
     * @param high: High activity
     * @param low: Low activity
     * @return Variable Cost Per Unit = Change in total cost / High mines - Low activity
     */
    public static float VariableCostPerUnit(float CostChange, float high, float low)
    {
        return CostChange / (high - low);
    }
    
    /**
     * 
     * @param SellingPrice: Unit selling price
     * @param VariableCost: Unit variable cost
     * @return  Contribution Margin Per Unit = Unit selling price - Unit variable cost
     */
    public static float ContributionMarginPerUnit(float SellingPrice, float VariableCost)
    {
        return (SellingPrice - VariableCost);
    }
    
    /**
     * 
     * @param ConMarginPerUnit: Contribution Margin per unit
     * @param SellingPrice: Unit selling price
     * @return Contribution Margin Ratio = Contribution Margin per unit / Unit selling price
     */
    public static float ContributionMarginRatio(float ConMarginPerUnit, float SellingPrice)
    {
        return (ConMarginPerUnit / SellingPrice);
    }
    
    /**
     * 
     * @param VariableCost: Variable cost
     * @param FixedCost: Fixed cost
     * @param NetIncome: Net Income
     * @return  Sales = Variable cost + Fixed cost + Net Income
     */
    public static float Sales(float VariableCost, float FixedCost, float NetIncome)
    {
        return (VariableCost + FixedCost + NetIncome);
    }
    
    /**
     * 
     * @param FixedCost: Fixed cost
     * @param ConMarginPerUnit: Contribution margin per unit
     * @return Break-Even Point In Units = Fixed cost / Contribution margin per unit

     */
    public static float BreakEvenPointsUnits(float FixedCost, float ConMarginPerUnit)
    {
        return (FixedCost / ConMarginPerUnit);
    }
    
    /**
     * 
     * @param VariableCost: Variable cost
     * @param FixedCost: Fixed cost
     * @param TargetNetIncome: Target Net Income
     * @return Required Sales = Variable cost + Fixed cost + Target Net Income
     */
    public static float RequiredSales(float VariableCost, float FixedCost, float TargetNetIncome)
    {
        return (VariableCost + FixedCost + TargetNetIncome);
    }
    
    /**
     * 
     * @param FixedCost: Fixed cost
     * @param TargetNetIncome: Target Net Income
     * @param ConMarginUnit: Contribution margin per unit
     * @return Required Sales In Units = (Fixed cost + Target Net Income) / Contribution margin per unit
     */
    public static float RequiredSalesUnits(float FixedCost, float TargetNetIncome, float ConMarginUnit)
    {
        return (FixedCost + TargetNetIncome) / ConMarginUnit;
    }
    
    /**
     * 
     * @param FixedCost:  Fixed cost
     * @param TargetNetIncome: Target Net Income
     * @param ConMarginRatio: Contribution margin Ratio
     * @return Required Sales In Dollars = (Fixed cost + Target Net Income) / Contribution margin Ratio
     */
    public static float RequiredSalesDollars(float FixedCost, float TargetNetIncome, float ConMarginRatio)
    {
        return (FixedCost + TargetNetIncome) / ConMarginRatio;
    }
    
    /**
     * 
     * @param MarginSafety: Margin safety in dollars 
     * @param Sales: Actual Sales
     * @return Margin Safety In Ratio = Margin safety if dollars / Actual Sales
     */
    public static float MarginSafetyRatio(float MarginSafety, float Sales)
    {
        return (MarginSafety / Sales);
    }
    
    /**
     * 
     * @param Sales: Actual expected sales
     * @param BreakEven: Break even sales
     * @return Margin Safety In Dollars = Actual expected sales - Break even sales
     */
    public static float MarginSafetyDollars(float Sales, float BreakEven)
    {
        return (Sales - BreakEven);
    }
    
}
