import com.sun.xml.internal.ws.wsdl.writer.document.StartWithExtensionsType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductSearch{

    MainPage mainPage;
    SecondPage secondPage;
    ProductsDetailPage productsDetailPage;
    BasketPage basketPage;

    @Test
    public void Search_Product(){
        mainPage.searchBox().Search("Bilgisayar");
    }
    @Test
    public void Go_Second_Page(){
        secondPage.pressbutton(2);

    }
    @Test
    public void Check_Page(){
        Assertions.assertTrue(secondPage.isOnSecondPage(),"Not on Second Page");


    }
    @Test
    public void Random_Select_Product(){
        secondPage.selectProduct(5);

    }
    @Test
    public void Write_Text_Product_Information(){
        productsDetailPage.write();

    }
    @Test
    public void Add_To_Basket(){
        productsDetailPage.addToBasket();

    }
    @Test
    public void Versus_Price(){
        basketPage.check();
        Assertions.assertTrue(productsDetailPage.isOnProductPrice(),"Not equal price!");

    }
    @Test
    public void Increase_Product_Number(){
        basketPage.increasenumber(2);

    }
    @Test
    public void Delete_Product_Basket(){
        basketPage.deleteproduct(1);

    }

}