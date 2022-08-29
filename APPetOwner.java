public class APPetOwner   {
    private APPet thePet;
    private String owner;

    public APPetOwner(APPet p, String o)    {
        thePet = p;
        owner = o;
    }
    public void printOwnerInfo()    {
        thePet.printPetInfo();
        System.out.println(" owned by " + owner);
    }
}