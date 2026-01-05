package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

class SocialNetwork {

    private UserNode head;

    // Add User
    public void addUser(int id, String name, int age) {
        UserNode node = new UserNode(id, name, age);
        node.next = head;
        head = node;
    }

    // Search User
    public UserNode searchUser(String key) {
        UserNode temp = head;
        while (temp != null) {
            if (String.valueOf(temp.userId).equals(key) || temp.name.equalsIgnoreCase(key))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add Friend Connection
    public void addFriend(int u1, int u2) {
        UserNode user1 = searchUser(String.valueOf(u1));
        UserNode user2 = searchUser(String.valueOf(u2));

        if (user1 == null || user2 == null) return;

        addFriendNode(user1, u2);
        addFriendNode(user2, u1);
    }

    private void addFriendNode(UserNode user, int friendId) {
        FriendNode f = new FriendNode(friendId);
        f.next = user.friendHead;
        user.friendHead = f;
    }

    // Remove Friend Connection
    public void removeFriend(int u1, int u2) {
        UserNode user1 = searchUser(String.valueOf(u1));
        UserNode user2 = searchUser(String.valueOf(u2));

        if (user1 != null) deleteFriendNode(user1, u2);
        if (user2 != null) deleteFriendNode(user2, u1);
    }

    private void deleteFriendNode(UserNode user, int fid) {
        FriendNode temp = user.friendHead;

        if (temp != null && temp.friendId == fid) {
            user.friendHead = temp.next;
            return;
        }

        FriendNode prev = null;
        while (temp != null && temp.friendId != fid) {
            prev = temp;
            temp = temp.next;
        }

        if (temp != null)
            prev.next = temp.next;
    }

    // Display Friends
    public void displayFriends(int id) {
        UserNode user = searchUser(String.valueOf(id));
        if (user == null) return;

        FriendNode temp = user.friendHead;
        System.out.print(user.name + "'s Friends: ");
        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Mutual Friends
    public void mutualFriends(int u1, int u2) {
        UserNode user1 = searchUser(String.valueOf(u1));
        UserNode user2 = searchUser(String.valueOf(u2));

        if (user1 == null || user2 == null) return;

        System.out.print("Mutual Friends: ");
        FriendNode f1 = user1.friendHead;

        while (f1 != null) {
            FriendNode f2 = user2.friendHead;
            while (f2 != null) {
                if (f1.friendId == f2.friendId)
                    System.out.print(f1.friendId + " ");
                f2 = f2.next;
            }
            f1 = f1.next;
        }
        System.out.println();
    }

    // Count Friends
    public void countFriends() {
        UserNode temp = head;

        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friendHead;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }
}
