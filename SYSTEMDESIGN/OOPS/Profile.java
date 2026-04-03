class Profile {
    private User user;
    
    public void setUser(User user){
        this.user = user;
    }   
}

class User {
   private Profile profile;

   public void setProfile(Profile profile){
    this.profile = profile;
    profile.setUser(this);
   }
}
