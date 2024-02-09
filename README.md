# ShapeFactoryArrayList

## Overview

The `ShapeFactoryArrayList` class implements the `ShapeFactory` and `ShapeFactoryFileIO` interfaces, providing functionality to manage a collection of shapes. The shapes are stored in an `ArrayList<Shape>`.

## Features

- **Add Shape:** Add a new shape to the factory.
- **Sum Perimeters and Areas:** Calculate the sum of perimeters and areas for all shapes in the factory.
- **Count Shape:** Count the occurrences of a specific shape type in the factory.
- **Print Shape Factory:** Display information about all shapes in the factory.
- **Factory Shake-Up:** Shuffle the order of shapes in the factory.
- **Load and Save Shape Factory:** Load shapes from a file or save the current state of the factory to a file.

## How to Use

1. **Create a ShapeFactoryArrayList instance:**

    ```java
    ShapeFactoryArrayList shapeFactory = new ShapeFactoryArrayList();
    ```

2. **Add Shapes:**

    ```java
    shapeFactory.addShape(new Circle(ShapeType.CIRCLE, radius));
    // Add more shapes as needed
    ```

3. **Perform Operations:**

    ```java
    double totalPerimeter = shapeFactory.sumPerimeters();
    double totalArea = shapeFactory.sumAreas();
    int circleCount = shapeFactory.countShape(ShapeType.CIRCLE);
    // Add more operations as needed
    ```

4. **Print Information:**

    ```java
    shapeFactory.printShapeFactory();
    ```

5. **Shuffle the Factory:**

    ```java
    shapeFactory.factoryShakeUp();
    ```

6. **Load and Save from/to File:**

    ```java
    // Load shapes from a file
    shapeFactory.loadShapeFactory("input.txt");
    
    // Save shapes to a file
    shapeFactory.saveShapeFactory("output.txt");
    ```

## ShapeLoader

The `ShapeLoader` class is also included, providing a method to load shapes from a file into a `ShapeFactory` instance. However, it seems there might be a mix-up in the provided code, as there is a duplicate section. Please ensure that the correct version of `ShapeLoader` is used.

## Note

- Ensure that the necessary shape classes (e.g., `Circle`, `Square`, `Rectangle`) are properly implemented and available in the project.
- The `BasicFileIO` class is referenced for file input/output operations, and its methods should be implemented accordingly.

Feel free to adapt and extend this code based on your specific requirements.
