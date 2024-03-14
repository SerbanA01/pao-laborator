import java.util.Scanner;

import service.StorageService;


public class Application  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation;
        StorageService storageService = new StorageService();

        while(true){
        System.out.println("Enter the desired operation: create, read, update, delete, quit");
        operation = scanner.nextLine().toLowerCase();

        if (operation.equals("quit")){
            System.out.println("Application closing..");
            break;
        }
        else{
            storageService.execute(operation);
        }
    }

    }


}
