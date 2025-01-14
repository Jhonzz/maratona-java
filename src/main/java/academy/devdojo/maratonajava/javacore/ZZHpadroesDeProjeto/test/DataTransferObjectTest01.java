package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = Person
                .PersonBuilder
                .builder()
                .firstName("Jhon")
                .lastName(" Pablo")
                .build();

        ReportDto build = ReportDto.ReportDtoBuilder.builder().
                aircraftName(aircraft.getName()).
                country(country).
                currency(currency).
                personName(person.getFirstName() + " " + person.getLastName()).build();

        System.out.println(build);
    }

}
