package medialibrary;

/**
 * medialibrary
 * Adds names of artist and songs to a media library
 * which can be added to and searched
 * @author 18025316
 * Scott Kinsmnan
 * 28/09/2020
 */

public class Media {

    private String mName;
    private String mDescription;

    /**
     * @param mName        String of name (artist)
     * @param mDescription String of description (Song title)
     */
    public Media(String mName, String mDescription) {
        this.setmName(mName);
        this.setmDescription(mDescription);
    }

    /**
     * @return String mName
     * Name getter
     */
    public String getmName() {
        return mName;
    }

    /**
     * @return String mDescrition
     * Description getter
     */
    public String getmDescription() {
        return mDescription;
    }

    /**
     * @param Name String
     * mName setter
     */
    public void setmName(String Name) {
        mName = Name;
    }

    /**
     * @param Description String
     * mDescription setter
     */
    public void setmDescription(String Description) {
        mDescription = Description;
    }
} // end class
