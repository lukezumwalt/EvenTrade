package app;

import java.util.ArrayList;

public class RequestFactory {
    public String getActionRequestString(String _action, ArrayList<String> items){
        
        String retVal = "";

        // Switch-Case 
        switch(_action){
            case "newEvent":
                retVal = "[{\"action\":\"";
                retVal += _action;
                retVal += "\",\"data\":{\"eventId\":\"";
                retVal += items.get(0);
                retVal += "\",\"eventName\":\"";
                retVal += items.get(1);
                retVal += "\",\"currency\":\"";
                retVal += items.get(2);
                retVal += "\"}}]";
                break;

            case "updateEvent":
                retVal = "[{\"action\":\"";
                retVal += _action;
                retVal += "\",\"data\":{\"eventId\":\"";
                retVal += items.get(0);
                retVal += "\",\"eventName\":\"";
                retVal += items.get(1);
                retVal += "\",\"currency\":\"";
                retVal += items.get(2);
                retVal += "\"}}]";
                break;

            case "soldTicket":
                retVal = "[{\"action\":\"";
                retVal += _action;
                retVal += "\",\"data\":{\"eventId\":\"";
                retVal += items.get(0);
                retVal += "\",\"eventName\":\"";
                retVal += items.get(1);
                retVal += "\",\"currency\":\"";
                retVal += items.get(2);
                retVal += "\",\"ticketId\":\"";
                retVal += items.get(3);
                retVal += "\",\"price\":\"";
                retVal += items.get(4);
                retVal += "\"}}]";
                break;

            case "updateTicket":
                retVal = "[{\"action\":\"";
                retVal += _action;
                retVal += "\",\"data\":{\"eventId\":\"";
                retVal += items.get(0);
                retVal += "\",\"eventName\":\"";
                retVal += items.get(1);
                retVal += "\",\"currency\":\"";
                retVal += items.get(2);
                retVal += "\",\"ticketId\":\"";
                retVal += items.get(3);
                retVal += "\"}}]";
                break;

            case "resoldTicket":
                retVal = "[{\"action\":\"";
                retVal += _action;
                retVal += "\",\"data\":{\"eventId\":\"";
                retVal += items.get(0);
                retVal += "\",\"eventName\":\"";
                retVal += items.get(1);
                retVal += "\",\"currency\":\"";
                retVal += items.get(2);
                retVal += "\",\"ticketId\":\"";
                retVal += items.get(3);
                retVal += "\",\"price\":\"";
                retVal += items.get(4);
                retVal += "\"}}]";
                break;

            case "scannedTicket":
                retVal = "[{\"action\":\"";
                retVal += _action;
                retVal += "\",\"data\":{\"eventId\":\"";
                retVal += items.get(0);
                retVal += "\",\"eventName\":\"";
                retVal += items.get(1);
                retVal += "\",\"currency\":\"";
                retVal += items.get(2);
                retVal += "\",\"ticketId\":\"";
                retVal += items.get(3);
                retVal += "\"}}]";
                break;

            case "checkedInTicket":
                retVal = "[{\"action\":\"";
                retVal += _action;
                retVal += "\",\"data\":{\"eventId\":\"";
                retVal += items.get(0);
                retVal += "\",\"eventName\":\"";
                retVal += items.get(1);
                retVal += "\",\"currency\":\"";
                retVal += items.get(2);
                retVal += "\",\"ticketId\":\"";
                retVal += items.get(3);
                retVal += "\"}}]";
                break;

            case "claimedTicket":
                retVal = "[{\"action\":\"";
                retVal += _action;
                retVal += "\",\"data\":{\"eventId\":\"";
                retVal += items.get(0);
                retVal += "\",\"eventName\":\"";
                retVal += items.get(1);
                retVal += "\",\"currency\":\"";
                retVal += items.get(2);
                retVal += "\",\"ticketId\":\"";
                retVal += items.get(3);
                retVal += "\",\"to\":\"";
                retVal += items.get(4);
                retVal += "\"}}]";
                break;

            case "invalidatedTicket":
                retVal = "[{\"action\":\"";
                retVal += _action;
                retVal += "\",\"data\":{\"eventId\":\"";
                retVal += items.get(0);
                retVal += "\",\"eventName\":\"";
                retVal += items.get(1);
                retVal += "\",\"currency\":\"";
                retVal += items.get(2);
                retVal += "\",\"ticketId\":\"";
                retVal += items.get(3);
                retVal += "\"}}]";
                break;

            default:
                break;

        }
        return retVal;
    }
}
