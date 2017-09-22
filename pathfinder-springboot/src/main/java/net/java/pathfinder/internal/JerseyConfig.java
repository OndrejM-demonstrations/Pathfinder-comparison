package net.java.pathfinder.internal;

import javax.ws.rs.ApplicationPath;
import net.java.pathfinder.api.GraphTraversalService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("/rest")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(GraphTraversalService.class);
    }
}