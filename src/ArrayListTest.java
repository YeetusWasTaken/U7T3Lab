import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jamal");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");

        //COMPLETE ME: print each name using an index based for loop
        for (int x = 0; x < names.size(); x++)
        {
            System.out.println(names.get(x));
        }
        //COMPLETE ME: print each name (again!) using enhanced for loop
        for (String name: names)
        {
            System.out.println(name);
        }
        //COMPLETE ME: print each name (a third time!) using a while loop
        int i = 0;
        while (i < names.size())
                {
                    System.out.println(names.get(i));
                    i++;
                }

        //added
        ArrayList<Cat> catList = new ArrayList<Cat>();
        catList.add(new Cat("Patty"));
        catList.add(new Cat("Keith"));
        catList.add(new Cat("Jerry"));
        catList.add(new Cat("Mary"));

        // COMPLETE ME: print each Cat’s name using a
        // standard for loop
        for (int x = 0; x < catList.size(); x++)
        {
            System.out.println(catList.get(x).getName());
        }
        // COMPLETE ME: print each Cat’s name using an
        // enhanced for loop
        for (Cat cat : catList)
        {
            System.out.println(cat.getName());
        }

        //ADD THIS IMPORT:  import java.util.Arrays;

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(nums));
        for (int x = 1; x < numList.size() -1; x++)
        {
            numList.set(x-1, numList.get(x) + numList.get(x+1));
        }


        System.out.println(numList);




    }
}
