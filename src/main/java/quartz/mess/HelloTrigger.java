package quartz.mess;

import org.quartz.*;
import org.quartz.impl.StdScheduler;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: pain
 * Date: 06/06/13
 * Time: 2:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloTrigger {
   public static void main(String args[]) {
       ApplicationContext ctx = new ClassPathXmlApplicationContext("/application-context.xml");
    }
}
