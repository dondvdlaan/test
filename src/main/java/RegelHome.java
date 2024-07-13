import java.time.LocalDateTime;

public class RegelHome implements IDateTimeProvider {

    LocalDateTime localDateTime;
    @Override
    public LocalDateTime getLocalDateTime() {
        return this.localDateTime;
    }

    public RegelHome(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
