package pojo;

public class ProductData { //autor:  Juan Gutiérrez

    private String name;
    private String searchString;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public ProductData(String name, String searchString) {
        this.name = name;
        this.searchString = searchString;
    }
}
