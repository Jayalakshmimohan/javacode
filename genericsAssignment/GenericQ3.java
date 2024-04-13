package genericsAssignment;

import java.util.ArrayList;
import java.util.List;
 
public class GenericQ3 {
	public static void main(String[] args) {
        List<FriendshipCriteria<String, String>> friends = new ArrayList<>();
        friends.add(new FriendshipCriteria<>("Amy", "korea"));
        friends.add(new FriendshipCriteria<>("barney", "Los Angeles"));
        friends.add(new FriendshipCriteria<>("danny", "austria"));
 
        String targetLocation = "austria"; //  Find friends in this location
 
        for (FriendshipCriteria<String, String> friend : friends) {
            if (friend.getAttribute().equalsIgnoreCase(targetLocation)) {
                System.out.println(friend.getName() + " is a friend.");
            }
        }
	}
}
 