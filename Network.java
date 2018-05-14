/**
 * *File Name:  Network
 *Purpose: test the application
 *Programmer: moumini zongo
 *Last Updated Date: 11/9/17

 */




public class Network {

    /**
     * the class to test the application
     *
     */
    // the maim method
    public  static  void  main(String[] args){
        System.out.println("welcome to NewNetwork.com");
        System.out.println("---------------------------");

        //  a object class to ad the user in to the network
        // make the user an object
        Administrator myad = new Administrator();

        // create account and assign the details to each pf the account object

        Account moumini = new Account("moumini","zongo","billinaire","");
        Account smith = new Account("smith","williams","good guy","");
        Account obama = new Account("barack","obama","buddy","");
        Account madela  = new Account("nelson","madela","the legend","");
  // add the account the network one by one
        myad.add(moumini );
        myad.add(smith);
        myad.add(obama);
        myad.add(madela );
        // test the mehod  to add the new friends to circle

        myad.circle(moumini, smith);
        myad.circle(moumini,obama);
        myad.circle(obama,madela);
        // show to details one by one
        myad.showProfile(moumini);
        myad.showProfile(smith);
        myad.showProfile(obama);
        myad.showProfile(madela);
        // try to remove a friend from the circle
        System.out.println("removing medela from the network.\n");
        // show the user  datails that is be removed from
         myad.romove(madela);
         myad.showProfile(obama);
         myad.searchUser("moumini");
    }
}
