class Trunk_Call
{
    float dur;
    String type;
    float rate()
    {
        if(type.equals("urgent"))
        return 3.5f;
        else if(type=="lightning")
        return 2.5f;
        else
        return 2f;
    }
}
class Bill extends Trunk_Call
{
    float amount;
    Bill()
    {
        
    }
    void read()
    {
    String s;
    type="urgent";
    s="135";
    dur=Float.valueOf(s).floatValue();
    }
    void calculate()
    {
        if(dur<=1.5)
        amount=rate()*dur+1.5f;
        else if(dur<=3)
        amount=rate()*dur+2.5f;
        else if(dur<=5)
        amount=rate()*dur+4.5f;
        else
        amount=rate()*dur+5f;
    }
    void print()
    {
        System.out.println("\n TOTAL BILL");
        System.out.println("\n CALL TYPE:"+type);
        System.out.println("\n DURATION"+dur);
        System.out.println("\n AMOUNT:"+amount);
    }
}
class TC
{
    public static void main(String arg[])
    {
        Bill b=new Bill();
        b.read();
        b.calculate();
        b.print();
    
    }
}