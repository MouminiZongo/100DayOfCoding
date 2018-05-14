/**
 *
 * *File Name:  Acount
 *Purpose: to set the deferent variables
 *Programmer: moumini zongo
 *Last Updated Date: 11/9/17

 */



import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class Account {
    /**
     * difine the diferents variable to hold  users details
     */
    BufferedImage ProfilePicture;
    String fName, IName, status;

    // create the collectin to hold friends list
    LinkedList<Account> budddyList;

    /**
     * define a contractor the pass first name, last name, status, and the image
     *
     * @param first first name
     * @param last  last name
     * @param stat  the person status
     * @param image tne image the user
     */

    public Account(String first, String last, String stat, String image) {
        fName = first;
        IName = last;
        status = stat;

        // insert the image if an exception handle it
        try {
            ProfilePicture = ImageIO.read(new File(image));

        }
        // handle the exception
        catch (IOException e) {

        }
        budddyList = new LinkedList<Account>();
    }

    //  define method to get list of the friends

    public LinkedList<Account> getFriend() {
        return budddyList;
    }

    /**
     * method to add a friend  in the network
     *
     * @param u is person to be add
     */

    public void addBuddy(Account u) {
        if (!budddyList.contains(u))
            budddyList.add(u);
    }

    /**
     * method to remore  a friend  in the network
     * @param  u is person is to be remove
     *
     */
    public void  removeBuddy(Account u) {
       budddyList.remove(u);
    }
}