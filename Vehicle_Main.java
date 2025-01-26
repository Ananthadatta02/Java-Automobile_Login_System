package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Vehicle
{
	private String vehicleName;
	private String vehicleBrand;
	private String vehicleColour;
	private double vehicleCost;
	private String engineType;
	
	public Vehicle(String vehicleName, String vehicleBrand, String vehicleColour, double vehicleCost,
			String engineType) 
	{
		this.vehicleName = vehicleName;
		this.vehicleBrand = vehicleBrand;
		this.vehicleColour = vehicleColour;
		this.vehicleCost = vehicleCost;
		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return "Project [vehicleName=" + vehicleName + ", vehicleBrand=" + vehicleBrand + ", vehicleColour="
				+ vehicleColour + ", vehicleCost=" + vehicleCost + ", engineType=" + engineType + "]";
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleBrand() {
		return vehicleBrand;
	}

	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

	public String getVehicleColour() {
		return vehicleColour;
	}

	public void setVehicleColour(String vehicleColour) {
		this.vehicleColour = vehicleColour;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public double getVehicleCost() {
		return vehicleCost;
	}
}


//create a factory class (intermediate class i.e class_name _ factory) 
//               all the logic in this class and called by main class 
class Vehicle_Factory
{
	Scanner s = new Scanner(System.in);
	List<Vehicle> list = new ArrayList<Vehicle>();
	
	public void login()
	{
		System.out.println("Enter the 10 digit Mobile Number..");
		long mobileNumber = s.nextLong();
		if(mobileNumber > 6000000001l && mobileNumber < 9999999991l)
		{
			int generatedOTP = generateOTP();
			System.out.println("Your OTP : " + generatedOTP);
			
			System.out.println("Enter the OTP");
			int enteredOTP = s.nextInt();
			if(enteredOTP == generatedOTP)
			{
				System.out.println("Login Successfull..👍👍");
			}
			else
			{
				System.out.println("Invalid OTP..👎👎");
			}
		}
		else
		{
			System.out.println("Invalid Mobile Number..");
			System.out.println("The Number Must Contain 10 digits..");
		}
	}
	
	public int generateOTP()
	{
		Random random = new Random();
		int otp = random.nextInt(9999); // random.nextInt(1000, 9999);
		return otp;
	}
}

public class Vehicle_Main 
{
	public static void main(String[] args) 
	{
		Vehicle_Factory factory = new Vehicle_Factory();
		
		System.out.println("Welcome....to Automobile services... ");
		System.out.println("Login to the Application");
		factory.login();
	}
}
