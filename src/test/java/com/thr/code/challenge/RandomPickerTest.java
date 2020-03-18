package com.thr.code.challenge;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


/**
 * com.thr.code.challenge.RandomPickerTest class to test the methods in com.thr.code.challenge.RandomPicker class.
 *
 * @author Sanjay Nagapuri
 *
 */
public class RandomPickerTest {

        private RandomPicker randomPicker;
        private List<String> list = null;
    /* Testing Random pick of word when the list is NULL*/
    @Test
    public void testRandomPickWhenListIsNull() {
        randomPicker = new RandomPicker(list);
        Assert.assertEquals(RandomPicker.LIST_IS_EMPTY, randomPicker.randomPick());
    }

    /* Testing Random pick of word when the list is EMPTY*/
    @Test
    public void testRandomPickWhenEmptyList() {
            list = new ArrayList<>();
        randomPicker = new RandomPicker(list);
        Assert.assertEquals(RandomPicker.LIST_IS_EMPTY, randomPicker.randomPick());
    }

    /* Testing Random pick of word when the list has one word*/
    @Test
    public void testRandomPickWhenOneListItem() {
        list = new ArrayList<>();
        list.add("aaa");
        randomPicker = new RandomPicker(list);
        //checking to pick the one and only word in the list randomly
        Assert.assertEquals("aaa", randomPicker.randomPick());
    }

    /* Testing Random pick of word when the list has multiple words*/
    @Test
    public void testRandomPickWhenMultipleItemsInList() {
        list = new ArrayList<>();
        list.add("aaa");
        list.add("aab");
        list.add("aac");

        randomPicker = new RandomPicker(list);
        //checking at least one of the words start with "aa" should be picked randomly
        Assert.assertEquals(true,randomPicker.randomPick().startsWith("aa"));
    }


}