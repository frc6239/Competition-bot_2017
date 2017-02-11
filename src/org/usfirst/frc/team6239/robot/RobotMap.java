package org.usfirst.frc.team6239.robot;

import org.usfirst.frc.team6239.robot.subsystems.Collector;
import edu.wpi.first.wpilibj.Talon;

// Eli, you can name these things whatever you like
// these are just names to clarify what I am programming
// which is the whole point, come to think of it


public class RobotMap {
	
	public static Talon collectorMotor = new Talon(4);
	
	
	public static int collectorTalon;

	
	Collector collectorSub;
	
	
	
	public RobotMap() {
		
	collectorSub = new Collector();
		
	}	
}
