package quartz.mess;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created with IntelliJ IDEA.
 * User: pain
 * Date: 06/06/13
 * Time: 2:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("Hello World");

    }
}
