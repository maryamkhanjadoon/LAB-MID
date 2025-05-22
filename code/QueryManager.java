
package com.mycompany.searchui;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QueryManager {

    public List<Item> searchItemsByName(String name) throws Exception {
        List<Item> items = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT name, price, store_name FROM items WHERE name LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + name + "%");

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String itemName = rs.getString("name");
                double price = rs.getDouble("price");
                String store = rs.getString("store_name");

                items.add(new Item(itemName, price, store));
            }
        }

        return items;
    }
}
