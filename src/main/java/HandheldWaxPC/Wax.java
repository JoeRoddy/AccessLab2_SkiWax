package HandheldWaxPC;
public class Wax {
    private String color;
    private String variety;

    Wax(String colorArg,String varietyArg){
        this.color=colorArg;
        this.variety=varietyArg;
    }

    public String getColor(){
        return this.color;
    }

    public String getVariety(){
        return this.variety;
    }

}
