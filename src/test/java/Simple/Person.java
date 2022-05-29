package Simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {
    public static void main(String[] args) {


        List<Map<String,Object>> queryData = new ArrayList<>();


        Map<String,Object> row1 = new HashMap<>();
        row1.put("first_name","Steven");
        row1.put("last_name","King");
        row1.put("job_id","AD_PRES");
        Map<String,Object> row2 = new HashMap<>();
        row2.put("first_name","Neena");
        row2.put("last_name","Kochhar");
        row2.put("job_id","AD_VP");

        Map<String,Object> row3 = new HashMap<>();
        row3.put("first_name","Jon");
        row3.put("last_name","Kochhar");
        row3.put("job_id","AD_VP");

        Map<String,Object> row4 = new HashMap<>();
        row4.put("first_name","Jon");
        row4.put("last_name","Dan");
        row4.put("job_id","AD_VP");



        queryData.add(row1);
        queryData.add(row2);
        queryData.add(row3);
        queryData.add(row4);

        System.out.println(queryData);


       // System.out.println(queryData.get(0).get("last_name"));
        for (int i = 0; i <3 ; i++) {

            if(queryData.get(i).get("last_name")==queryData.get(i+1).get("last_name")){

                System.out.println(queryData.get(i));
                System.out.println(queryData.get(i+1));



            }

        }







    }

}
