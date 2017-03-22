package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;
import org.usfirst.frc.team6239.robot.commands.ClimbCommand;
import org.usfirst.frc.team6239.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class  Climer_Sub extends Subsystem {

	 public void initDefaultCommand() {
	        // Set the default command for a subsystem here.
	       // setDefaultCommand(new ClimbCommand());
	    	
			
	    }
	 
	 
	 public void Climb(){
	 
		Robot.robotmap.ClimbTalon.set(1);
		 
	 }
	 

	public void Hold(){
	
		
		
		Robot.robotmap.ClimbTalon.set(0.15);
		
	}
	 
}

