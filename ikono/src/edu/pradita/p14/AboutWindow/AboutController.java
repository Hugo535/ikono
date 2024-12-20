package edu.pradita.p10;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AboutController {
    @FXML
    private Label appNameLabel;
    @FXML
    private Label versionLabel;
    @FXML
    private Label descriptionLabel;
    @FXML
    private Label developerLabel;
    @FXML
    private Label contactLabel;

    // Konfigurasi database
    private final String DB_URL = "jdbc:mysql://localhost:3306/praditat1";
    private final String DB_USER = "Hugo";
    private final String DB_PASSWORD = "hugo100506"; // Sesuaikan dengan password MySQL Anda

    public void initialize() {
        loadAboutInfo();
    }

    private void loadAboutInfo() {
        String query = "SELECT * FROM about WHERE id = 1"; // Mengambil data pertama

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                appNameLabel.setText("Nama Aplikasi: " + rs.getString("app_name"));
                versionLabel.setText("Versi: " + rs.getString("version"));
                descriptionLabel.setText("Deskripsi: " + rs.getString("description"));
                developerLabel.setText("Pengembang: " + rs.getString("developer"));
                contactLabel.setText("Kontak: " + rs.getString("contact"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
