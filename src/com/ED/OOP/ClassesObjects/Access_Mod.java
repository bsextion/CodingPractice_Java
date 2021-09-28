package com.ED.OOP.ClassesObjects;

public class Access_Mod {
    public class Cop {
        private int gun;
        public int getGun(){
            return gun;
        }
        protected void fire(){
            System.out.println("shoot!");
        }
    }


    public static void main(String[] args) {
    }
}
