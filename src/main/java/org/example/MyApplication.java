package org.example;
import io.dropwizard.Application ;
import io.dropwizard.setup.Environment;
import org.example.resources.MyResource;

public class MyApplication extends Application<MyConfiguration>
{
    public static void main( String[] args ) throws Exception
    {
        new MyApplication().run(args);
    }

    @Override
    public void run(MyConfiguration myConfiguration, Environment environment) throws Exception {

        final MyResource myResource = new MyResource();
        environment.jersey().register(myResource);
    }
}
