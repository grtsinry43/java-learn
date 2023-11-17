package com.grtsinry43.poly_.polyparameter;

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("Tom",2500);
        Manager milan = new Manager("milan", 5000, 2000000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(tom);
        polyParameter.showEmpAnnual(milan);
        polyParameter.testwork(tom);
        polyParameter.testwork(milan);
    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
    public void testwork(Employee e){
        if (e instanceof Worker){
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        }
    }
}
