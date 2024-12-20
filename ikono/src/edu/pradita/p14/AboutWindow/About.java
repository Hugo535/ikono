<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.geometry.Insets?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.layout.VBox?>

<VBox xmlns="http://javafx.com/javafx/8" xmlns:fx="http://javafx.com/fxml/1"
      fx:controller="AboutController" spacing="10" alignment="CENTER">
    <padding>
        <Insets top="20" right="20" bottom="20" left="20"/>
    </padding>

    <Label fx:id="appNameLabel" text="Nama Aplikasi: [Loading...]"/>
    <Label fx:id="versionLabel" text="Versi: [Loading...]"/>
    <Label fx:id="descriptionLabel" text="Deskripsi: [Loading...]"/>
    <Label fx:id="developerLabel" text="Pengembang: [Loading...]"/>
    <Label fx:id="contactLabel" text="Kontak: [Loading...]"/>
</VBox>
