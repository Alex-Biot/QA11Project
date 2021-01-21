package com.ilcarro.qa11;

import org.testng.annotations.Test;

public class AddCarTest extends TestBase {

//    @BeforeMethod
//    public void ensurePreconditions() {
//        if(!userLoggedIn()){
//            loIn();
//        }
//    }

    @Test
    public void testFormLetTheCarWorkForLoggedInUser() throws InterruptedException {
        if(!app.getUser().userLoggedIn()){
            app.getUser().logIn();
        }
        app.getUser().pause(2000);
        app.getHeader().openAddCarFormFromHeader();

        app.getCar().fillCarForm(new Car().withCountry("Israel").withAddress("Balfour Street")
                .withDistanceIncluded("500").withSerialNumber("12345671").withBrand("Volkswagen")
                .withModel("Bora").withYear("2002").withEngine("V8").withFuelConsumption("8")
                .withFuel("petrol").withTransmition("automatic").withWd("wedfrt").withWd("110")
                .withHorsepower("3456").withTorque("110").withDoors("5").withSeats("4").withCarClass("A")
                .withAbout("dkjfpsodfj").withType_feature("sdkjf").withPrice("87"));

        app.getHeader().submitForm();
    }

    @Test
    public void negativeTestAddCarWithoutDoors() throws InterruptedException {
        if(!app.getUser().userLoggedIn()){
            app.getUser().logIn();
        }
        app.getUser().pause(2000);
        app.getHeader().openAddCarFormFromHeader();

        app.getCar().fillCarForm(new Car().withCountry("Israel").withAddress("Balfour Street")
                .withDistanceIncluded("500").withSerialNumber("12345671").withBrand("Volkswagen")
                .withModel("Bora").withYear("2002").withEngine("V8").withFuelConsumption("8")
                .withFuel("petrol").withTransmition("automatic").withWd("wedfrt").withWd("110")
                .withHorsepower("3456").withTorque("100").withSeats("4").withCarClass("A")
                .withAbout("dkjfpsodfj").withType_feature("sdkjf").withPrice("87"));

        app.getCar().submitForm();
    }

    @Test
    public void testFormLetTheCarWorkForNotLoggedInUser() throws InterruptedException {

        app.getHeader().openAddCarFormFromHeader();

        app.getCar().fillCarForm(new Car().withCountry("Israel").withAddress("Balfour Street")
                .withDistanceIncluded("500").withSerialNumber("12345671").withBrand("Volkswagen")
                .withModel("Bora").withYear("2002").withEngine("V8").withFuelConsumption("8")
                .withFuel("petrol").withTransmition("automatic").withWd("wedfrt").withWd("110")
                .withHorsepower("3456").withTorque("100").withDoors("5").withSeats("4").withCarClass("A")
                .withAbout("dkjfpsodfj").withType_feature("sdkjf").withPrice("87"));

        app.getCar().submitForm();
    }

}
