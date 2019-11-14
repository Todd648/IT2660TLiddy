package com.company;

import javax.swing.tree.TreeNode;
import java.util.Enumeration;

public class BinaryTree {
    TreeNode root;
    public BinaryTree(){
        root = null;
    }

    public boolean insert(Listing newListing) {
        TreeNodeWrapper p = new TreeNodeWrapper();
        TreeNodeWrapper c = new TreeNodeWrapper();
        TreeNode n = new TreeNode();
        if(n==null) return false;
        else {
            n.node = newListing.deepCopy();
            n.lc =null;
            n.rc =null;
            if(root==null) {
                root = n;
            }
            else {
                findNode(newListing.getkey(), p, c);
                if(newListing.getkey().compareTo(p.get().node.getkey()) < 0)
                    p.get().lc =n;
                else
                    p.get().rc =n;
            }
            return true;
        }
    }

     public Listing fetch (String targetKey) {
        boolean found;
        TreeNodeWrapper p = new TreeNodeWrapper();
        TreeNodeWrapper c = new TreeNodeWrapper();
        found = findNode(targetKey, p, c);

        if(found==true)
            return c.get().node.deepCopy();
        else return null;
     }
    public boolean delete (String targetKey){
        boolean found;
        TreeNodeWrapper p = new TreeNodeWrapper();
        TreeNodeWrapper c = new TreeNodeWrapper();
        TreeNode largest;
        TreeNode nextLargest = null;
        found = findNode(targetKey, p, c);

        if(found==false)
            return false;
        else {
            if(c.get().lc==null && c.get().rc == null) {
                if(p.get().lc==c.get())
                    p.get().lc =null;
                else
                    p.get().rc =null;
            }
            else if(c.get().lc==null || c.get().rc == null) {
                if (p.get().lc == c.get()) {
                    if (c.get().lc != null)
                        p.get().lc = c.get().lc;
                    else
                        p.get().lc = c.get().rc;
                } else {
                    if (c.get().lc != null)
                        p.get().rc = c.get().lc;
                    else
                        p.get().rc = c.get().rc;
                }
            }
                else {
                    nextLargest.rc = c.get().lc;
                    largest=nextLargest.rc;
                    if(largest != null) {
                        while (largest.rc != null) {
                            nextLargest = largest;
                            largest = largest.rc;
                        }
                        c.get().node = largest.node;
                        nextLargest.rc = largest.lc;
                    }
                    else {
                        nextLargest.rc = c.get().rc;
                        if(p.get().lc == c.get())
                            p.get().lc = nextLargest;
                        else
                            p.get().rc = nextLargest;
                    }
                }
                return true;
            }
        }

    public boolean update (String targetKey, Listing newListing) {
        if(delete(targetKey) == false) return false;
        else if (insert(newListing)==false) return false;
        else return true;
    }

    public class TreeNode {
        private Listing node;
        private TreeNode lc;
        private TreeNode rc;
        public  TreeNode()
        {
        }
    }
    private boolean findNode(String targetKey, TreeNodeWrapper parent, TreeNodeWrapper child) {
        parent.set(root);
        child.set(root);
        if(root==null)
            return true;
        while (child.get()!=null) {
            if(child.get().node.compareTo(targetKey)==0)
                return true;
            else {
                parent.set(child.get());
                if(targetKey.compareTo(child.get().node.getkey())<0)
                    child.set(child.get().lc);
                else
                    child.set(child.get().rc);
            }
        }
        return false;
    }
    public class  TreeNodeWrapper{
        TreeNode treeRef =null;
        public  TreeNodeWrapper() {
        }
        public  TreeNode get() {
            return treeRef;
        }
        public  void set(TreeNode t) {
            treeRef =t;
        }
    }

    public void LNRoutputTraversal(TreeNode root) {
        if(root.lc !=null)
            LNRoutputTraversal(root.lc);
        System.out.println(root.node);
        if(root.rc !=null)
            LNRoutputTraversal(root.rc);
    }

    public void showAll(){
        if(root==null)
            System.out.println("The structure is empty.");
        else
            LNRoutputTraversal(root);
    }
}
