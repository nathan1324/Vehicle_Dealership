package dealership;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 *
 */
public class database {

    /**
     * FIXME -- need description
     */
    public void importVehicleData() throws IOException {
        Scanner fIn = null;
        Car data = new Car();

        try {
            fIn = new Scanner(new FileReader("cars.txt")); // FIXME -- left off here







        }
        catch (IOException ex){
            ex.printStackTrace();
            System.out.println("\nERROR: \"cars.txt\" does NOT exist!");
        }
        finally{
            if (fIn != null){
                fIn.close();
            }
        }
    }
}
