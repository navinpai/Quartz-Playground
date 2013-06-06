package quartz.mess;

import org.quartz.*;
import org.quartz.impl.StdScheduler;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: pain
 * Date: 06/06/13
 * Time: 2:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloTrigger {
    public static void main(String args[]) throws SchedulerException {

        JobDetail jobDetail= JobBuilder.newJob(HelloJob.class).withIdentity("HelloJob").build();

        Trigger trigger= TriggerBuilder.newTrigger().withIdentity("HelloTrigger").withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?")).build();

        Scheduler scheduler=new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(jobDetail,trigger);
    }
}
