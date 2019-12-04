/**
 * @author: saranjith
 * @date: 04-12-2019
 */

package in.saran;

public class Main {

    public static void main(String[] args) {

        int rangeStart = 134564;
        int rangeEnd = 585159;
        int count = 0;


        for(int i=rangeStart;i<=rangeEnd;i++) {
            if (isInRightOrder(i)) {

                for (int j = 0; j < Integer.toString(i).length() - 1; j++) {
                    if (Character.toString(Integer.toString(i).charAt(j)).equals(Character.toString(Integer.toString(i).charAt(j + 1)))) {
                        count++;
                        j = Integer.toString(i).length() - 1;
                    }
                }
            }
        }
        System.out.println("There are "+count+" different passwords");
    }

    static boolean isInRightOrder(int number)
    {
        int c = 10;
        while (number!=0)
        {
            int rem = number % 10;
            number /= 10;
            if (rem > c)
                return false;
            c = rem;
        }
        return true;
    }

}

