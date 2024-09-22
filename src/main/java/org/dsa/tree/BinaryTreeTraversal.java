package org.dsa.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversal {

    /**
     * <a href="https://www.geeksforgeeks.org/binary-tree-data-structure/">BinaryTree/</a>
     * <a href="https://www.geeksforgeeks.org/binary-search-tree-data-structure/?ref=lbp">BinarySearchTree/</a>
     *                  1
     *                /   \
     *               2    3
     *             /  \   / \
     *            4   5  6  7
     * Pre-order Traversal of the above tree: 1-2-4-5-3-6-7 (root -> left -> right)
     * In-order Traversal of the above tree: 4-2-5-1-6-3-7 (left -> root -> right)
     * Post-order Traversal of the above tree: 4-5-2-6-7-3-1 (left -> right -> root)
     * Level-order Traversal of the above tree: 1-2-3-4-5-6-7
     */
    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(6);
        TreeNode treeNode6 = new TreeNode(7);

        rootNode.setLeftNode(treeNode1);
        rootNode.setRightNode(treeNode2);
        treeNode1.setLeftNode(treeNode3);
        treeNode1.setRightNode(treeNode4);
        treeNode2.setLeftNode(treeNode5);
        treeNode2.setRightNode(treeNode6);

        System.out.println("PreOrder Traversal : ");
        preOrderTraversal(rootNode);
        System.out.println("\nInOrder Traversal : ");
        inOrderTraversal(rootNode);
        System.out.println("\nPostOrder Traversal : ");
        postOrderTraversal(rootNode);
        System.out.print("\nHeight of the Tree : " + height(rootNode));
        System.out.println("\nPrint Level Order : ");
        printLevelOrder(rootNode, 2);
        System.out.println("\nLevelOrder Traversal : ");
        levelOrderTraversal(rootNode);
        System.out.println("\nInsert New Node : ");
        insertNode(rootNode, 8);
        System.out.println("\nDelete New Node : ");
        deleteNode(rootNode, 5);
    }

    private static void preOrderTraversal(TreeNode root){
        if(root != null){
            System.out.print(root.getValue() + " --> ");
            if(root.getLeftNode() != null){
                preOrderTraversal(root.getLeftNode());
            }
            if(root.getRightNode() != null){
                preOrderTraversal(root.getRightNode());
            }
        }
    }

    private static void inOrderTraversal(TreeNode root){
        if(root != null){
            if(root.getLeftNode() != null){
                inOrderTraversal(root.getLeftNode());
            }
            System.out.print(root.getValue() + " --> ");
            if(root.getRightNode() != null){
                inOrderTraversal(root.getRightNode());
            }
        }
    }

    private static void postOrderTraversal(TreeNode root){
        if(root != null){
            if(root.getLeftNode() != null){
                postOrderTraversal(root.getLeftNode());
            }
            if(root.getRightNode() != null){
                postOrderTraversal(root.getRightNode());
            }
            System.out.print(root.getValue() + " --> ");
        }
    }

    private static void levelOrderTraversal(TreeNode root){
        if(root != null){
            for(int i=1; i<=height(root); i++){
                printLevelOrder(root, i);
            }
        }
    }

    private static int height(TreeNode node){
        if(node == null){
            return 0;
        }else {
            int leftHeight = height(node.getLeftNode());
            int rightHeight = height(node.getRightNode());
            if(leftHeight > rightHeight){
                return leftHeight + 1;
            }else {
                return rightHeight + 1;
            }
        }
    }


    //Using BFS approach
    private static void printLevelOrder(TreeNode node,  int level){
        if(node != null){
            if(level == 1){
                System.out.print(node.getValue() + " --> ");
            }else if(level > 1){
                printLevelOrder(node.getLeftNode(), level - 1);
                printLevelOrder(node.getRightNode(), level - 1);
            }
        }
    }

    //TODO
    private static void printVerticalOrder(){

    }

    private static void insertNode(TreeNode node, int value){
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode newNode = new TreeNode(value);
        if(node != null){
            queue.add(node);
            while (!queue.isEmpty()){
                TreeNode tempNode = queue.peek();
                queue.remove();
                if(tempNode.getLeftNode() == null){
                    tempNode.setLeftNode(newNode);
                    break;
                }else {
                    queue.add(tempNode.getLeftNode());
                }
                if(tempNode.getRightNode() == null){
                    tempNode.setRightNode(newNode);
                    break;
                }else {
                    queue.add(tempNode.getRightNode());
                }
            }
            levelOrderTraversal(node);
        }else {
            levelOrderTraversal(newNode);
        }
    }

    /**
     * Approach :
     * Find out node with given key from the tree
     * Replace that node with the bottom most node value
     * and then delete that bottom most node
     *
     */
    private static void deleteNode(TreeNode node, int value){
        if(node != null){
            if(node.getValue() == value){
                node = null;
                levelOrderTraversal(node);
            }else {
                Queue<TreeNode> queue = new LinkedList<>();
                queue.add(node);
                TreeNode tempNode = null;
                TreeNode nodeToBeDeleted = null;
                TreeNode lastParentNode = null;
                while (!queue.isEmpty()){
                    tempNode = queue.poll();
                    if(tempNode.getValue() == value){
                        nodeToBeDeleted = tempNode;
                    }
                    if(tempNode.getLeftNode() != null){
                        lastParentNode = tempNode;
                        queue.add(tempNode.getLeftNode());
                    }
                    if(tempNode.getRightNode() != null){
                        lastParentNode = tempNode;
                        queue.add(tempNode.getRightNode());
                    }
                }
                if(nodeToBeDeleted != null){
                    nodeToBeDeleted.setValue(tempNode.getValue());
                    if(lastParentNode.getRightNode() == tempNode){
                        lastParentNode.setRightNode(null);
                    }else {
                        lastParentNode.setLeftNode(null);
                    }
                }
                levelOrderTraversal(node);
            }
        }
    }

}
