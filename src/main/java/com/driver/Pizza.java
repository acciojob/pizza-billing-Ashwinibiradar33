package com.driver;

public class Pizza {
    private String bill;
    private int totalprice;
    private final int CheesePrice;
    private final int PaperBagPrice;
    private final int ToppingPrice;


private Boolean isBillGenerated;
    private Boolean isCheeseAdded;
    private Boolean isToppingsAdded;
    private Boolean isPaperBagAdded;

    public Pizza(Boolean isVeg){
        // your code goes here
        int baseprice;
        if(isVeg){
            baseprice =300;
            ToppingPrice=70;
        }
        else{
            baseprice =400;
            ToppingPrice=120;

        }
        CheesePrice=80;
        PaperBagPrice=20;
        totalprice= baseprice;
        bill="Base Price Of The Pizza"+ baseprice +"\n";
    }

    public int getPrice(){

        return this.totalprice;
    }

    public void addExtraCheese() {
        // your code goes here
        if (!isCheeseAdded) {
            isCheeseAdded = true;
            totalprice = totalprice + CheesePrice;
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (!isToppingsAdded) {

            totalprice = totalprice + ToppingPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway() {
                // your code goes here
                if (!isPaperBagAdded) {
                    isPaperBagAdded = true;
                    totalprice = totalprice + PaperBagPrice;
                }
            }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            isBillGenerated=true;
            if (isCheeseAdded)
                bill = bill + "Extra Cheese Added:" + CheesePrice+"\n";
            if (isToppingsAdded)
                bill = bill + "Extra Toppings Added:" + ToppingPrice+"\n";
            if (isPaperBagAdded)
                bill = bill + "Paperbag Added::" + PaperBagPrice+"\n";
            bill=bill+"Total Price:"+totalprice+"\n";
        }
        return this.bill;
    }
}
