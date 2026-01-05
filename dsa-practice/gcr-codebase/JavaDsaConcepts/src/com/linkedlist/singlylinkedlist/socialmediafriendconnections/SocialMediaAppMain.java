package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

public class SocialMediaAppMain {
    public static void main(String[] args) {

        SocialNetwork sn = new SocialNetwork();

        sn.addUser(1, "Amit", 21);
        sn.addUser(2, "Nitin", 22);
        sn.addUser(3, "Rahul", 23);
        sn.addUser(4, "Priya", 20);

        sn.addFriend(1, 2);
        sn.addFriend(1, 3);
        sn.addFriend(2, 3);
        sn.addFriend(3, 4);

        sn.displayFriends(1);
        sn.displayFriends(3);

        sn.mutualFriends(1, 2);

        sn.countFriends();

        sn.removeFriend(1, 3);

        sn.displayFriends(1);
    }
}
