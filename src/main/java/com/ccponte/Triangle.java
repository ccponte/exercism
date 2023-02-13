package com.ccponte;

import java.util.HashSet;
import java.util.Set;

class Triangle {

    private final double side1;
    private final double side2;
    private final double side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {

        //  Validates if all sizes are greater than zero
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new TriangleException();
        }

        //  Validates if the sum of the lengths of any two sides must
        //  be greater than or equal to the length of the third side
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            throw new TriangleException();
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    boolean isEquilateral() {
        return (this.side1 == this.side2 &&
                this.side1 == this.side3);
    }

    boolean isIsosceles() {
        return (this.side1 == this.side2) ||
               (this.side1 == this.side3) ||
               (this.side2 == this.side3);
    }

    boolean isScalene() {
        return (this.side1 != this.side2) &&
               (this.side1 != this.side3) &&
               (this.side2 != this.side3);
    }

}


//  A fascinating solution using Set<Double> to validate the sides of the triangle.
//  This solution was built by Rider Sargent (https://exercism.org/profiles/RiderSargent)
//
//class Triangle {
//
//    private final Set<Double> sides = new HashSet<>();
//
//    Triangle(double side1, double side2, double side3) throws TriangleException {
//
//        //  Validates if all sizes are greater than zero
//        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
//            throw new TriangleException();
//        }
//
//        //  Validates if the sum of the lengths of any two sides must
//        //  be greater than or equal to the length of the third side
//        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
//            throw new TriangleException();
//        }
//
//        sides.add(side1);
//        sides.add(side2);
//        sides.add(side3);
//    }
//
//    boolean isEquilateral() {
//        return sides.size() == 1;
//    }
//
//    boolean isIsosceles() {
//        return sides.size() <= 2;
//    }
//
//    boolean isScalene() {
//        return sides.size() == 3;
//    }
//
//}
