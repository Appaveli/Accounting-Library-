/*
 *  Calculates different Budget Planning formulas
 */
package EssentialAccounting;

/**
 *
 * @author dominque
 */
public class BudgetPlanning 
{
    /**
     * 
     * @param SalesUnits: Budgeted sales units
     * @param EndingGoods: Desired ending finished goods
     * @param BegGoods:  Beginning finished goods
     * @return Required Production Units = Budgeted sales units + Desired ending finished goods - Beginning finished goods
     */
    public static float RequiredProductionUnits(float SalesUnits, float EndingGoods, float BegGoods)
    {
        return (SalesUnits + EndingGoods) - BegGoods;
    }
    
    /**
     * 
     * @param DirectMaterials: Direct materials required for production
     * @param EndingGoods: Desired ending finished goods units
     * @param BegGoods: Beginning finished goods units
     * @return   Required Direct Materials Purchased = Direct materials required for production 
     * + Desired ending finished goods units - Beginning finished goods units 

     */
    public static float RequiredDirectMaterialsPurch(float DirectMaterials, float EndingGoods, float BegGoods)
    {
        return (DirectMaterials + EndingGoods) - BegGoods;
    }
    
    /**
     * 
     * @param GoodsCost: Budget cost of goods sold
     * @param EndingInventory: Desired ending merchandise inventory
     * @param BegInventory: Beginning merchandise inventory
       @return Required Merchandise Purchased = Budget cost of goods sold + Desired ending merchandise inventory - Beginning merchandise inventory
     */
    public static float RequiredMerchandisePurchased(float GoodsCost, float EndingInventory, float BegInventory)
    {
        return (GoodsCost + EndingInventory) - BegInventory;
    }
    /**
     * 
     * @param UnitsProduced: Units to be produced
     * @param UnitTime: Direct labor time per unit
     * @param LaborCost: Direct labor per cost
     * @return  Total Direct Labor Cost = Units to be produced * Direct labor time per unit * Direct labor per cost
     */
    public static float TotalDirectLaborCost(float UnitsProduced, float UnitTime, float LaborCost)
    {
        return (UnitsProduced *  UnitTime * LaborCost);
    }
    
    
    
}
