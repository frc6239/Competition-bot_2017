package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.RobotMap;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Collector extends Subsystem {
	    
	Talon collectorMotor;
	
	public void Collector(){
		collectorMotor = RobotMap.collectorMotor;
	}

	public void initDefaultCommand() {
		
    }
    
    public void start(){
    	// I leave it to you, Eli, to set the speed
    }
    
    public void stop(){
    	collectorMotor.set(0);
    }
    
}

