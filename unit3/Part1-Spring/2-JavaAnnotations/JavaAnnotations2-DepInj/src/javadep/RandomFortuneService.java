package javadep;

@Component
public class RestFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Rest today";
    }
}

// Qualifier Example
    // RandomFortuneService, HappyFortuneService, DatabaseFortuneService and RestFortuneService all implement FortuneService
