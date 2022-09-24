public class PingPonger{

    public boolean PingPonger(String input){
        boolean returnValue = true;
        String initialState = null;
        if (input.equalsIgnoreCase("Ping")){
            initialState = "Ping";
        } else if (input.equalsIgnoreCase("Pong")){
            initialState = "Pong";
        } else {
            throw new IllegalArgumentException("Please enter ping or pong");
        }
    if (initialState.equalsIgnoreCase("Ping") && input.equalsIgnoreCase("Pong"));
        returnValue = true;
        return returnValue;
    } else if (initialState.equalsIgnoreCase("Pong") && input.equalsIgnoreCase("ping"))
}