package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.example.resources.MyResource;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.Response;

public class ResourceTest
{
    MyResource myResource = new MyResource() ;
    Response response ;
    @Test
    public void testMethod(){
        myResource.storeData("12 14 add 26 ");
        myResource.storeData("14 12 sub 2 ");
        response = myResource.getData();

        String actual = (String) response.getEntity();
        String expected = "12 14 add 26  " + "14 12 sub 2 " ;

        Assert.assertEquals(expected,actual);
    }
}
