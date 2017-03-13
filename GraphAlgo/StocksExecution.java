package GraphAlgo;

import java.util.HashMap;

/**
 * Created by piyush.bajaj on 13/02/17.
 */
public class StocksExecution {
    public Stocks stocksList[];

    private int stocksCount;
    private int stkCount;
    public Stocks.Company companyList[];

    //, int numOfCompanies
    public StocksExecution(int numOfStocks){
        stkCount = numOfStocks;
        stocksList = new Stocks[numOfStocks];
        //companyList = new Stocks.Company[numOfCompanies];

        stocksCount = 0;
    }

    public class Stocks {
        public int stockId;
        public String side;

        public String company_name;
        public int quantity;
        public int leftQuantity;
        public String status;


        public Stocks(int stockId, String side, String name, int quantity) {
            this.stockId = stockId;
            this.side = side;
            this.company_name = name;
            //companyList = new Company(name);
            this.quantity = quantity;
            this.leftQuantity = 0;
            this.status = "Closed";
            //flag = 0;
        }

        public class Company{
            public int flag;
            public String name;

            public Company(String name){
                this.name = name;
                this.flag = 0;
            }
        }
    }



    public void addStocks(int stockId, String side, String company, int quantity) {
        stocksList[stocksCount++] = new Stocks(stockId, side, company, quantity);
    }

    public void stockCalculation(){
        int count = 0;
        int sum = 0;
        HashMap<String, Integer> hash = new HashMap<>();
        for(Stocks list: stocksList){
            if(list.side.equalsIgnoreCase("buy")){
                if(!hash.containsKey(list.company_name)) {
                    //if(list.flag == 0){
                    list.leftQuantity = list.quantity;
                    list.status = "Open";
                    //list.flag = 1;
                    hash.put(list.company_name, list.leftQuantity);
                }
                else {

                }
                //}
            }
            else if(list.side.equalsIgnoreCase("sell")){
                //if(list.flag == 0){
                if(!hash.containsKey(list.company_name)) {
                    list.leftQuantity = list.quantity;
                    list.status = "Open";
                    // list.flag = 1;
                    // }
                    hash.put(list.company_name, list.leftQuantity);
                }
                else {
                    if(list.quantity >= hash.get(list.company_name)){

                    }
                       // hash.put()


                }
            }


//            if(list.company.equalsIgnoreCase(comp1)){
//                if(list.side.equalsIgnoreCase("buy") || list.side.equalsIgnoreCase("sell")){
//                    if(count > 0)
//                        list.leftQuantity = Math.abs()
//                    else {
//                        count++;
//                        sum += list.quantity;
//                    }
//
//                }
//            }



        }
    }

    public void stockCalculation(int stockId, String side, String compName, int quantity){

    }

    public static void main(String[] args) {
        StocksExecution SE = new StocksExecution(5);

        SE.addStocks(1, "Buy", "ABC", 10);
        SE.addStocks(2, "Sell", "XYZ", 15);
        SE.addStocks(3, "Sell", "ABC", 13);
        SE.addStocks(4, "Buy", "XYZ", 10);
        SE.addStocks(5, "Buy", "XYZ", 8);

        SE.stockCalculation();


    }


}
