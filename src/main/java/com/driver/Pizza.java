package com.driver;

public class Pizza {

    private int CheesePrice;
    private int PaperBagPrice;
    private int ToppingPrice;
    private int baseprice;
    private int totalprice;
    private Boolean isVeg;
    private String bill;
private Boolean isBillGenerated;
    private Boolean isCheeseAdded;
    private Boolean isToppingsAdded;
    private Boolean isPaperBagAdded;

    public Pizza(Boolean isVeg){
this.isVeg=isVeg;
        // your code goes here
        if(isVeg==true){
            baseprice=300;
            ToppingPrice=70;
        }
        else{
            baseprice=400;
            ToppingPrice=120;

        }
        CheesePrice=80;
        PaperBagPrice=20;
        totalprice=baseprice;
        bill="Base Price Of The Pizza"+ baseprice+"\n";
    }

    public int getPrice(){

        return this.totalprice;
    }

    public void addExtraCheese() {
        // your code goes here
        if (isCheeseAdded==false) {
            isCheeseAdded = true;
            totalprice = totalprice + CheesePrice;
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (isToppingsAdded==false) {
            isToppingsAdded = true;
            totalprice = totalprice + ToppingPrice;
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
