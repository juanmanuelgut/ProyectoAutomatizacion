package DataProviders;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.testng.annotations.DataProvider;
import pojo.CurrencyData;
import pojo.ProductData;
import pojo.RegisterData;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class UserDataProvider {//autor:  Juan Gutiérrez

    @DataProvider(name="getDataFromJSON")
    public Object[][] getDataFromJSON() throws FileNotFoundException{

        JsonElement jsonData = JsonParser.parseReader(new FileReader("src/main/java/DataFiles/UserData.json"));
        JsonElement registerDataSet = jsonData.getAsJsonObject().get("Users");
        List<RegisterData> registerData = new Gson().fromJson(registerDataSet,new TypeToken<List<RegisterData>>(){}.getType());
        Object[][] returnValue = new Object[registerData.size()][1];
        int index = 0;

        for (Object[] each: returnValue){
            each[0] = registerData.get(index++);
        }
        return returnValue;
    }

    @DataProvider(name="getCurrencyFromJSON")
    public Object[][] getCurrencyFromJSON() throws FileNotFoundException{
        JsonElement jsonData = JsonParser.parseReader(new FileReader("src/main/java/DataFiles/CurrencyData.json"));
        JsonElement currencyDataSet = jsonData.getAsJsonObject().get("Currencies");
        List<CurrencyData> currencyData = new Gson().fromJson(currencyDataSet,new TypeToken<List<CurrencyData>>(){}.getType());
        Object[][] returnValue = new Object[currencyData.size()][1];
        int index = 0;

        for (Object[] each: returnValue){
            each[0] = currencyData.get(index++);
        }
        return returnValue;
    }

    @DataProvider(name="getProductsFromJSON")
    public Object[][] getProductsFromJSON() throws FileNotFoundException{
        JsonElement jsonData = JsonParser.parseReader(new FileReader("src/main/java/DataFiles/ProductData.json"));
        JsonElement productDataSet = jsonData.getAsJsonObject().get("Products");
        List<ProductData> productData = new Gson().fromJson(productDataSet,new TypeToken<List<ProductData>>(){}.getType());
        Object[][] returnValue = new Object[productData.size()][1];
        int index = 0;

        for (Object[] each: returnValue){
            each[0] = productData.get(index++);
        }
        return returnValue;
    }


}
