package sd_dtu.genericmoniteringapplication;

/**
 * Created by Dell on 17-Sep-16.
 */
public class items {

    String mName;
    String mType;
    int mUpperLimit;
    int mLowerLimit;

    public items(String name,String type, int lowerLimit, int upperLimit)
    {
        mName = name;
        mType = type;
        mUpperLimit = upperLimit;
        mLowerLimit = lowerLimit;

    }

}
