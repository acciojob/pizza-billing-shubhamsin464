package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingsPrice;
    private int takeAwayPrice;
    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.cheesePrice=80;
        this.takeAwayPrice=20;
        if(isVeg){
            this.price=300;
            this.toppingsPrice=70;
        }else{
            this.price=400;
            this.toppingsPrice=120;
        }
        this.isCheeseAdded=false;
        this.isTakeAwayAdded=false;
        this.isToppingsAdded=false;

        this.bill="Base Price Of The Pizza:"+this.price;
    }

    public int getPrice(){
        return this.price;


    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
           this.price=this.price+this.cheesePrice;
           isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            this.price=this.price+this.toppingsPrice;
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAwayAdded){
            this.price=this.price+this.takeAwayPrice;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
        if(isCheeseAdded){
          this.bill="Extra Cheese Added:"+this.cheesePrice+"\n";
        }
        if(isToppingsAdded){
            this.bill="Extra Toppings Added:"+this.toppingsPrice+"\n";
        }
        if(isTakeAwayAdded){
            this.bill="Paperbag Added:"+this.takeAwayPrice+"\n";
        }
        this.bill=this.bill+"Total Price:"+this.price+"\n";
        isBillGenerated=true;
        }
        return this.bill;
    }
}
