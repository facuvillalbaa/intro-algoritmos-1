/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    
    //Constructor
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    
    //Metodo (Consulta)
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    
    //Metodo (Consulta)
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     */
    
    //Metodo (Comando)
    public void insertMoney(int amount)
    {
        if(amount > 0){
        balance = balance + amount;
        }else{
        balance = balance;
        }
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    
    //Metodo (Comando)
    public void printTicket(int remaining)
    {   
        remaining = balance - price;
        
        if(balance >= price){
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();
        System.out.println("Remaining balance = "+remaining);
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = remaining;
        }else{
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Insufficient Balance");
        System.out.println("# Balance = "+ balance);
        System.out.println("##################");
        System.out.println();
        }
    }
    
    public void requestBalance(){
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Your balance = "+balance);
        System.out.println("##################");
        System.out.println();
    }
}
