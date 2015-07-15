package nadiaklymenko.dataart18;


        import java.util.TimerTask;

/**
 * Created by Nadia on 15/07/2015.
 */
        import java.util.TimerTask;

public class StepUpdater extends TimerTask {

    GameActivity act;

    StepUpdater(GameActivity s){
        this.act = s;
    }

    @Override
    public void run() {
        act.Step();
    }

}

