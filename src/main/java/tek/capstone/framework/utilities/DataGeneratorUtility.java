package tek.capstone.framework.utilities;

import net.datafaker.Faker;
public class DataGeneratorUtility {
    public static void main(String[]args) {
        System.out.println(data("firstName"));
        System.out.println(data("lastName"));
        System.out.println(data("email"));
        System.out.println(data("PhoneNumber"));
        System.out.println(data("fullName"));
        System.out.println(data("StreetAddress"));
        System.out.println(data("city"));
        System.out.println(data("state"));
        System.out.println(data("zipCode"));
        System.out.println(data("cardNumber"));
        System.out.println(data("nameOnCard"));
        System.out.println(data("securityCode"));
        System.out.println(data("password"));
        System.out.println(data("expirationYear"));
        System.out.println(data("expirationMonth"));
      
    }
   
	public static String data(String input) {

		Faker faker = new Faker();

		String outPut = "";
		if (input.equals("firstName")) {
			outPut = faker.name().firstName();
		} else if (input.equals("lastName")) {
			outPut = faker.name().lastName();
		} else if (input.equals("email")) {
			outPut = faker.expression("#{letterify '?????@tekschool.us'}");
		} else if (input.equals("PhoneNumber")) {
			outPut = faker.phoneNumber().cellPhone();
		} else if (input.equals("fullName")) {
			outPut = faker.name().name();
		} else if (input.equals("StreetAddress")) {
			outPut = faker.address().streetAddress();
		} else if (input.equals("city")) {
			outPut = faker.address().city();
		} else if (input.equals("state")) {
			outPut = faker.address().state();
		} else if (input.equals("zipCode")) {
			outPut = faker.address().zipCode();
		}else if (input.equals("country")) {
			outPut = "United States";
		}else if(input.equals("apt")) {
			outPut = faker.address().secondaryAddress();
		}else if(input.equals("cardNumber")) {
			outPut = faker.expression("#{numerify '################'}");
		}else if(input.equals("securityCode")) {
			outPut = faker.expression("#{numerify '###'}");
		}else if(input.equals("password")) {
			outPut = faker.expression("#{numerify 'Tek@#######'}");
		} else if (input.equals("expirationYear")) {
			outPut = faker.expression("#{number.number_between '2023','2030'}");
		}else if (input.equals("expirationMonth")) {
			outPut = faker.expression("#{number.number_between '1','12'}");
		}else if (input.equals("nameOnCard")) {
			outPut = faker.name().fullName();
		}
		
		return outPut;
	}
}
