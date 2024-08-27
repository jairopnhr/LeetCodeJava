package com.example.facil.MaxDepth;

 class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }
    
    public class MaxDepth {
       public int maxDepth(TreeNode root) {
           if(root == null)
           {
               return 0;
           }
          int  profunEsquerda= maxDepth(root.left);
          int profunDireita = maxDepth(root.right);
           return 1 +  maxValue(profunEsquerda, profunDireita);
        
        }
   
        private int maxValue(int a , int b)
        {
            return (a>b)?a:b;
        }
   
    }