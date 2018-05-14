/**
*File Name:  Administrator
 *Purpose: create object
 *Programmer: moumini zongo
 *Last Updated Date: 11/9/17
**/


import java.util.LinkedList;
import java.util.Scanner;

public class Administrator {
    // create a class to hold the list of the user
    LinkedList<Account> myList = new LinkedList<Account>();

    /**
     * this metod is to connect the user to the network
     *
     * @param user is the object to hold the info
     **/

    public void add(Account user) {


        myList.add(user);
    }

    /**
     * this method is to remove the user to the network
     *
     * @param user is the object to hold the info
     **/

    public void romove(Account user) {
        // research for the usr tpo be remove
        for (int i = 0; i < myList.size(); i++) {

            // remove the friend from the entery
            if (myList.get(i).budddyList.contains(user)) ;
            remCircle(user, myList.get(i));
        }

        // remove the entery from the list
        myList.remove(user);
    }

    /**
     * define  the method that research thr user from the network
     *
     * @param FName is the first name of the user
     */

    public void searchUser(String FName) {
        for (int num = 0; num < myList.size(); num++) {

            if (myList.get(num).fName == FName)
                showProfile(myList.get(num));
        }

    }

    /**
     * the method to add new friend to the circle
     *
     * @param u1 is first user
     * @param u2 is the second user
     */
    public void circle(Account u1, Account u2) {

        u1.addBuddy(u2);

        u2.addBuddy(u1);
    }

    /**
     * the method a user from the circle
     */
    public void remCircle(Account u1, Account u2) {

        u1.removeBuddy(u2);

        u2.removeBuddy(u1);
    }

    /**
     * the method that show the user datails
     *
     * @param user is the object whose profile is to be show
     */
    public void showProfile(Account user) {

        System.out.println("Name:" + user.fName + " " + user.IName + "\n Status:" + user.status);
        showBuddies(user);
    }

    /**
     * the method to show the friends list
     *
     * @param user is the friend to be show
     */

    public void showBuddies(Account user) {
        // show the friend count
        System.out.println("Friend(" + user.budddyList.size() + ")");
        if (user.budddyList.size() == 0) {
            System.out.println(user.fName + "has no friends");
        } else {
          for(int u = 0; u< user.budddyList.size(); u++)
            System.out.println(user.budddyList.get(u).fName +";");
            System.out.println("\n=======================");
        }
    }
}



