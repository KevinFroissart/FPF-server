package fr.fairepartfait.server.utils;

import fr.fairepartfait.server.models.Card;
import fr.fairepartfait.server.models.Text;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ImagePreview {

    public static InputStream generateCardPreview(Card card) throws IOException {

        Color background = Color.decode(card.getColor());

        BufferedImage image = new BufferedImage(878, 1171, BufferedImage.TYPE_INT_ARGB);

        // Draw background
        Graphics2D graphics = image.createGraphics();
        graphics.setColor(background);
        graphics.fillRect(0, 0, image.getWidth(), image.getHeight());

        // Draw texts
        for (Text text : card.getTexts()) {
            ImagePreview.drawText(graphics, text);
        }

        graphics.dispose();

        // Create image
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageIO.write(image, "png", byteArrayOutputStream);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

    }

    private static void drawText(Graphics2D graphics, Text text) {
        Color color = Color.decode(text.getColor());

        Font font = new Font(text.getPolicy(), Font.PLAIN, text.getSize());

        graphics.setColor(color);
        graphics.setFont(font);

        graphics.drawString(text.getText(), text.getX(), text.getY());
    }

}
