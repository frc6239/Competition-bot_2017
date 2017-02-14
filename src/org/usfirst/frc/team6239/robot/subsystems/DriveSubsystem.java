
package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;
import org.usfirst.frc.team6239.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem {
    	
	
	
	
	public DriveSubsystem() {
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveCommand());
    	
		
    }
    
    public void tank (double Leftspeed, double Rightspeed){ 

    	

        Robot.robotmap.LeftController1.set(Leftspeed);
        Robot.robotmap.LeftController2.set(Leftspeed);
  		Robot.robotmap.RightController1.set(Rightspeed);
  		Robot.robotmap.RightController2.set(Rightspeed);

   
			
			
    }
    
    public void arcade (double Leftspeed, double Rightspeed) {
    	 if(Rightspeed > 0.0){
	 		 
	 		   Robot.robotmap.LeftController1.set(Leftspeed + Rightspeed);
	 		   Robot.robotmap.LeftController2.set(Leftspeed + Rightspeed);
	 		   Robot.robotmap.RightController1.set(-(Leftspeed + Rightspeed));
	 		   Robot.robotmap.RightController2.set(-(Leftspeed + Rightspeed));
	 	   
	 	   }else{
	 	   
	 	   if(Rightspeed < 0.0){
	 		
	 		   Robot.robotmap.LeftController1.set(Rightspeed - Leftspeed);
	 		   Robot.robotmap.LeftController2.set(Rightspeed - Leftspeed);
	 		   Robot.robotmap.RightController1.set(Leftspeed + Math.abs(Rightspeed));
	 		   Robot.robotmap.RightController2.set(Leftspeed + Math.abs(Rightspeed)); 
	 		   
	 	   }else{
	 	   
	 	   Robot.robotmap.LeftController1.set(Leftspeed);
	 	   Robot.robotmap.LeftController2.set(Leftspeed);
	 	   Robot.robotmap.RightController1.set(Leftspeed);
	 	   Robot.robotmap.RightController2.set(Leftspeed);
	 	   
	 	   }
	 }
}
    public void TurnLeft(double Leftspeed, double Rightspeed) {
    	tank(-Leftspeed, Rightspeed);
    	
    }
    
    public void TurnRight(double Leftspeed, double Rightspeed) {
    	tank(Leftspeed, -Rightspeed);
    }
}
    







