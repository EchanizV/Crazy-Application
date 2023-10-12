package application;

import java.io.File;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class VueVeloController {

    @FXML
    public ImageView velo;
    
    @FXML
    public ColorPicker couleurchoisie;
    
    @FXML
    public Button rouge;
    
    @FXML
    public Button bleu;
    
    @FXML
    public Button vert;
    
    @FXML
    private ToggleGroup ouinon;
    
    @FXML
    public RadioButton non;
    
    @FXML
    public RadioButton oui;
    
    @FXML
    public TextField perso;
    
    @FXML
    public Label prix;
    
    public Label custom;
    
    private Image selectedImage;

    public void setSelectedImage(Image image) {
        selectedImage = image;
        velo.setImage(image);
    }
    
    public void onClickColorOne(ActionEvent event) {
        File file = new File("C:\\Users\\Eleve\\Pictures\\Velo\\VeloCourse\\herd-rouge.png");
        Image newImage = new Image(file.toURI().toString());
        velo.setImage(newImage);
    }
    
    public void onClickColorTwo(ActionEvent event) {
        File file = new File("C:\\Users\\Eleve\\Pictures\\Velo\\VeloCourse\\canyon-bleu.png");
        Image newImage = new Image(file.toURI().toString());
        velo.setImage(newImage);
        
   }
    
    public void onClickColorThree(ActionEvent event) {
        File file = new File("C:\\Users\\Eleve\\Pictures\\Velo\\VeloCourse\\sava-vert.png");
        Image newImage = new Image(file.toURI().toString());
        velo.setImage(newImage);
        
   }
    
    
      
}