/*
 Calculates different Budget Control formulas
 */
package EssentialAccounting;

/**
 *
 * @author dominque
 */
public class BudgetControl 
{
    /**
     * 
     * @param ControlMargin: Controllable Margin
     * @param OperatingAssets: Average operating assets
     * @return Return On Investment = Controllable Margin / Average operating assets
     */
    public static float ROI(float ControlMargin, float OperatingAssets)
    {
        return (ControlMargin / OperatingAssets);
    }
    
    /**
     * 
     * @param ControlMargin: Controllable Margin
     * @param RateReturn: Minimum rate of return
     * @param OperatingAsset: Average operating assets
     * @return Residual Income = Controllable Margin - Minimum rate of return * Average operating assets
     */
    public static float ResidualIncome(float ControlMargin, float RateReturn, float OperatingAsset)
    {
        return ControlMargin -(RateReturn * OperatingAsset);
    }
    
}
