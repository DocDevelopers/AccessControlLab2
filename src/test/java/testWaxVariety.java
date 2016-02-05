import org.junit.Test;

import java.security.acl.Group;

import static org.junit.Assert.*;

/**
 * Created by Doc on 1/25/16.
 */
public class testWaxVariety {
    double[] temperatures = {0,20,50,34,25,18,26,28};
    WaxGroups[] expectedGroups = {
            WaxGroups.WHITE,
            WaxGroups.BLUE,
            WaxGroups.YELLOW,
            WaxGroups.RED,
            WaxGroups.BLUE,
            WaxGroups.GREEN,
            WaxGroups.BLUE,
            WaxGroups.VIOLET
    };

    @Test
    public void testGetWaxGroup(){
        WaxGroups[] groupResults = new WaxGroups[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            WaxGroups group = WaxGroups.getWaxGroup(temperatures[i]);
            groupResults[i] = group;
        }

        assertArrayEquals("Output does not match expected.",expectedGroups, groupResults);

    }
}
