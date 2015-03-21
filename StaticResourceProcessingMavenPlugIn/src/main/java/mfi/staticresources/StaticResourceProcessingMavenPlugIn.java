package mfi.staticresources;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo( name = "StaticResourceProcessingMavenPlugIn")
public class StaticResourceProcessingMavenPlugIn   extends AbstractMojo  {

    public void execute() throws MojoExecutionException
    {
        getLog().info( "Hello, StaticResourceProcessingMavenPlugIn." );
    }
}
 