package _1_decorator._99_exercice;

public class DataSourceDecorator implements DataSource{

    private final DataSource dtSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dtSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        dtSource.writeData(data);
    }

    @Override
    public String readData() {
        return dtSource.readData();
    }
}
