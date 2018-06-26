package scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class ScheduledTasks {

	@Autowired
    public MyScheduler schedule;
    
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
    	schedule.showStatus();
    }
}
