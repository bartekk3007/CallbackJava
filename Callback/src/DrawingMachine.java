import java.util.Random;
import java.util.function.IntConsumer;

public class DrawingMachine
{
    private Random random;
    public DrawingMachine()
    {
        random = new Random();
    }
    public void play(IntConsumer intConsumer)
    {
        while(true)
        {
            int number = random.nextInt(100);
            if(number % 7 == 0)
            {
                intConsumer.accept(number);
            }
        }
    }
}