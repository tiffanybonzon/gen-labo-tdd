package BookExample.code;

import java.util.Hashtable;

public class Bank {
    private Hashtable rates = new Hashtable();

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public int rate(String from, String to) {
        return (from.equals("CHF") & to.equals("USD")) ? 2 : 1;
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), new Integer(rate));
    }
}
