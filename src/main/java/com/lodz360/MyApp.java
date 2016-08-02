/**
 * Created by michalina on 31/07/16.
 */
package com.lodz360;

import spark.ModelAndView;
import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyApp {
    public static void main(String[] args) {

        ArrayList<User> usersList = new ArrayList<>();

        Spark.staticFileLocation("/webfiles");
        Spark.get("/signin", (request, response) -> {
            String name = request.queryParams("name");
            String age = request.queryParams("age");
            String weight = request.queryParams("weight");
            String height = request.queryParams("height");


            int ageint = Integer.parseInt(age);
            float weightflo = Float.parseFloat(weight);
            float heightflo = Float.parseFloat(height);
            User user1 = new User(name,ageint,weightflo,heightflo);

            /*int i=0;
            i = usersList.size();
            String j = i.toString();*/
            /*int i=usersList.size();
            i++;*/


/*
            usersList[i]=usersList.add(user1);
*/
            usersList.add(user1);

            user1.checkbmi();

            Map<String, Object> model = new HashMap();
            model.put("user", user1);
            model.put("checkbmi",user1.checkbmi());
            return  new ModelAndView(model, "result.html");
        }, new FreeMarkerEngine());

        System.out.println(usersList.size());
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }







    }


}
