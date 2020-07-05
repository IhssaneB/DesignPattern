package _1_decorator._99_exercice;


public class Demo {
    public static void main(String[] args) {
        // exemple de données à sauvegarder encrypter et compressé
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        FileDataSource fileDataSource = new FileDataSource("OutputDemo.txt");

        Encryptor encryptor = new Encryptor();
        Compressor compressor = new Compressor();
        String encrypted = encryptor.encode(salaryRecords);
        String encryptedAndCompressed = compressor.compress(encrypted);
        fileDataSource.writeData(encryptedAndCompressed);

        DataSource dtsource = new FileDataSource("exo1.txt");
        dtsource.writeData(salaryRecords);
        new CompressorDecorator(dtsource).writeData(salaryRecords);
        new EncryptorDecorator(dtsource).writeData(salaryRecords);


        String readData = fileDataSource.readData();

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(readData);
        System.out.println("- Decoded --------------");
        System.out.println(encryptor.decode(compressor.decompress(readData)));
    }
}