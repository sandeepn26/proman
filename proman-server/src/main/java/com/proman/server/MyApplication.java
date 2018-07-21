package com.proman.server;

import com.proman.server.model.User;
import com.proman.server.service.UserService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 *
 * @author bytesTree
 * @see <a href="http://www.bytestree.com/">BytesTree</a>
 *
 */
@Component
public class MyApplication {

    final static Logger logger = Logger.getLogger(MyApplication.class);

    @Autowired
    private UserService userService;

    public void performDbTasks() {
      /*  Employee empNew = new Employee(8l, "ttt", "aata", "Senior ttt", 2000);

        // Save new employee
        empService.addNewEmployee(empNew);

        // Get saved employee
        Employee employee = empService.getEmployee(empNew.getId());
        logger.debug("Retrieving saved employee " + employee);*/

        // User user = new User("tesusername", "testpwd", 0, true, true, new Date(), "testuser");

        // userService.saveUser(user);
        System.out.println(userService.getUser(1).getEnabled());

    }

}
