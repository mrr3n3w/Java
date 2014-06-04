/**
 * @author Jordan
 * 300219995
 */
public class CSPropertyManagement 
{
    public static void main(String[] args) 
    {
        Zone cr = new Zone("CR",123,"Commercial Retail");
        Zone co = new Zone("CO",105,"Commercial Office");
        Zone ra = new Zone("RA",201,"Residential Apartment");
        Zone rh = new Zone("RH",202,"Residential House");
        Zone hi = new Zone("HI",201,"Heavy Industrial");
        
        Property b1 = new BusinessProperty("100 Main St.", cr, 1200, 201, "Clothing Retail");
        Property b2 = new BusinessProperty("200 Foundry Dr.", hi, 32000, 100, "Manufacturing");
        Property d1 = new Apartment("300 Elm St.", ra, 1150, 2, 1.5, 1200, 907, true);
        Property d2 = new House("123 Pine St.", rh, 2200, 3, 2, 1600, 3500, "Detached");
        Property d3 = new Apartment("986 Oak St.", ra, 750, 1, 1, 1200, 302, false);
        
        System.out.println(b1);
        System.out.println("\n"+b2);
        System.out.println("\n"+d1);
        System.out.println("\n"+d2);
        System.out.println("\n"+d3);
    }
}