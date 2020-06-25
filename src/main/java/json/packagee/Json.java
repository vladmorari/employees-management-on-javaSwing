package json.packagee;

import com.mycompany.employee.employe.Employee;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
//import java.text.ParseException;
import java.util.ArrayList;
//import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class Json {

    public void writeToJsonFile(ArrayList<Employee> employees) {
        System.out.println("Writing JSON ----------");
        JSONArray list = new JSONArray();

        for (Employee emp : employees) {
            JSONObject obj = new JSONObject();
            obj.put("name", emp.getName());
            obj.put("surename", emp.getSurename());
            list.add(obj);
        }
        System.out.print(list);

        try (FileWriter file = new FileWriter("C:\\Users\\HESOYAM\\Desktop\\Step.json")) {
            file.write(list.toJSONString());
        } catch (IOException e) {
            System.out.println("Could not write to JSON. Reason: " + e.getMessage());
        }
    }

    public void convertFromJson() {
        System.out.println("\n\nReading JSON ----------");
        try (
                Reader reader = new FileReader("C:\\Users\\HESOYAM\\Desktop\\Step.json")) {

            JSONParser parser = new JSONParser();

            JSONArray jsonArr = (JSONArray) parser.parse(reader);

            //  System.out.println(jsonArr); afiseaza intreg jsonul
            for (int i = 0; i < jsonArr.size(); i++) {
                JSONObject employeeJson = (JSONObject) jsonArr.get(i);
                System.out.println("Name: " + employeeJson.get("name"));
                // Create new employee with the data 
                // Employee emp = new Employee(employeeJson.get("name");
            }

        } catch (IOException e) {
            System.out.println("Could not read JSON. Reason: " + e.getMessage());
        } catch (ParseException e) {
            System.out.println("Could not parse JSON. Reason: " + e.getMessage());
        }
    }
}
