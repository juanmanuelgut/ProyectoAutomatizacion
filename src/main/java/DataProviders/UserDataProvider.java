package DataProviders;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.testng.annotations.DataProvider;
import pojo.RegisterData;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class UserDataProvider {

    @DataProvider(name="getDataFromJSON")
    public Object[][] getDataFromJSON() throws FileNotFoundException{

        JsonElement jsonData = JsonParser.parseReader(new FileReader("src/test/DataFiles/UserData.json"));
        JsonElement registerDataSet = jsonData.getAsJsonObject().get("Users");
        List<RegisterData> registerData = new Gson().fromJson(registerDataSet,new TypeToken<List<RegisterData>>(){}.getType());
        Object[][] returnValue = new Object[registerData.size()][];
        int index = 0;

        for (Object[] each: returnValue){
            each[0] = registerData.get(index++);
        }
        return returnValue;
    }

}
