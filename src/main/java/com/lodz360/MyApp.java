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
            User user = new User(name,ageint,weightflo,heightflo);

            usersList.add(user);
            System.out.println(usersList);
            System.out.println(usersList.size());

            Map<String, Object> model = new HashMap();
            model.put("user", user);
            model.put("checkbmi",user.checkbmi());
            model.put("userListAsString", usersList.toString());
            return  new ModelAndView(model, "result.ftl");
        }, new FreeMarkerEngine());


    }


}
