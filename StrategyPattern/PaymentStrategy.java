// defining strategy interface

interface PaymentStrategy{
    void pay(int amount);
}

// concrete strategies classes

class PayPal implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("Paid "+ amount + " to PayPal");
    }
}

class GPay implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("Paid "+ amount + " to Gpay");
    }
}

class PhonePe implements PaymentStrategy{
    public void pay(int amount){
        System.out.println("Paid "+ amount + " to PhonePe");
    }
}

// context class

class PaymentContext{
    private PaymentStrategy strategy;
    
    PaymentContext(PaymentStrategy strategy){
        this.strategy=strategy;    
    }
    
    public void setPaymentStrategy(PaymentStrategy strategy){
        this.strategy=strategy;
    }
    
    public void executePayment(int amount){
        strategy.pay(amount);
    }
}

// client code

public class Main{
    public static void main (String[] args){
        PaymentContext context=new PaymentContext(new PayPal());
        context.executePayment(1000);
        context.setPaymentStrategy(new PhonePe());
        context.executePayment(2000);
        context.setPaymentStrategy(new GPay());
        context.executePayment(3000);
    }
}
