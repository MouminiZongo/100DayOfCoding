




public class HashEntry {

        private String userName;
        private String password;
         HashEntry Next;


        public HashEntry(String userName,String password){
           this.userName = userName;
           this.password = password;

        }


        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public HashEntry getNext(){
        return Next;
        }
        public void setNext(HashEntry Next){

        this.Next = Next;
        }

        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
}
