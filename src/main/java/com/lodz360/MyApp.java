/**
 * Created by michalina on 31/07/16.
 */
package com.lodz360;

import spark.ModelAndView;
import spark.Spark;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;

public class MyApp {
    public static void main(String[] args) {
        User me = new User ("Michalina", 29, 54,169);
        System.out.println(me.toString());
        System.out.println("Mam nowy pomysł na appkę, będzie ona sprawdzała czy człowiek ma zbilansowaną dietę, podajemy co zjedliśmy a appka podpowiada nam, że np 'nie jedź więcej czerwonego mięsa w tym tyodniu' i podpowiada przepis na kurczaka:D");
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

            float bmi;
            bmi = weightflo/(heightflo*heightflo);

            Map<String, Object> model = new HashMap();
            model.put("bmi", bmi);
            model.put("user", user1);
            return  new ModelAndView(model, "result.ftl");
        }, new FreeMarkerEngine());








    }


}
