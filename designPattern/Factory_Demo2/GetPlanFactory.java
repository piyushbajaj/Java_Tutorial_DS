package designPattern.Factory_Demo2;

/**
 * Created by piyush.bajaj on 27/11/16.
 */
public class GetPlanFactory {

    public Plan getPlan(String plantype){

        if(plantype == null)
            return null;

        else if(plantype.equalsIgnoreCase("DOMESTICPLAN"))
            return new Domestic();

        else if(plantype.equalsIgnoreCase("COMMERCIALPLAN"))
            return new Commercial();

        else if(plantype.equalsIgnoreCase("INSTITUTIONALPLAN"))
            return new Institutional();

        return null;

    }

}
