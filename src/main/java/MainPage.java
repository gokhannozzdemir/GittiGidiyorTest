import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{

    SearchBox searchBox;

    public MainPage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }
}
