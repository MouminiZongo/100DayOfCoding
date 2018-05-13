import java.util.Hashtable;

public class Hastable {

       private int HashTableSize =  27;
        private HashEntry[] entries = new HashEntry[HashTableSize];

        public void put(String userName, String password) {
            int hash = getHash(userName);
            final HashEntry hashEntry = new HashEntry(userName, password);
            if(entries[hash] == null) {
                entries[hash] = hashEntry;
            }
            // If there is already an entry at current hash
            // position, add entry to the linked list.
            else {
                HashEntry temp = entries[hash];
                while(temp.getNext() != null) {
                    temp = temp.getNext();
                }
                temp.setNext(hashEntry);
            }
        }

    public String get(String userName) {
        int hash = getHash(userName);
        if(entries[hash] != null) {
            HashEntry temp = entries[hash];

            // Check the entry linked list for march
            // for the given 'key'
            while( !temp.getUserName().equals(userName)
                    && temp.getNext() != null ) {
                temp = temp.getNext();
            }
            return temp.getPassword();
        }

        return null;
    }

    private int getHash(String userName) {
        // piggy backing on java string
        // hashcode implementation.
        return userName.hashCode() % HashTableSize;
    }




    }














