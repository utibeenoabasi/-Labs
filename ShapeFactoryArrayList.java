import java.util.ArrayList;
import java.util.Collections;
public class ShapeFactoryArrayList implements ShapeFactory, ShapeFactoryFileIO {

   //ArrayList<Shape> shapeObj = new ArrayList<>();
   private ArrayList<Shape> shapeObj;
   
   public ShapeFactoryArrayList(){
      this.shapeObj = new ArrayList<>();
   
   }
   public double sumPerimeters(){
      double sum = 0.0;
     
      for(Shape shape : shapeObj){
         sum += shape.perimeter();
      
      }
      return sum;
   }
   public double sumAreas(){
      double sumA = 0.0;
     
      for(Shape shape : shapeObj){
         sumA += shape.area();
      
      
      }
      return sumA;
   }
   
   public int countShape(ShapeType type){
   
      int count = 0;
      for (Shape shape : shapeObj) {
         if (shape.getType() == type) {
            count++;
         }
      }
      return count;
   }

   @Override
    public void addShape(Shape shape) {
      shapeObj.add(shape);
   }

   @Override
    public void printShapeFactory() {
      for (Shape shape : shapeObj) {
         System.out.println(shape);
      }
   }

   @Override
    public void factoryShakeUp() {
      if(shapeObj != null && shapeObj.size() > 0){
         Collections.shuffle(shapeObj);
      } 
   }
   
   @Override
    public void loadShapeFactory(String fileName) {
      ArrayList<String> lines = BasicFileIO.readFile(fileName);
   
      for (String line : lines) {
         String[] parts = line.split("\\s+");
      
         if (parts.length > 0) {
            String shapeType = parts[0];
            switch (shapeType) {
               case "CIRCLE":
                  this.addShape(new Circle(ShapeType.CIRCLE,Double.parseDouble(parts[1])));
                  break;
               case "SQUARE":
                  this.addShape(new Square(ShapeType.SQUARE,Double.parseDouble(parts[1])));
                  break;
               case "RECTANGLE":
                  this.addShape(new Rectangle(ShapeType.RECTANGLE,Double.parseDouble(parts[1]), Double.parseDouble(parts[2])));
                  break;
                    // Add more cases for other shape types as needed
            }
         }
      }
   }

   @Override
    public void saveShapeFactory(String fileName) {
        
      ArrayList<String> shapeDataList = new ArrayList<>();
   
      for (Shape shape : shapeObj) {
         String shapeData = shape.toString(); 
         shapeDataList.add(shapeData);
      }
   
      BasicFileIO.writeFile(fileName, shapeDataList);
   }
 
     
   public String toString(){
      System.out.println("Shapes in the Factory\n ---------------------");
      if(shapeObj.size() == 0){
         return "Factory is empty";
      }else{
         String result = "";
         for (Shape shape : shapeObj) {
            //esult += shape.toString() + "\n";
            result += shape.toString() + "\n" ; 
         }
         return result;
      }
   }
}
     
       
        
/**


public class ShapeLoader {
    public ShapeFactory loadShapeFactory(String fileName) {
        ShapeFactory shapeFactory = new ShapeFactory();
        ArrayList<String> lines = readFileLines(fileName, shapeFactory);

        for (String line : lines) {
            String[] parts = line.split("\\s+");

            if (parts.length > 0) {
                String shapeType = parts[0];
                switch (shapeType) {
                    case "Circle":
                        // Assuming Circle data follows, add logic to create Circle
                        // shapeFactory.addShape(new Circle(...));
                        break;
                    case "Rectangle":
                        // Assuming Rectangle data follows, add logic to create Rectangle
                        // shapeFactory.addShape(new Rectangle(...));
                        break;
                    // Add more cases for other shape types as needed
                }
            }
        }

        return shapeFactory;
    }
import java.util.ArrayList;

public class ShapeFactoryArrayList implements ShapeFactory, ShapeFactoryFileIO {

    private ArrayList<Shape> shapes; // Assuming you have a list to store shapes

    public ShapeFactoryArrayList() {
        this.shapes = new ArrayList<>();
    }

    @Override
    public void addShape(Shape shape) {
        // Implement adding shape to the factory
        shapes.add(shape);
    }

    @Override
    public Shape getShape(int index) {
        // Implement getting shape from the factory
        if (index >= 0 && index < shapes.size()) {
            return shapes.get(index);
        } else {
            return null; // Or throw an exception, handle as appropriate
        }
    }

    @Override
    public int size() {
        // Implement getting the size of the factory
        return shapes.size();
    }

    @Override
    public void loadShapeFactory(String fileName) {
        // Implement loading shape data into the factory from the filename
        // Use BasicFileIO class methods to help here
        ArrayList<String> lines = BasicFileIO.readFileLines(fileName);

        for (String line : lines) {
            String[] parts = line.split("\\s+");

            if (parts.length > 0) {
                String shapeType = parts[0];
                switch (shapeType) {
                    case "CIRCLE":
                        // Assuming Circle data follows, add logic to create Circle
                        // shapes.add(new Circle(Double.parseDouble(parts[1])));
                        break;
                    case "SQUARE":
                        // Assuming Square data follows, add logic to create Square
                        // shapes.add(new Square(Double.parseDouble(parts[1])));
                        break;
                    case "RECTANGLE":
                        // Assuming Rectangle data follows, add logic to create Rectangle
                        // shapes.add(new Rectangle(Double.parseDouble(parts[1]), Double.parseDouble(parts[2])));
                        break;
                    // Add more cases for other shape types as needed
                }
            }
        }
    }

    @Override
    public void saveShapeFactory(String fileName) {
        // Implement saving shape data from the factory to the filename
        // Use BasicFileIO class methods to help here
        // Iterate through shapes and write their data to the file
        // Example: BasicFileIO.writeFile(fileName, shapeDataList);
    }
}

*/