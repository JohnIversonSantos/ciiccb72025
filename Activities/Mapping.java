import java.util.HashMap;
import java.util.Map;

public class Mapping {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        /*
         * put() - associates the specified value with the specified key in this map (optional operation).
         * get() - returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
         * remove() - removes the mapping for a key from this map if it is present (optional operation).
         * getOrDefault() - returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
         * boolean containsKey(Object key) - returns true if this map contains a mapping for the specified key.
         * boolean containsValue(Object value) - returns true if this map maps one or more keys to the specified value.
         * Set<K> keySet() - returns a Set view of the keys contained in this map.
         * Collection<V> values() - returns a Collection view of the values contained in this map.
         */

        // 1. put()
        map.put("Angel", "09123456781");
        map.put("Bob", "09234567891");
        map.put("Charlie", "09345678912");

        // 2. get()
        String contact = map.get("Bob");
        System.out.println("Bob's contact: " + contact);

        // 3. remove()
        map.remove("Charlie");
        System.out.println("After removing Charlie: " + map);

        // 4. getOrDefault()
        String defaultContact = map.getOrDefault("David", "No contact found");
        System.out.println("David's contact: " + defaultContact);

        // 5. containsKey()
        boolean hasAngel = map.containsKey("Angel");
        System.out.println("Contains Angel: " + hasAngel);

        // 6. containsValue()
        boolean hasContact = map.containsValue("09123456781");
        System.out.println("Contains contact 09123456781: " + hasContact);

        // 7. keySet()
        System.out.println("Keys in the map: " + map.keySet());
        
        // 8. values()
        System.out.println("Values in the map: " + map.values());

        Math.addExact(1, 2); // returns the sum of its arguments, throwing an exception if the result overflows an int
        Math.subtractExact(1, 2); // returns the difference of its arguments, throwing
        Math.multiplyExact(1, 2); // returns the product of its arguments, throwing an exception if the result overflows an int
        Math.floorDiv(1, 2); // returns the largest (closest to positive infinity
        Math.floorMod(1, 2); // returns the floor modulus of the int arguments
        Math.abs(-1); // returns the absolute value of an int value

        System.out.println(Math.max(1,-1));
        System.out.println(Math.min(1,-1));

        System.out.println(Math.random()); // returns a random number between 0.0 and 1.0
        System.out.println(Math.round(1.5));

        var date = java.time.LocalDate.now();
        System.out.println(date);
    }
}
