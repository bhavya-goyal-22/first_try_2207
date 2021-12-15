import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;

public class DDLJ
{
    private String s = "";

    TimerTask task = new TimerTask()
    {
        public void run()
        {
            if( s.equals("") )
            {
                System.out.println( " Better Luck Next Time!" );
                System.exit( 0 );
            }
        }
    };

    public void getInput() throws Exception
    {
        Timer timer = new Timer();
        timer.schedule( task, 60*1000 );

        System.out.println( "answer this question in 1 minute:\nwho was india's first president?" );
        BufferedReader in = new BufferedReader(
        new InputStreamReader( System.in ) );
        s = in.readLine();

        timer.cancel();
        System.out.println( "CONGRATULATIONS!");
    }

    public static void main( String[] args )
    {
        try
        {
            (new DDLJ()).getInput();
        }
        catch( Exception e )
        {
            System.out.println( e );
        }
    }
}