package com.rafal.onlineshopspring.shop;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private List<Item> itemList;

    public List<Item> getItemList() {
        return itemList;
    }

    public ItemService() {
        Item item1 = new Item("Product nr 1", 50.00);
        Item item2 = new Item("Product nr 2", 75.00);
        Item item3 = new Item("Product nr 3", 100.00);
        Item item4 = new Item("Product nr 4", 125.00);
        Item item5 = new Item("Product nr 5", 150.00);

        itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);

    }

    public List<Item> getItems() {
        return itemList;
    }
}
