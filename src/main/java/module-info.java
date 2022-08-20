module com.ponomareva.java2_network_chat_client {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ponomareva.java2_network_chat_client to javafx.fxml;
    exports com.ponomareva.java2_network_chat_client;
}