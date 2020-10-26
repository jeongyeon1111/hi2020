package com.test.jy001;

import org.json.simple.JSONObject;

/*import org.json.simple.JSONObject;*/

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	JSONObject jobj = new JSONObject();
    	jobj.put("이름","정연");
    	System.out.println(jobj);
        System.out.println( "Hello World!" );
    }
}
