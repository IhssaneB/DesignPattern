package _1_decorator._99_exercice;

import java.util.Base64;

/**
 * Classe réalisatio du cryptage.
 */
public class EncryptorDecorator extends DataSourceDecorator{

    public EncryptorDecorator(DataSource dtsource) {
        super(dtsource);
    }

    public String decryptcode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
    public String encryptcode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encryptcode(readData()));
    }

    @Override
    public String readData() {
        return super.readData();
    }
}
