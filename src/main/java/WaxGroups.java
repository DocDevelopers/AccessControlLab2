/**
 * Created by Doc on 1/25/16.
 */
public enum  WaxGroups {
    YELLOW, RED, VIOLET, BLUE, GREEN, WHITE;

    public static WaxGroups getWaxGroup(double temperature){
        WaxGroups group = null;
        if(temperature <= 5){
            group = WHITE;
        }else if(temperature > 5 && temperature <= 18){
            group = GREEN;
        }else if(temperature > 18 && temperature <= 26){
            group = BLUE;
        }else if(temperature > 26 && temperature <= 31){
            group = VIOLET;
        }else if(temperature > 31 && temperature <= 38){
            group = RED;
        }else if(temperature > 38){
            group = YELLOW;
        }
        
        return group;
    }
}
