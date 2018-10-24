package io.api.springboot.hello;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import java.util.Iterator;
import java.io.IOException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String sayHi()
	{
		return "hiiii";
	}
	@RequestMapping("/BI tools")
	public JSONObject jsonTest()
	{
		JSONObject jsonObject = null ;
		JSONParser parser = new JSONParser();
        try {

            Object obj = parser.parse(new FileReader("lib/test.json"));
            jsonObject = (JSONObject) obj;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        finally {
        	return jsonObject;
        }
    }
           
		
		 //return jsonObject;
		
	}


