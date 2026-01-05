package com.linkedlist.doublylinkedlist.undoredofuncationality;

public class TextEditorAppMain {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.type("Hello");
        editor.type("Hello World");
        editor.type("Hello World Java");

        editor.display();

        editor.undo();
        editor.display();

        editor.undo();
        editor.display();

        editor.redo();
        editor.display();

        editor.type("Hello World Java DSA");
        editor.display();
    }
}
