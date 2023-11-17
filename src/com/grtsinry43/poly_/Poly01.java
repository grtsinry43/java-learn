package com.grtsinry43.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master jack = new Master("jack");
        Dog dog = new Dog("132");
        Bone bone = new Bone("567");
        jack.feed(dog,bone);

        Cat cat = new Cat("000");
        Fish fish = new Fish("111");
        jack.feed(cat,fish);
    }
}
