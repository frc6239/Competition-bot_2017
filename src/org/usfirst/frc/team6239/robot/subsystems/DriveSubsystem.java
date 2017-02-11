
package org.usfirst.frc.team6239.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team6239.robot.Robot;


public class DriveSubsystem extends Subsystem {
    
    private static final int LeftTalon1 = 0;
	private static final double Rightspeed = 0;

	// Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
		
    }
    
    public void tank (double Leftspeed, double Rightspeed){ 

  			   Robot.robotmap.LeftController1.set(Leftspeed);
  			   Robot.robotmap.LeftController2.set(Leftspeed);
  			   Robot.robotmap.RightController1.set(Leftspeed);
  			   Robot.robotmap.RightController2.set(Leftspeed);

   
			
			
    }
    
    public void arcade (double Leftspeed, double Rightspeed){
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
    }}
    

