import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class MarsParser
{
    public static void main(String[] args) {
        String data = "{\n" +
                "  \"804\": {\n" +
                "    \"First_UTC\": \"2021-03-01T10:42:18Z\", \n" +
                "    \"Last_UTC\": \"2021-03-02T08:18:38Z\", \n" +
                "    \"Month_ordinal\": 12, \n" +
                "    \"Northern_season\": \"late winter\", \n" +
                "    \"PRE\": {\n" +
                "      \"av\": 721.59, \n" +
                "      \"ct\": 162240, \n" +
                "      \"mn\": 704.3942, \n" +
                "      \"mx\": 741.402\n" +
                "    }, \n" +
                "    \"Season\": \"winter\", \n" +
                "    \"Southern_season\": \"late summer\", \n" +
                "    \"WD\": {\n" +
                "      \"most_common\": null\n" +
                "    }\n" +
                "  }, \n" +
                "  \"sol_keys\": [\n" +
                "    \"804\"\n" +
                "  ], \n" +
                "  \"validity_checks\": {\n" +
                "    \"802\": {\n" +
                "      \"PRE\": {\n" +
                "        \"sol_hours_with_data\": [\n" +
                "          19, \n" +
                "          20, \n" +
                "          21, \n" +
                "          22, \n" +
                "          23\n" +
                "        ], \n" +
                "        \"valid\": false\n" +
                "      }\n" +
                "    }, \n" +
                "    \"803\": {\n" +
                "      \"PRE\": {\n" +
                "        \"sol_hours_with_data\": [\n" +
                "          0, \n" +
                "          1, \n" +
                "          2, \n" +
                "          3, \n" +
                "          4, \n" +
                "          5, \n" +
                "          6, \n" +
                "          7, \n" +
                "          8, \n" +
                "          9, \n" +
                "          10, \n" +
                "          11, \n" +
                "          12, \n" +
                "          13, \n" +
                "          14, \n" +
                "          15, \n" +
                "          16\n" +
                "        ], \n" +
                "        \"valid\": false\n" +
                "      }\n" +
                "    }, \n" +
                "    \"804\": {\n" +
                "      \"PRE\": {\n" +
                "        \"sol_hours_with_data\": [\n" +
                "          3, \n" +
                "          4, \n" +
                "          5, \n" +
                "          6, \n" +
                "          7, \n" +
                "          8, \n" +
                "          9, \n" +
                "          10, \n" +
                "          11, \n" +
                "          12, \n" +
                "          13, \n" +
                "          14, \n" +
                "          15, \n" +
                "          16, \n" +
                "          17, \n" +
                "          18, \n" +
                "          19, \n" +
                "          20, \n" +
                "          21, \n" +
                "          22, \n" +
                "          23\n" +
                "        ], \n" +
                "        \"valid\": true\n" +
                "      }\n" +
                "    }, \n" +
                "    \"805\": {\n" +
                "      \"PRE\": {\n" +
                "        \"sol_hours_with_data\": [\n" +
                "          0, \n" +
                "          1, \n" +
                "          2, \n" +
                "          3, \n" +
                "          4, \n" +
                "          5, \n" +
                "          6, \n" +
                "          7\n" +
                "        ], \n" +
                "        \"valid\": false\n" +
                "      }\n" +
                "    }, \n" +
                "    \"sol_hours_required\": 18, \n" +
                "    \"sols_checked\": [\n" +
                "      \"802\", \n" +
                "      \"803\", \n" +
                "      \"804\", \n" +
                "      \"805\"\n" +
                "    ]\n" +
                "  }\n" +
                "}";
        try
        {
            JSONParser parser = new JSONParser();
            JSONObject simpleJSONObject = (JSONObject) parser.parse(data);
        }catch(Exception e)
        {
            System.out.println("Ooops, an error occured!");
        }
    }
}
