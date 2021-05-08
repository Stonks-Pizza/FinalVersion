// Javafx imports to connect UI to backend code

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

// Controller Class handles all button and label actions to update the UI accordingly
public class Controller {

    Cart totalCart = new Cart();

    // Go to Sign-In button linked to UI
    @FXML
    Button GoToSignInBtn;

    // Sends the user to the Sign-In page when Sign-In button is pressed
    public void handleGoToSignInBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("SignIn.fxml"));

        Stage window = (Stage) GoToSignInBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Back to home Button linked to UI
    @FXML
    Button BackToHomeBtn;

    // Sends the user to the Home page when the Back button on certain pages is pressed
    public void handleBackToHomeBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));

        Stage window = (Stage) BackToHomeBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Create Account Button linked to UI
    @FXML
    Button CreateAccountBtn;

    // Sends the user to the Profile page when Create Account button is pressed
    public void handleCreateAccountBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ProfileMaker.fxml"));

        Stage window = (Stage) CreateAccountBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Home Button linked to UI
    @FXML
    Button HomeBtn;

    // Sends the user to the Home page when the Home button in the top left of any page is pressed
    public void handleHomeBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));

        Stage window = (Stage) HomeBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Profile Button linked to UI
    @FXML
    Button ProfileBtn;

    // Sends the user to the Profile page when the Profile Button in the top right of any page is pressed
    public void handleProfileBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ProfileMaker.fxml"));

        Stage window = (Stage) ProfileBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Update/Create Account Button linked to UI
    @FXML
    Button UpdateAccountBtn;

    // Sends the user to the Main Pizza Menu page when the Update/Create Account button is pressed
    public void handleUpdateAccountBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PizzaMenu.fxml"));

        Stage window = (Stage) UpdateAccountBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Menu Button linked to UI
    @FXML
    Button MenuBtn;

    // Sends the user to the Main Pizza Menu page when the Menu button is pressed
    public void handleMenuBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PizzaMenu.fxml"));

        Stage window = (Stage) MenuBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Back to Menu Button linked to UI
    @FXML
    Button BackToMenuBtn;

    // Sends the user back to the home page when the back button on certain pages is pressed
    public void handleBackToMenuBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PizzaMenu.fxml"));

        Stage window = (Stage) BackToMenuBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Sign-In Button linked to UI
    @FXML
    Button SignInBtn;

    // Sends the user to the Main Pizza page when the Sign-In button is pressed
    public void handleSignInBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PizzaMenu.fxml"));

        Stage window = (Stage) SignInBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Forgot Password Button linked to UI
    @FXML
    Button ForgotPasswordBtn;

    // Pop-up an alert box telling the user their password was sent to their email when forgot password button is pressed
    public void handleForgotPasswordBtn() throws Exception {
        Stage window1 = new Stage();

        window1.initModality(Modality.APPLICATION_MODAL);
        window1.setTitle("Alert");
        window1.setMinWidth(250);

        Label label = new Label();
        label.setText("Your password was sent to your email!");

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window1.setScene(scene);
        window1.showAndWait();
    }

    // Go to custom pizza page Button linked to UI
    @FXML
    Button CustomPizzaBtn;

    // Sends the user to the Custom Pizza page when the Custom Pizza button is pressed
    public void handleCustomPizzaBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CustomPizza.fxml"));

        Stage window = (Stage) CustomPizzaBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Go to Cart Button linked to UI
    @FXML
    Button GoToCartBtn;

    // Sends the user to the Cart page when the Cart button in the top right on any page is pressed
    public void handleGoToCartBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Cart.fxml"));

        Stage window = (Stage) GoToCartBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Back to Cart Button linked to UI
    @FXML
    Button BackToCartBtn;

    // Sends the user back to the Cart page when the back button on certain pages is pressed
    public void handleBackToCartBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Cart.fxml"));

        Stage window = (Stage) BackToCartBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Checkout Button linked to UI
    @FXML
    Button CheckOutBtn;

    // Sends the user to the Checkout page when the Checkout button is pressed in the Cart
    public void handleCheckOutBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CheckOut.fxml"));

        Stage window = (Stage) CheckOutBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Back to checkout page Button linked to UI
    @FXML
    Button BackToCheckOutBtn;

    // Sends the user back to the Checkout page when the back button on certain pages is pressed
    public void handleBackToCheckOutBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CheckOut.fxml"));

        Stage window = (Stage) BackToCheckOutBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Carryout Button linked to UI
    @FXML
    Button CarryOutBtn;

    // Sends the user to the CarryOut Checkout when Carryout button is pressed in the Checkout
    public void handleCarryOutBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CarryOutCheckOut.fxml"));

        Stage window = (Stage) CarryOutBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Delivery Button linked to UI
    @FXML
    Button DeliveryBtn;

    // Sends the user to the Delivery Checkout when Delivery button is pressed in the Checkout
    public void handleDeliveryBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("DeliveryCheckOut.fxml"));

        Stage window = (Stage) DeliveryBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Place Order Button linked to UI
    @FXML
    Button PlaceOrderBtn;

    // Sends the user to the Thank you page when Place Order button is pressed
    public void handlePlaceOrderBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("OrderReceipt.fxml"));

        Stage window = (Stage) PlaceOrderBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }


    // Add Cheese Pizza Button linked to UI
    @FXML
    Button AddCheeseBtn;

    // Save item and send user to cart
    public void handleAddCheeseBtn() throws Exception {
        totalCart.addPizza(new Pizza("cheese", "large", "regular", 10.00));
        Parent root = FXMLLoader.load(getClass().getResource("Cart.fxml"));

        Stage window = (Stage) AddCheeseBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Add Cheese Pizza Button linked to UI
    @FXML
    Button AddPepperoniBtn;

    // Save item and send user to cart
    public void handleAddPepperoniBtn() throws Exception {
        totalCart.addPizza(new Pizza("cheese, pepperoni", "large", "regular", 10.00));
        Parent root = FXMLLoader.load(getClass().getResource("Cart.fxml"));

        Stage window = (Stage) AddPepperoniBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Add Cheese Pizza Button linked to UI
    @FXML
    Button AddSausageBtn;

    // Save item and send user to cart
    public void handleAddSausageBtn() throws Exception {
        totalCart.addPizza(new Pizza("cheese, sausage", "large", "regular", 10.00));
        Parent root = FXMLLoader.load(getClass().getResource("Cart.fxml"));

        Stage window = (Stage) AddSausageBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Add Cheese Pizza Button linked to UI
    @FXML
    Button AddMeatLoversBtn;

    // Save item and send user to cart
    public void handleAddMeatLoversBtn() throws Exception {
        totalCart.addPizza(new Pizza("cheese, pepperoni, sausage", "large", "regular", 10.00));
        Parent root = FXMLLoader.load(getClass().getResource("Cart.fxml"));

        Stage window = (Stage) AddMeatLoversBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Add Cheese Pizza Button linked to UI
    @FXML
    Button AddSupremeBtn;

    // Save item and send user to cart
    public void handleAddSupremeBtn() throws Exception {
        totalCart.addPizza(new Pizza("cheese, pepperoni, sausage, spinach", "large", "regular", 10.00));
        Parent root = FXMLLoader.load(getClass().getResource("Cart.fxml"));

        Stage window = (Stage) AddSupremeBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Add Custom Pizza Button linked to UI
    @FXML
    Button AddCustomPizzaBtn;

    // Save item and send user to cart
    public void handleAddCustomPizzaBtn() throws Exception {
        totalCart.addPizza(new Pizza("cheese, bacon, pineapple", "large", "regular", 10.00));
        Parent root = FXMLLoader.load(getClass().getResource("Cart.fxml"));

        Stage window = (Stage) AddCustomPizzaBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    // Add Beverage Button linked to UI
    @FXML
    Button AddBeverageBtn;

    // Save item and send user to cart
    public void handleAddBeverageBtn() throws Exception {
        Drink drink = new Drink("8 oz", "coke", 1.00);
        Parent root = FXMLLoader.load(getClass().getResource("Cart.fxml"));

        Stage window = (Stage) AddBeverageBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }
}
