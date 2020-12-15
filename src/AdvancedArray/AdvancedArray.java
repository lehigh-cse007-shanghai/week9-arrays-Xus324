package AdvancedArray;

import java.util.*;

public class AdvancedArray {
    class Pet {
        String name;

        Pet(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Pet{" +
                    "name='" + name + '\'' +
                    '}';
        }

    }

    // CRUD
    public void arrayListOfPets() {
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Pet("potchi"));
        pets.add(new Pet("yuki"));
        System.out.println("pets = " + pets);
        pets.get(pets.size()-1).setName("ponpon");
        System.out.println("pets = " + pets);
        pets.remove(0);
        System.out.println("pets = " + pets);
        pets.clear();
        System.out.println("pets = " + pets);
    }

    public void stackOfPets() {
        System.out.println("–––––STACK–––––");
        Stack<Pet> pets = new Stack<>();
        pets.push(new Pet("potchi"));
        pets.push(new Pet("yuki"));
        System.out.println("pets = " + pets);
        System.out.println("pets = " + pets.peek());
        System.out.println("pets = " + pets);
        if (!pets.empty())
            pets.pop();
    }

    public void queueOfPets() {
        System.out.println("–––––QUEUE–––––");
        Queue<Pet> pets = new ArrayDeque<>();
        pets.offer(new Pet("potchi"));
        pets.offer(new Pet("yuki"));
        System.out.println("pets = " + pets);
        System.out.println("pets.poll() = " + pets.poll());
        System.out.println("pets = " + pets);
    }

    public void mapOfCountries() {
        System.out.println("–––––MAP–––––");
        Map<String, float []> cities = new HashMap<>();
        cities.put("shanghai", new float[] {121.1f, 36.2f});
        cities.put("lehigh", new float[] {-75.3f, 40.6f});

        System.out.println("cities.get(\"lehigh\") = " + Arrays.toString(cities.get("lehigh")));
        System.out.println("cities.() = " + cities.containsKey("new york"));
    }

    public static void main(String[] args) {
        AdvancedArray advancedArray = new AdvancedArray();
        advancedArray.arrayListOfPets();
        advancedArray.stackOfPets();
        advancedArray.queueOfPets();
        advancedArray.mapOfCountries();
    }
}