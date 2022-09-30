package javadep;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return null;
    }
}

// Qualifier Example
    // RandomFortuneService, HappyFortuneService, DatabaseFortuneService and all implement FortuneService
