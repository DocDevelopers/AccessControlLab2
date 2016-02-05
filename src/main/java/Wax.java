/**
 * Created by Doc on 1/25/16.
 */
class Wax {
    private WaxGroups group;
    private Varieties variety;

    public Wax(WaxGroups mGroup, Varieties mVariety){
        this.group = mGroup;
        this.variety = mVariety;
    }

    public WaxGroups getGroup() {
        return this.group;
    }

    public void setGroup(WaxGroups group) {
        this.group = group;
    }

    public Varieties getVariety() {
        return variety;
    }

    public void setVariety(Varieties variety) {
        this.variety = variety;
    }






}
