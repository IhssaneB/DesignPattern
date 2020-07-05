package _5_factory_method._99_excerice;
import _5_factory_method._99_excerice.implementation.GifReader;
import _5_factory_method._99_excerice.implementation.JpegReader;
import java.io.InputStream;

public class ImageReaderFactory {
    // TODO
    private InputStream inputStream;
    public ImageReaderFactory(InputStream inputStream) {
        this.inputStream = inputStream;}
    public ImageReader loadImage() {
        if (ImageUtil.getImageType(inputStream) == ImageType.JPEG) {
            return new JpegReader(inputStream);
        }
        if (ImageUtil.getImageType(inputStream) == ImageType.GIF) {
            return new GifReader(inputStream);
        }

        return null;
    }
}
