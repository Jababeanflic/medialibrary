package medialibrary;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * medialibrary
 * Adds names of artist and songs to a media library
 * which can be added to and searched
 * @author 18025316
 * Scott Kinsmnan
 * 28/09/2020
 */

public class MediaLibrary {
    // String Media[] = new String[4];
    ArrayList<Media> lib = new ArrayList<>();

    /**
     * Default constructor
     */
    public MediaLibrary() {
    }

    /**
     * @param nMedia object type Media
     *               Add to Arraylist
     */
    public void addMedia(Media nMedia) {
        lib.add(nMedia);
    }

    /**
     * Loops through Arraylist printing each entry
     */
    public void printMedia() {
        for (int i = 0; i < lib.toArray().length; i++) {
            System.out.println(lib.get(i).getmName() + " : " + lib.get(i).getmDescription());
        }
    }

    /**
     * @param Name String
     * @return String name from Arraylist if found null if not
     */
    public Media findMedia(String Name) {
        for (int i = 0; i < lib.size(); i++) {
            if (lib.get(i).getmName().equals(Name)) {
                return lib.get(i);
            }
        }
        return null;
    }

    public static void main(String[] args) {

        MediaLibrary lib = new MediaLibrary();
        MediaLibraryTest_w3.acceptanceTest(lib);

        //Media queen = new Media("Queen", "We Will Rock You");
        //lib.addMedia(queen);
        //System.out.println(lib);
        //printMedia();
    }
} // end class


