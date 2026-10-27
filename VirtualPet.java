import java.util.Scanner;

public class VirtualPet {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      
      String petName = "Mr. Pickles";
      int happiness = 5;
      int hunger = 5;
      int energy = 5;
      int badLuckAccruation = 0;
      
      int choice = 0;
      
      System.out.println("What is your pet's name? (leave empty for default)");
      String name = input.nextLine();
      if (name != ""){
         petName = name;
      }
      
      System.out.println("Welcome to Virtual Pet Simulator!");
      System.out.println("Your pet's name is " + petName + ".");
         while (happiness < 15 && hunger < 10 && energy > 0 && choice != 5){
      // TODO 1:
      // Create a while loop that continues while:
      // happiness < 15
      // hunger < 10
      // energy > 0
      // choice != 5

         // TODO 2:
         // Display happiness, hunger, and energy.
            System.out.println("-------------------------");
            System.out.println("happiness: " + happiness);
            System.out.println("hunger: " + hunger);
            System.out.println("energy: " + energy);
            System.out.println("-------------------------");
            
            System.out.println("What would you like to do?");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Sleep");
            System.out.println("4. Bath");
            System.out.println("5. Quit");
         
            choice = input.nextInt();
         
         // TODO 3:
         // Create an if / else if / else statement
         // to handle the player's choice.
         //
         // Update the three statistics according
         // to the table in the instructions.
         //
         // Print a funny message for each action.
            if (choice == 1){
               System.out.println(petName + " ate to their delight!");
               happiness++;
               hunger -= 3;
            } else if (choice == 2) {
               System.out.println(petName + " has a lot of fun playing!");
               happiness += 3;
               hunger += 2;
               energy -= 2;
            } else if (choice == 3) {
               System.out.println(petName + " takes a long nap.");
               happiness--;
               hunger++;
               energy += 3;
            } else if (choice == 4) {
               System.out.println(petName + " gets cleaned up.");
               happiness += 2;
               hunger++;
               energy--;
            } else if (choice == 5) {
               System.out.println("Game Quit.");
            } else {
               System.out.println("Invalid Input!");
            }
            
            // randomness 
            
            if(choice < 5 && choice > 0){
               if ((int) (Math.random() * (100 - badLuckAccruation)) > 10){
                  System.out.println("The day continues smoothly");
                  badLuckAccruation += 5;
               } else {
                  if (badLuckAccruation < 15) {
                     String str = "Unlucky! " + petName;
                     if ((int) (Math.random() * 2) == 1){
                        str += " got sick.";
                        
                     } else {
                        str += " fell in a pile of mud.";
                     }
                     System.out.println(str);
                     badLuckAccruation = 0;
                  } else {
                     System.out.println("Oh no! A meteorite struck " + petName + "!");
                     badLuckAccruation = 0;
                     happiness -= 5;
                     hunger += 2;
                     energy -= 3;
                  }
               }
            }
         }
      // TODO 4:
      // After the loop, determine WHY the game ended.
      //
      // Did the pet become happy enough?
      // Did it get too hungry?
      // Did it run out of energy?
      // Did the player quit?
      //
      // Print the appropriate ending message.
      if (choice == 5) {
         System.out.println("Goodbye!");
      }
      if (hunger >= 10){
         System.out.println(petName + " starved away. Why didn't you feed them??!!!");
      }
      if (energy < 1){
         System.out.println("They got too tired. You overworked " + petName);
      }
      if (happiness >= 15){
         System.out.println("Yay! You Won! Good job taking care of " + petName);
      }
      input.close();
   }
}