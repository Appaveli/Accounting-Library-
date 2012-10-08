/*
 * Calulates diffent pricing formulas
 */
package EssentialAccounting;

/**
 *
 * @author dominque
 */
public class Pricing 
{
    /**
     * 
     * @param MarketPrice: Market Price
     * @param DesiredPrice: Desired Price
     * @return Target Cost = Market Price - Desired Price
     */
    public static float TargetCost(float MarketPrice, float DesiredPrice)
    {
        return (MarketPrice - DesiredPrice);
    }
    
    /**
     * 
     * @param Cost: cost
     * @param MarkupPercent: Markup percentage
     * @return Target Selling Price = cost + markup percentage * cost
     */
    public static float TargetSellingPrice(float Cost, float MarkupPercent)
    {
        return Cost + (MarkupPercent * Cost);
    }
    
    /**
     * 
     * @param ROIunits: Desired roi in units
     * @param UnitCost:  Total unit cost
     * @return  MarkUp Percentage = desired roi in units / total unit cost
     */
    public static float MarkPercentage(float ROIunits, float UnitCost)
    {
        return (ROIunits / UnitCost);
    }
    
}
