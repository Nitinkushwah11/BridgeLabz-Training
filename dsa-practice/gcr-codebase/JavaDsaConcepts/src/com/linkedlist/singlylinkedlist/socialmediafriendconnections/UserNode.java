package com.linkedlist.singlylinkedlist.socialmediafriendconnections;

class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friendHead;   // Nested Linked List of friends
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendHead = null;
        this.next = null;
    }
}
