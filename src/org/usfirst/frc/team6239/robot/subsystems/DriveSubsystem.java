
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


		Robot.robotmap.LeftController1.set(-Leftspeed*.8);
		Robot.robotmap.LeftController2.set(-Leftspeed*.8);
		Robot.robotmap.RightController1.set(Rightspeed*.8);
		Robot.robotmap.RightController2.set(Rightspeed*.8);


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

	private double initialRotation;
	public void setInitialRotation(double initRot){this.initialRotation= initRot;}
	public double getInitialRotation(){
		return this.initialRotation;
	}
	public boolean AutoDriveCheck(double rotations){
		if((Robot.oi.EncoderValue() - getInitialDegree())>= rotations){

return true;

		}
return false;

	}


private double initialDegree;
public void setInitialDegree(double initialDeg){this.initialDegree = initialDeg;}
public double getInitialDegree(){ return this.initialDegree;}

private boolean isDone;
public void setIsDone(boolean done){this.isDone = done;}
public boolean getIsDone(){return this.isDone;}
public void TurnRobot(double degrees, double direction){
		if(Robot.oi.ahrs.getRawAccelX() - getInitialDegree() >= degrees){
		    if (direction >0){
		        tank(1,-1);

            }else {
		        tank(-1,1);
            }



        }else{setIsDone(true);}
        	


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



    







