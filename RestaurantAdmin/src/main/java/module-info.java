module com.malinki03.restaurantadmin {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.malinki03.restaurantadmin to javafx.fxml;
    exports com.malinki03.restaurantadmin;
}
