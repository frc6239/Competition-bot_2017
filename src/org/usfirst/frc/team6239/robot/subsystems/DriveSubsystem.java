
package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;
import org.usfirst.frc.team6239.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class DriveSubsystem extends Subsystem {
    	
	
	public enum DriveConfig {
    	left,
    	right,
    	none
    }
	
	DriveConfig drive_config;
	
	public DriveSubsystem(DriveConfig drive_config) {
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveCommand());
    	
		
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
}
    public void DriveAuto() {
    	
    	System.out.println(NetworkTable.getTable("Robot").getValue("SideChooser", DriveConfig.none));
    	
    }
}
    







