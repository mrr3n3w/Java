//300219995
//Jordan Rowe

public class Invoice {
    

    String partNumber;
    String partName;
    int units;
    double pricePer;
    double invoice;

    
    public Invoice(String partN, String partD , double cost , int unitsin)
    {
        partNumber = partN;
        partName = partD;
        pricePer = cost;
        units = unitsin;
        
    }
            
            
            
    public double getInvoiceAmount()
    {
        invoice = units * pricePer;
        return invoice;
        
    }
    
    public void setCost(double cost)
    {
        pricePer = cost;
    }
    public void setUnits(int partA)
    {
       units = partA;
    }
    
    public void printInvoice()
    {
        System.out.printf("The Part Number is:%s\n", 
                getPartNumber());
        System.out.printf("The Part Description:%s\n", 
                getPartName());
        System.out.printf("The Amount of %s is %d\n", 
                getPartName(), getPartAmount());
        System.out.printf("The total is: $%.2f\n",
                getInvoiceAmount());
    }
    
    public void setPartN(String partn)
    {
        partNumber = partn;
    }
    
    public void setPartD(String partd)
    {
        partName = partd;
    }
    
    public String getPartName()
    {
        return partName;
    }
    
    public String getPartNumber()
    {
        return partNumber;
    }
    
    public Double getPartCost()
    {
        return pricePer;
    }
    
    public int getPartAmount()
    {
        return units;
    }
}
