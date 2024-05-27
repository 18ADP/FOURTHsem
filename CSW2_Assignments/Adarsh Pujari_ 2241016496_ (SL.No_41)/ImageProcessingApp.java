//Image processing app that manipulates images (resizing, cropping, filter, applying filing).

import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ImageProcessingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String imagePath = "";
        BufferedImage image = null;

        while (true) {
            System.out.println("Image Processing Application");
            System.out.println("1. Load Image");
            System.out.println("2. Resize Image");
            System.out.println("3. Crop Image");
            System.out.println("4. Apply Filter (Grayscale)");
            System.out.println("5. Save Image");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter the path of the image: ");
                        imagePath = scanner.nextLine();
                        image = loadImage(imagePath);
                        System.out.println("Image loaded successfully.");
                        break;
                    case 2:
                        if (image == null) {
                            System.out.println("Load an image first.");
                            break;
                        }
                        System.out.print("Enter new width: ");
                        int width = scanner.nextInt();
                        System.out.print("Enter new height: ");
                        int height = scanner.nextInt();
                        image = resizeImage(image, width, height);
                        System.out.println("Image resized successfully.");
                        break;
                    case 3:
                        if (image == null) {
                            System.out.println("Load an image first.");
                            break;
                        }
                        System.out.print("Enter x coordinate: ");
                        int x = scanner.nextInt();
                        System.out.print("Enter y coordinate: ");
                        int y = scanner.nextInt();
                        System.out.print("Enter width: ");
                        int cropWidth = scanner.nextInt();
                        System.out.print("Enter height: ");
                        int cropHeight = scanner.nextInt();
                        image = cropImage(image, x, y, cropWidth, cropHeight);
                        System.out.println("Image cropped successfully.");
                        break;
                    case 4:
                        if (image == null) {
                            System.out.println("Load an image first.");
                            break;
                        }
                        image = applyGrayscaleFilter(image);
                        System.out.println("Grayscale filter applied successfully.");
                        break;
                    case 5:
                        if (image == null) {
                            System.out.println("Load an image first.");
                            break;
                        }
                        System.out.print("Enter the path to save the image: ");
                        String savePath = scanner.nextLine();
                        saveImage(image, savePath);
                        System.out.println("Image saved successfully.");
                        break;
                    case 6:
                        System.out.println("Exiting application.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred while processing the image: " + e.getMessage());
            } catch (OutOfMemoryError e) {
                System.out.println("Out of memory: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }

    private static BufferedImage loadImage(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            throw new IOException("File not found.");
        }
        BufferedImage image = ImageIO.read(file);
        if (image == null) {
            throw new IOException("Unsupported image format or file is corrupted.");
        }
        return image;
    }

    private static void saveImage(BufferedImage image, String path) throws IOException {
        File file = new File(path);
        String format = "jpg"; // Default format
        int dotIndex = path.lastIndexOf('.');
        if (dotIndex != -1 && dotIndex < path.length() - 1) {
            format = path.substring(dotIndex + 1);
        }
        if (!ImageIO.write(image, format, file)) {
            throw new IOException("Unsupported file format.");
        }
    }

    private static BufferedImage resizeImage(BufferedImage originalImage, int width, int height) {
        Image tempImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resizedImage = new BufferedImage(width, height, originalImage.getType());
        Graphics2D g2d = resizedImage.createGraphics();
        g2d.drawImage(tempImage, 0, 0, null);
        g2d.dispose();
        return resizedImage;
    }

    private static BufferedImage cropImage(BufferedImage originalImage, int x, int y, int width, int height) {
        return originalImage.getSubimage(x, y, width, height);
    }

    private static BufferedImage applyGrayscaleFilter(BufferedImage originalImage) {
        BufferedImage grayscaleImage = new BufferedImage(originalImage.getWidth(), originalImage.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
        Graphics2D g2d = grayscaleImage.createGraphics();
        g2d.drawImage(originalImage, 0, 0, null);
        g2d.dispose();
        return grayscaleImage;
    }
}
