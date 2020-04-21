package com.proof.concept.generics.substitution;

import java.util.ArrayList;
import java.util.List;

/***
 * Substitution principle and Wildcards
 */
public class Main {

    public static void main(String[] args) {
        Building building = new Building();
        Office office = new Office();
        build(building);
        build(office);

        List<Building> buildingList1 = new ArrayList<>();
        buildingList1.add(new Building());
        buildingList1.add(new Office()); // -> Subtype of Building, Substitution principle applies
        printBuilding(buildingList1);

        List<Office> buildingList2 = new ArrayList<>();
        buildingList2.add(new Office());
        buildingList2.add(new Office());
        printBuilding(buildingList2);// -> Substitution principle does not apply, in that case I need a wildcard

        addHouseToList(buildingList2);
        addHouseToList(buildingList1);
    }

    static void build(Building building){
        System.out.println("Message" + building.toString());
    }

    static void printBuilding(List<? extends Building> buildingList) {
        for (int i = 0; i < buildingList.size(); i++) {
            System.out.println(i+1 + ":" + buildingList.get(i).toString());
        }
    }

    static void addHouseToList(List<? super Office> offices) {
        offices.add(new Office());
        System.out.println(offices);
    }
}
