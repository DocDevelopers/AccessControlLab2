import java.util.ArrayList;

/**
 * Created by Doc on 1/25/16.
 */
public class WaxPicker {
    ArrayList<Wax> waxes = new ArrayList<Wax>();

    public Wax addWax(double temperature, Conditions conditions){
        WaxGroups group = getGroup(temperature);
        Varieties variety = getVariety(group, conditions);
        Wax perfectWax = new Wax(group, variety);
        waxes.add(perfectWax);
        return perfectWax;
    }

    public Wax getWax(int index) throws IndexOutOfBoundsException{
        try{
            return waxes.get(index);
        }catch (IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException();
        }
    }

    //Returns the first wax that matches the group. Null if no waxes that match that color
    public Wax getWax(WaxGroups group){
        for(Wax mWax : this.waxes){
            if(mWax.getGroup() == group)
                return mWax;
        }
        return null;
    }

    public Wax getWax(Wax wax){
        for(Wax mWax : this.waxes){
            if(mWax == wax)
                return mWax;
        }
        return null;
    }

    public void displayWaxes(){
        for(Wax mWax : this.waxes){
            System.out.print("Wax:{"+mWax.getGroup()+", "+ mWax.getVariety()+"}, ");
        }
    }

    private WaxGroups getGroup(double temperature){
        return WaxGroups.getWaxGroup(temperature);
    }

    private Varieties getVariety(WaxGroups group, Conditions conditions){
        Varieties variety;
        if(group == WaxGroups.YELLOW || group == WaxGroups.WHITE)
            variety = Varieties.STANDARD;
        else{
            variety = Varieties.getVariety(conditions);
        }

        return variety;
    }
}
