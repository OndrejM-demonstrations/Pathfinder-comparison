package net.java.pathfinder.internal;

import net.java.pathfinder.api.GraphTraversalService;
import net.java.pathfinder.internal.GraphDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author steve
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = { GraphDao.class, GraphTraversalService.class })
public class PathFinderApplication {
    
    public static void main(String args[]) {
        ApplicationContext ctx = SpringApplication.run(PathFinderApplication.class, args);
    }
    
}
