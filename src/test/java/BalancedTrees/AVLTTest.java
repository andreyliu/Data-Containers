/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package BalancedTrees;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AVLTTest {
    private int numNodes;
    private TinyST<BST<String, Integer>> test;



    @Before
    @SuppressWarnings("unchecked")
    public void initialize() {
        numNodes = 1000;
        test = new TinyST<>(AVLTree.class);
    }
    @Test
    public void testInsert1() {

        test.testInsert();
    }

    @Test
    public void testKeys() {
        test.testKeys();
    }
    @Test
    public void testSelect() {
        test.testSelect();
    }
    @Test
    public void testFloorCeil() {
        test.testFloorCeil();
    }
    @Test
    public void testRangeSearch() {
        test.testRangeSearch();
    }

    @Test
    public void testDelete1() {
        test.testDelete();
    }

    @Test public void testInsert2() {
        BST<Integer, Integer> st2 = new AVLTree<>();
        for (int i = 0; i < numNodes; i++) {
            st2.put(i, i);
            assertThat(st2.check(), is("pass"));
        }
        assertThat(st2.height(), is(9));
    }

    @Test public void testDelete2() {
        // delete keys in random order
        BST<Integer, Integer> st2 = new AVLTree<>();

        for (int i = 0; i < numNodes; i++) {
            st2.put(i, i);
        }

        final int seedNum = 2;
        StdRandom.setSeed(seedNum);
        while (st2.size() > 0) {
            int i = StdRandom.uniform(numNodes);
            if (st2.contains(i)) {
                st2.delete(i);
                assertThat(st2.check(), is("pass"));
            }
        }
        assertThat(st2.isEmpty(), is(true));
    }

}