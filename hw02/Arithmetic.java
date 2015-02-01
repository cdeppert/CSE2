// Connor Deppert
// CSE02-112
// February 1, 2015
/* This porgram takes given information about various purchases and finds the sales tax of certain items, the cost of the items before tax,
the cost of items with sales tax, the final purchase without sales tax and the final purchase including sales tax */

public class Arithmetic {
    public static void main (String [] args) {
        double taxPercent = 0.06; // PA sales tax
        
        int nSocks = 3; // number of socks
        double sockCost$ = 2.58; // cost of one pair of socks
        double ind_salesTaxSock = sockCost$ * taxPercent * 100; // obtaining individual sales tax of a pair of socks and multiplying it by 100 for further conversion
        int ind_salesTaxSockInt = (int) ind_salesTaxSock; //taking the above answer (ind_SalesTaxSock) and converting it to an integer
        double totalSalesTaxSock = nSocks * sockCost$ * taxPercent * 100; // obtaining sales tax of the whole sock purchase and mulitplying it by 100 for further conversion
        int totalSalesTaxSockInt = (int) totalSalesTaxSock; // taking the above answer (totalSalesTaxSock) and converting it to an integer
        double totalSockCost$ = ((nSocks * sockCost$) + (nSocks * sockCost$ * taxPercent)) * 100; // obtaining total sock cost with tax and multiplying it by 100 for further conversion
        int totalSockCostInt$ = (int) totalSockCost$; // taking the above answer (totalSockCost$) and making it an integer
        
        int nGlasses = 6; // number of drinking glasses
        double glassCost$ = 2.29; // cost of one drinking glass 
        double ind_salesTaxGlass = glassCost$ * taxPercent * 100; // obtaining individual sales tax of a glass and mulitplying it by 100 for further conversion
        int ind_salesTaxGlassInt = (int) ind_salesTaxGlass; // taking the above answer (ind_salesTaxGlass) and converting it to an integer
        double totalSalesTaxGlass = nGlasses * glassCost$ * taxPercent * 100; // obtaining sales tax of the whole glass purchase and mulitplying it by 100 for further conversion
        int totalSalesTaxGlassInt = (int) totalSalesTaxGlass; // taking the above answer (totalSalesTaxGlass) and converting it to an integer
        double totalGlassCost$ = ((nGlasses * glassCost$) + (nGlasses * glassCost$ * taxPercent)) * 100; // obtaining total glasses cost with tax and multiplying it by 100 for further conversion
        int totalGlassCostInt$ = (int) totalGlassCost$; // taking the above answer (totalGlassCost$) and converting it to an integer
        
        int nEnvelopes = 1; // number of boxes of enevelopes
        double envelopeCost$ = 3.25; // cost of one box of enevelopes
        double ind_salesTaxEnvelope = envelopeCost$ * taxPercent * 100; // obtaining individual sales tax of a box of envelopes and multipyling it by 100 for further conversion
        int ind_salesTaxEnvelopeInt = (int) ind_salesTaxEnvelope; // taking the above answer (ind_saleTaxEnvelope) and converting it to an integer
        double totalSalesTaxEnvelope = nEnvelopes * envelopeCost$ * taxPercent * 100; // obtaining sales tax of whole envelope purchase and multiplying it by 100 for further conversion
        int totalSalesTaxEnvelopeInt = (int) totalSalesTaxEnvelope; // taking the above answer (totalSalesTaxEnvelope) and converting it to an integer
        double totalEnvelopeCost$ = ((nEnvelopes * envelopeCost$) + (nEnvelopes * envelopeCost$ * taxPercent)) * 100; // obtaining total envelope cost with tax and multiplying it by 100 for further conversion
        int totalEnvelopeCostInt$ = (int) totalEnvelopeCost$; // taking the above answer (totalEnvelopeCost$) and converting it to an integer
  
        System.out.println("Socks");
        System.out.println(nSocks+" pairs of socks are being bought"); // number of socks being bought
        System.out.println("Each pair of socks costs $"+sockCost$+" and has a sales tax of $"+(ind_salesTaxSockInt/100.0)); // price of one pair of socks and the tax for each pair and dividing it by 100.0 to get a decimal
        System.out.println("The total cost of the socks before tax is $"+(nSocks * sockCost$)+"."+" They have a sales tax of $"+(totalSalesTaxSockInt/100.0)+
            " producing a final total of $"+(totalSockCostInt$/100.0)); // produces total cost of socks before tax, the tax of the whole sock purchase, and the final total including tax (dividing by 100.0 to get a decimal)
   
        System.out.println("Drinking Glasses");
        System.out.println(nGlasses+" drinking glasses are being bought"); // number of drinking glasses being bought
        System.out.println("Each drinking glass costs $"+glassCost$+" and has a sales tax of $"+(ind_salesTaxGlassInt/100.0)); // price of one drinking glass and the tax for each glass and dividing by 100.0 to produce a decimal
        System.out.println("The total cost of the drinking glasses before tax is $"+(nGlasses * glassCost$)+"."+" They have a sales tax of $"+(totalSalesTaxGlassInt/100.0)+
            " producing a final total of $"+(totalGlassCostInt$/100.0)); // produces total cost of glasses before tax, the tax of the whole glasses purchase, and the final total including tax (dividing by 100.0 produces a decimal)
        
        System.out.println("Box of Envelopes");
        System.out.println(nEnvelopes+" box of envelopes is being bought"); // number of boxes of envelopes being bought
        System.out.println("Each box of envelopes costs $"+envelopeCost$+" and has a sales tax of $"+(ind_salesTaxEnvelopeInt/100.0)); // price of one box of envelopes and the tax for each box and dividing it by 100.0 to get a decimal
        System.out.println("The total cost of the envelope purchase before tax is $"+(nEnvelopes * envelopeCost$)+"."+" They have a sales tax of $"+(totalSalesTaxEnvelopeInt/100.0)+
            " producing a final total of $"+(totalEnvelopeCostInt$/100.0)); // produces total cost of envelopes before tax, the tax of the whole envelope purchase, and the final total including tax (dividing by 100.0 produces a decimal)
        
        System.out.println("Total Purchase");
        System.out.println("The total cost of all the purchases before sales tax is $"+((nSocks * sockCost$)+(nGlasses * glassCost$)+(nEnvelopes * envelopeCost$))); // total cost of all the purchases before sales tax
        System.out.println("The total sales tax for all the purchases is $"+((totalSalesTaxSockInt+totalSalesTaxGlassInt+totalSalesTaxEnvelopeInt)/100.0)); // total sales tax for the whole purchase and dividing it by 100.0 to get a decimal
        System.out.println("The total cost of all the purchases including sales tax is $"+((totalSockCostInt$+totalGlassCostInt$+totalEnvelopeCostInt$)/ (100.0))); // total cost of all the purchases including sales tax and dividing it by 100.0 to get a decimal
   
        // All divisions by 100.0 are necessary to get a decimal ending after two decimal places 
    }
}