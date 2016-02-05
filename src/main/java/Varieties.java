/**
 * Created by Doc on 1/25/16.
 */
public enum Varieties {
    SPECIAL, STANDARD, EXTRA;

    public static Varieties getVariety(Conditions mCondition){
        Varieties variety = null;
        switch (mCondition){
            case FIRM:{
                variety = STANDARD;
                break;
            }

            case POWDER:{
                variety = SPECIAL;
                break;
            }

            case CRUSTY:{
                variety = EXTRA;
                break;
            }

            default:{
                variety = STANDARD;
                break;
            }

        }

        return variety;
    }
}
