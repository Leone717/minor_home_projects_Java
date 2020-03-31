package dogfriend;


public class Human {
    Friend bestFriend;      //property
    
    public Human (){
        this.bestFriend = new Dog();    //we get a new dog who is th bestFriend of the Human 
    }
}
