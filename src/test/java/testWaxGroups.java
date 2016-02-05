import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Doc on 1/25/16.
 */
public class testWaxGroups {
    private Conditions[] conditions = {
            Conditions.POWDER,
            Conditions.FIRM,
            Conditions.POWDER,
            Conditions.CRUSTY,
            Conditions.FIRM,
            Conditions.CRUSTY,
            Conditions.POWDER,
            Conditions.FIRM,
            Conditions.CRUSTY};

    private Varieties[] expectedVarieties = {
            Varieties.SPECIAL,
            Varieties.STANDARD,
            Varieties.SPECIAL,
            Varieties.EXTRA,
            Varieties.STANDARD,
            Varieties.EXTRA,
            Varieties.SPECIAL,
            Varieties.STANDARD,
            Varieties.EXTRA
    };
    @Test
    public void testGroupPicker(){
        Varieties[] varietyResults = new Varieties[conditions.length];

        for(int i = 0; i < conditions.length; i++){
            Varieties variety = Varieties.getVariety(conditions[i]);
            varietyResults[i] = variety;
        }

        assertArrayEquals("Output does not match expected.",expectedVarieties, varietyResults);
    }
}
