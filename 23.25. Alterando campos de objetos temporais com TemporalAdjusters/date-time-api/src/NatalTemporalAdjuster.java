import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class NatalTemporalAdjuster implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.with(ChronoField.DAY_OF_MONTH, 25)
                .with(ChronoField.MONTH_OF_YEAR, 12);
    }

}
