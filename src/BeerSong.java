/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eric
 */
public class BeerSong {
    
    public static void main(String[] args) //main function
    {
        Ninety_Nine_Bottles_of_Beer(99);
    }
    static void Ninety_Nine_Bottles_of_Beer(int bottles) //Ninety_Nine_Bottles_of_Beer function
    {
        if (bottles > 2)
        {
            System.out.println(bottles + " bottles of beer on the wall, "+bottles+" bottles of beer");
            System.out.println("take one down, pass it around, "+(bottles-1)+" bottles of beer on the wall.");
            Ninety_Nine_Bottles_of_Beer(bottles-1);
        }
        else if (bottles == 2)
        {
            System.out.println(bottles + " bottles of beer on the wall, "+bottles+" bottles of beer");
            System.out.println("take one down, pass it around, "+(bottles-1)+" bottle of beer on the wall.");
            Ninety_Nine_Bottles_of_Beer(bottles-1);
        }
        else
        {
            System.out.println(bottles + " bottle of beer on the wall, "+bottles+" bottle of beer");
            System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
            
        }
    }
    
}
