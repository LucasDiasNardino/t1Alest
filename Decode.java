import java.util.*;

public class Decode {
    
    public HashMap<String, String> subsTable = new HashMap<String, String>();

    public Set<String> key;
    public Collection<String> values;

    public String decoder(String entry){

        key = subsTable.keySet() ;
        values = subsTable.values();
        final int size = key.size();

        long num = 0;

        //iterates through the Substituition Table HashMap
        for(int i = 0; i<size; i++){
            
            //seatches for the element in the hasmap
            String string = findsElement(key, values);

            System.out.println(subsTable.get(string));

            if(subsTable.get(string) == null){
                break;
            }
            
            if(!(subsTable.get(string).equals(""))){
                entry = entry.replaceAll(string, subsTable.get(string));
                
            }

            //removes used keys and values
            values.remove(subsTable.get(string));
            key.remove(string);
            subsTable.remove(string);
        }

        return entry;
    }

    public String findsElement(Set<String> keys, Collection<String> values){
        
        boolean breakingPoint;

        //for each key in keys:
        for (String key : keys) {
            
            //sets preaking point to true
            breakingPoint = true;

            //for each value in values:
            for (String value : values) {

                //if the key is contained in the values, move on to next key
                if(value.contains(key)){
                    breakingPoint = false;
                    break;
                }
                
            }

            // if the correct key is found, break the search
            if(breakingPoint){
                return key;
            }
        }
        return null;
    }
}
