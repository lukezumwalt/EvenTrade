package app;

import java.util.ArrayList;

public class RequestFactory {
    public String getActionRequestString(String _action, ArrayList<String> items){
        
        String retVal = "[{\"action\":\"";
        retVal += _action;
        retVal += "\",\"data\":{\"eventId\":\"";
        retVal += items.get(0);
        retVal += "\",\"eventName\":\"";
        retVal += items.get(1);
        retVal += "\",\"currency\":\"";
        retVal += items.get(2);
        retVal += "\"}}]";
        
        return retVal;
    }
}
