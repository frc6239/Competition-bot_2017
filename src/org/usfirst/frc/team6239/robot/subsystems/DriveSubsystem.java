
package org.usfirst.frc.team6239.robot.subsystems;
import org.usfirst.frc.team6239.robot.Robot;
import org.usfirst.frc.team6239.robot.commands.DriveCommand;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem {

	boolean joystick = true;
	boolean arcade = true;

	public DriveSubsystem() {

	}


	protected void initDefaultCommand() {
		setDefaultCommand(new DriveCommand());


	}

	public void tank(double Leftspeed, double Rightspeed) {


		Robot.robotmap.LeftController1.set(-Leftspeed*.5);
		Robot.robotmap.LeftController2.set(-Leftspeed*.5);
		Robot.robotmap.RightController1.set(Rightspeed*.5);
		Robot.robotmap.RightController2.set(Rightspeed*.5);


	}

	public void arcade(double Leftspeed, double Rightspeed) {
		if (Rightspeed > 0.0) {
			tank((Leftspeed + Rightspeed),-(Leftspeed + Rightspeed));

		} else {

			if (Rightspeed < 0.0) {
				tank((Rightspeed - Leftspeed),(Leftspeed + Math.abs(Rightspeed)));

			} else {
				tank(Leftspeed,Leftspeed);
			}
		}
	}

/*
	public void DriveRobot(double Leftspeed, double Rightspeed) {


		if (joystick = true) {

			if (arcade = true) {
				arcade(Leftspeed,Rightspeed);
			} else {

			tank(Leftspeed,Rightspeed);

			}

		} else {

			if (arcade = true) {

			arcade(Leftspeed,Rightspeed);

			} else {

			tank(Leftspeed,Rightspeed);
			}

		}

	}
*/

}



    







