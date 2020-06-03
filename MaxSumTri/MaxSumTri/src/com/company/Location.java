package com.company;

public class Location {

        public int x; // x coordinate of number
        public int y; // y coordinate of number
        public int number; // number

        public Location(int x, int y, int number) {
            this.x = x;
            this.y = y;
            this.number = number;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getNumber() {
            return number;
        }
    }
