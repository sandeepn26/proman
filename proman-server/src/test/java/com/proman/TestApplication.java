package com.proman;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proman.server.MyApplication;
import com.proman.server.config.AppConfiguration;

/**
 *
 * @author bytesTree
 * @see <a href="http://www.bytestree.com/">BytesTree</a>
 *
 */
public class TestApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = null;
        try {
            context = new AnnotationConfigApplicationContext(AppConfiguration.class);
            MyApplication application = context.getBean(MyApplication.class);

            application.performDbTasks();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            context.close();
        }
    }
}
