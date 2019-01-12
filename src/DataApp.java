public class DataApp {
    public static void main(String[] args) {
        DataPresenter dataPresenter = new DataPresenter();
        DataProvider dataProvider = new FileDataProvider();
        dataPresenter.showData(dataProvider);


    }
}
