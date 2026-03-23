package two_pointers;
/*
Time: O(N)
Space: O(N)
 */
public class MergeAlternateLists {
    public ListFromOne<T> merge(ListFromOne<T> listOne, ListFromOne<T> listTwo) {
        ListFromOne<T> result =  new ArrayListFromOne<>();

        // loop over both list and add to result
        int i = 1;
        while(i <= listOne.size() && i <= listTwo.size()) {
            result.add(listOne.get(i));
            result.add(listTwo.get(i));
            i++;
        }
        // append the remaining
        while(i <= listOne.size()) {
            result.add(listOne.get(i));
            i++;
        }
        while(i <= listTwo.size()) {
            result.add(listTwo.get(i));
            i++;
        }
        return result;
    }
 }
