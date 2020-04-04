package com.company.Lec20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryClient {

    public static void main(String[] args) throws FileNotFoundException {

        File file =new File("input");
        Scanner s = new Scanner(file);
        BinaryTree tree = new BinaryTree();

        tree.insert(s);
        tree.insert(s);
        tree.insert(s);
        tree.insert(s);
        tree.postorder();
        System.out.println(tree.height());
    }
}

