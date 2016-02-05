import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Doc on 1/25/16.
 */
public class testWaxPicker {
    WaxPicker picker = new WaxPicker();
    @Test
    public void testAddWax(){
        Wax yellowStandard = picker.addWax(40, Conditions.POWDER);
        Wax BlueExtra = picker.addWax(20, Conditions.CRUSTY);
        Wax GreenSpecial = picker.addWax(15, Conditions.POWDER);
        Wax WhiteStandard = picker.addWax(0, Conditions.FIRM);
        Wax RedExtra = picker.addWax(38, Conditions.CRUSTY);

        assertEquals("Output not as expected", WaxGroups.YELLOW, picker.getWax(0).getGroup());
        assertEquals("Output not as expected", Varieties.STANDARD, picker.getWax(0).getVariety());

        assertEquals("Output not as expected", WaxGroups.BLUE, picker.getWax(1).getGroup());
        assertEquals("Output not as expected", Varieties.EXTRA, picker.getWax(1).getVariety());

        assertEquals("Output not as expected", WaxGroups.GREEN, picker.getWax(2).getGroup());
        assertEquals("Output not as expected", Varieties.SPECIAL, picker.getWax(2).getVariety());

        assertEquals("Output not as expected", WaxGroups.WHITE, picker.getWax(3).getGroup());
        assertEquals("Output not as expected", Varieties.STANDARD, picker.getWax(3).getVariety());

        assertEquals("Output not as expected", WaxGroups.RED,  picker.getWax(4).getGroup());
        assertEquals("Output not as expected", Varieties.EXTRA, picker.getWax(4).getVariety());


        picker.displayWaxes();


    }
}
