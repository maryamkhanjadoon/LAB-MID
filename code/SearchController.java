/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchui;

import java.util.List;

public class SearchController {
    private QueryManager queryManager;

    public SearchController() {
        queryManager = new QueryManager();
    }

    public List<Item> searchItems(String name) throws Exception {
        return queryManager.searchItemsByName(name);
    }
}