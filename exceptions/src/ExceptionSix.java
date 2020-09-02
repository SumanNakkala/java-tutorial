
class Amount{



    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Amount{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }

    public void add(Amount a) throws CurrenciesNotMatchedException {

        if(this.currency.equalsIgnoreCase(a.currency))
            this.amount = this.amount + a.amount;
        else
        {
            throw new CurrenciesNotMatchedException("Currencies did notmatch");
        }

    }
}


class CurrenciesNotMatchedException extends RuntimeException
{

    public CurrenciesNotMatchedException(String msg){
        super(msg);
    }
}


public class ExceptionSix {

    public static void main(String[] args) {

        Amount one = new Amount("USD",10);
        Amount two = new Amount("INR",20);

        System.out.println(one);
        try {
            one.add(two);
            System.out.println(one);
        } catch (CurrenciesNotMatchedException e) {
            e.printStackTrace();
        }





    }
}
