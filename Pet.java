// # petSelector
//Elinor Stoutimore
//10/7/26
//This program will find the perfect pet for a person based on attributes about them.
import java.util.Scanner;

public class Pet{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your favorite color (red, green, or blue)");
        String favoriteColor = myObj.nextLine().toLowerCase();
        if(favoriteColor.equals("red") || favoriteColor.equals("green") || favoriteColor.equals("blue")) {
        System.out.println("Enter your favorite season (summer, spring, fall, winter");
        }
        else {
            System.out.println("This is not a valid favorite color. Please enter a valid color.");
            return;
            
        }
        String favoriteSeason = myObj.nextLine().toLowerCase();
        if(favoriteSeason.equals("summer") || favoriteSeason.equals("spring") || favoriteSeason.equals("winter") || favoriteSeason.equals("fall")) {
        System.out.println("Enter your name.");
        }
        else {
            System.out.println("This is not a valid favorite season. Please enter a valid season.");
            return; 
        }
         String name = myObj.nextLine();
         if("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0, 1).toLowerCase()) == -1) {
            System.out.println("That is not a valid name. Please enter a valid name.");
            return;
         }
         String perfectPet = "";
         Boolean vowel = ("aeiouAEIOU".indexOf(name.substring(0,1))>=0);
           

            if (favoriteColor.equals("blue") && favoriteSeason.equals("fall")){
                perfectPet = "alligator";
            }
            else if (favoriteColor.equals("blue") && favoriteSeason.equals("spring")) {
                perfectPet = "ostrich";
            }
            else if (favoriteColor.equals("green") && !vowel && favoriteSeason.equals("winter")) {
                perfectPet = "giraffe";
            }
            else if (favoriteColor.equals("green") && !favoriteSeason.equals("fall")) {
                perfectPet = "dog";
            }
            else if (favoriteColor.equals("red") && vowel) {
                perfectPet = "porcupine";
            }
            else if (favoriteColor.equals("red")) {
                perfectPet = "panda";
            }
            else if (favoriteSeason.equals("summer")) {
                perfectPet = "pony";
            }
            else if (!vowel && favoriteColor.equals("blue") && (favoriteSeason.equals("winter") || favoriteSeason.equals("spring"))) {
                perfectPet = "axolotl";
            }
            else {
                perfectPet = "pet rock";
            }

            System.out.println("Your perfect pet is " + perfectPet);
        }
    }
