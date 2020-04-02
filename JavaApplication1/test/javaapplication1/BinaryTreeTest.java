/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
import org.junit.Test;
import java.util.HashMap;
import java.util.Set;

/**
 * @author infec
 */
public class BinaryTreeTest {
    
    /**
     * Test of addNode method, of class BinaryTree.
     */
    @Test
    public void test() {
        
        BinaryTree tree1 = new BinaryTree();
        
        BinaryTree tree1Copy = new BinaryTree();
        
        BinaryTree tree2 = new BinaryTree();
        
        BinaryTree tree3 = new BinaryTree();
        
        System.out.println("Tree 1: \n" );
        Double tree1Arr[] = {32.4, 65.1, 10.3, 3.5, 2.4, 123.5, 34.5, 453.3, 2.9, 
                            23.4, 97.5, 56.3, 38.3, 91.2, 5000.2, 234.6, 212.8};
        String tree1StrArr[] = {"nike", "adidas", "apple", "microsoft", "shell", 
            "bp", "primark", "tesco", "nestle", "nissan", "budweiser", 
            "brothers", "buxton", "sony", "siemens", "benq", "acer"};
        
        HashMap<Double, String> map1 = new HashMap<Double, String>();
        //create Map
        for(int i = 0; i < tree1Arr.length; i++) {
            map1.put(tree1Arr[i], tree1StrArr[i]);
            
        }
        Set<Double> keys1 = map1.keySet();
        
        Arrays.sort(tree1Arr);
        int root = 0;
        int median = 8;
        Double tempIndex1 = tree1Arr[root];
        //8 because it starts at 0 index
        Double medianIndex1 = tree1Arr[median];
        
        tree1Arr[root] = medianIndex1;
        tree1Arr[median] = tempIndex1;
        
        for(int i = 0; i < tree1Arr.length; i++) {
            for(int j = 0; j < keys1.size(); j++) {
                if(tree1Arr[i] == keys1.toArray()[j]) {
                    tree1StrArr[i] = (map1.get(keys1.toArray()[j]));
                }
            }
        }
        
        for(int i = 0; i < tree1Arr.length; i++) {
            tree1.addNode(tree1StrArr[i], tree1Arr[i]);
        }
        
        tree1.traverse();
        
        System.out.println("\n ------------------- \n");
        System.out.println("Tree 2: \n");
        
        Double tree2Arr[] = {11.4, 8.1, 45.3, 4.6, 43.5, 62.1, 900.1, 432.5, 2.1, 
                            1.9, 475.3, 23.0, 39.6, 461.67, 0.9, 61.8, 742.6};
        String tree2StrArr[] = {"asda", "google", "tesla", "waitrose", "fairy", 
            "next", "persil", "greggs", "fiat", "renault", "asos", 
            "topshop", "shuh", "mercedes", "bic", "rimmel", "premier"};
        
        HashMap<Double, String> map2 = new HashMap<Double, String>();
        //create Map
        for(int i = 0; i < tree2Arr.length; i++) {
            map2.put(tree2Arr[i], tree2StrArr[i]);
            
        }
        Set<Double> keys2 = map2.keySet();
        
        Arrays.sort(tree2Arr);
        
        Double tempIndex2 = tree2Arr[root];
        //8 because it starts at 0 index
        Double medianIndex2 = tree2Arr[median];
        
        tree2Arr[root] = medianIndex2;
        tree2Arr[median] = tempIndex2;
        
        for(int i = 0; i < tree2Arr.length; i++) {
            for(int j = 0; j < keys2.size(); j++) {
                if(tree2Arr[i] == keys2.toArray()[j]) {
                    tree2StrArr[i] = (map2.get(keys2.toArray()[j]));
                }
            }
        }
        for(int i = 0; i < tree2Arr.length; i++) {
            tree2.addNode(tree2StrArr[i], tree2Arr[i]);
        }
        
        tree2.traverse();
        
        System.out.println("\nReproduction of tree 1 and tree 2 into tree 3:\n");
        tree3.reproduction(tree1, tree2);
        //Below isto display reproduction
        tree3.traverse();
        
        System.out.println("\nCrossover of tree 1 and tree 2\n");
        tree1.crossover(tree2);
        System.out.println("Attempting traversal of new tree 1 \n");
        tree1.traverse();
        System.out.println("\nCrossing over tree 2 and tree 1\n");
        tree2.crossover(tree1);
        System.out.println("\nAttempting traversal of new tree 2 \n");
        //tree2.crossover(tree1);
        tree2.traverse();
        
        //System.out.println("Deletion of node: bp 32.4\n");
        //tree1Copy.deleteNode("bp", 32.4);
        //System.out.println("\nAfter deletion:\n");
        //tree1Copy.traverse();
        //tree1Copy.insert("bp", 32.4);
        //System.out.println("\nAfter insertion of : bp 32.4\n");
        //tree1Copy.traverse();
        System.out.println("\nChecking amount of tree 1: ");
        tree1.getValueOfTree();
        System.out.println("\nChecking amount of tree 2: ");
        tree2.getValueOfTree();
        System.out.println("\nChecking amount of tree 3: ");
        tree3.getValueOfTree();
        
    }
    public void testAddNode() {
        
    }
}
