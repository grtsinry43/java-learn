package com.grtsinry43.poly_.polyarr_;

public class PloyArray {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("jack",20);
        people[1] = new Student("mary",18,60);
        people[2] = new Student("smith",19,100);
        people[3] = new Teacher("scott",30,20000);
        people[4] = new Teacher("king",50,25000);
        for (int i = 0; i < people.length; i++) {
            //编译类型是Person，运行类型由new的类决定
            System.out.println(people[i].say());
            if (people[i] instanceof Student){
                ((Student) people[i]).study();
            } else if (people[i] instanceof Teacher){
                ((Teacher) people[i]).teach();
            }
        }

    }
}
