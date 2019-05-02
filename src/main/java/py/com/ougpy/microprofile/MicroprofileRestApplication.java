package py.com.ougpy.microprofile;


import org.eclipse.microprofile.auth.LoginConfig;

import javax.annotation.security.DeclareRoles;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

/**
 *
 */
@ApplicationPath("/data")
@ApplicationScoped

@LoginConfig(authMethod = "MP-JWT")
@DeclareRoles({"protected"})
@OpenAPIDefinition(info = @Info(
        title = "MicroProfileSample App",
        version = "1.0.0",
        contact = @Contact(
                name ="Carlos Bustamante",
                email = "cbustamantem@gmail.com",
                url = "http://www.ougpy.com")
),
        servers = {
            @Server(url = "/", description = "localhost")
        }
)
public class MicroprofileRestApplication extends Application {
}
