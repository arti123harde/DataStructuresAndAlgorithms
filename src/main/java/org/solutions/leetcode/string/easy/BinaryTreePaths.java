package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 @author Arti Harde
 */
public class BinaryTreePaths {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(5);
        TreeNode treeNode4 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode4;
        treeNode2.right = treeNode3;
        System.out.println(binaryTreePaths(treeNode1));
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        treeTraversal(root, paths, "");
        return paths;
    }

    private static void treeTraversal(TreeNode node, List<String> paths, String path){
        if(node != null){
            path = path + node.val + "->";
            if(node.left != null){
                treeTraversal(node.left, paths, path);
            }
            if(node.right != null){
                treeTraversal(node.right, paths, path);
            }
            if(node.left == null && node.right == null){
                paths.add(path.substring(0, path.length()-2));
            }
        }
    }
    
     protected static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;

         public TreeNode() {

         }

         TreeNode(int val) {
             this.val = val;
         }

         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }
}