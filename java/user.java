class user extends Account {
    public user (String name, String
    document, String email, String password){
        
        super (name, document, email, password);
    }
    void printDataUser(){
        System.out.println("document driver:" + "name driver: +" + name + "E-mail:"
        + email + "password:" + password);
    }
}
