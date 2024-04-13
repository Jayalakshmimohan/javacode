package Assignment;
import java.util.List;


public class Exercise4 {
	    private final Listener listener;
	 
	    public Exercise4(Listener listener) {
	        this.listener = listener;
	    }
	 
	    public void findInteger(List<Integer> inputList, int target) {
	        for (int i = 0; i < inputList.size(); i++) {
	            if (inputList.get(i) == target) {
	                listener.onIntegerFound(target, i);
	            }
	        }
	    }
	 
	    public static void main(String[] args) {
	    	Exercise4 finder = new Exercise4((number, index) -> {
	            System.out.println("Found " + number + " at index " + index);
	        });
	 
	        List<Integer> myList = List.of(10, 20, 30, 40, 50, 30);
	        int targetNumber = 30;
	        finder.findInteger(myList, targetNumber);
	    }
	}
	 
	interface Listener {
	    void onIntegerFound(int number, int index);
	}
	 
	