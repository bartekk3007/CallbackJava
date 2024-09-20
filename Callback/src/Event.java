
import java.util.function.IntConsumer;

public class Event implements IntConsumer
{
    @Override
    public void accept(int number)
    {
        System.out.println("This " + number + " is divisible by seven");
    }
}